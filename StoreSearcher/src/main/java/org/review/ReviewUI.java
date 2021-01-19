package org.review;

import lombok.Setter;
import org.common.BaseUI;
import org.store.Store;
import org.store.StoreService;
import org.store.StoreUI;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

@Setter
public class ReviewUI extends BaseUI {

    private StoreService storeService;
    private ReviewService reviewService;
    private StoreUI storeUI;

    public ReviewUI(Scanner scanner){
        super(scanner);
    }


    //=============================================
    @Override
    public void show() throws Exception {
        System.out.println("===== 메뉴를 선택하세요. =====");
        int oper = inputInt("1. 리뷰 등록   2. 리뷰 조회");

        switch(oper){
            case 1:
                register();
                break;
            case 2:
                view();
                break;
            case -1:
                System.out.println("프로그램이 종료됩니다...");
                return;
            default:
                System.out.println("명령어를 잘못 입력하였습니다.");
                break;
        }

        show();
    }

    private void register(){
        print("===== 리뷰 등록 =====");
        // 가게 이름을 입력
        String storeName = inputStr("가게 이름을 입력하세요.");
        Store store = storeService.findByName(storeName);

        if(null == store){
            store = storeUI.makeStore();
        }

        System.out.println(store);

        String contents = inputStr("맛집이 어땠는지 알려주세요!");
        double score = inputDouble("점수를 숫자로 입력해주세요! (최대 5)");


        // String date = LocalDateTime.now();

        Review review = Review.builder().reviewCode("R1").contents(contents).score(score).store(store).build();

        try{
            reviewService.register(review);
        } catch(Exception e){
            e.printStackTrace();
        }

        print(review);
        print("===== 리뷰 등록이 완료되었습니다. =====");
    }

    private void view(){
        print("===== 리뷰 조회 =====");
        String menuName = inputStr("메뉴 이름을 입력하세요.");
        List<Store> storeList = storeService.findByMenu(menuName);

        storeList.forEach(store->print(store));

        int index = inputInt("몇 번째 가게인가요?") - 1;
        Store store = storeList.get(index);

        List<Review> reviewList = reviewService.getAllReviews(store);

        reviewList.forEach(review -> print(review));
    }
}
