package org.store;

import java.util.ArrayList;
import java.util.List;

public class StoreService {


    public Store findByName(String storeName) {
        // test
        List<String> menu = new ArrayList<>();
        menu.add("시노기 라멘");
        menu.add("얼큰 라멘");
        Store result = Store.builder().storeCode("S1").name("멘야시노기").menu(menu).build();

        return null;
    }

    public List<Store> findByMenu(String menuName){

        List<Store> storeList = new ArrayList<>();

        List<String> menu = new ArrayList<>();
        menu.add("내장국밥");
        menu.add("얼큰국밥");
        menu.add("순대국");

        List<String> menu2 = new ArrayList<>();
        menu2.add("클럽 샌드위치");
        menu2.add("에그 샌드위치");
        menu2.add("풀포크 샌드위");

        Store s1 = Store.builder().menu(menu).name("이모국밥").storeCode("M3").build();
        Store s2 = Store.builder().menu(menu2).name("서브웨이").storeCode("M4").build();

        storeList.add(s1);
        storeList.add(s2);

        return storeList;
    }

}
