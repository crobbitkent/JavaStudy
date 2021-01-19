package org.common;

import org.review.ReviewService;
import org.review.ReviewUI;
import org.store.StoreService;
import org.store.StoreUI;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        StoreService storeService = new StoreService();
        ReviewService reviewService = new ReviewService();

        StoreUI storeUI = new StoreUI(scanner);
        ReviewUI reviewUI = new ReviewUI(scanner);

        reviewUI.setStoreService(storeService);
        reviewUI.setReviewService(reviewService);
        reviewUI.setStoreUI(storeUI);
        storeUI.setStoreService(storeService);

        try {
            reviewUI.show();
        } catch(Exception e){
            e.printStackTrace();
        }
    }


}
