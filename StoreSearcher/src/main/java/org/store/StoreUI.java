package org.store;

import lombok.Setter;
import org.common.BaseUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Setter
public class StoreUI extends BaseUI {

    private StoreService storeService;

    public StoreUI(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void show() throws Exception {

    }

    // 가게를 등록
    public Store makeStore(){

        List<String> menu = new ArrayList<>();
        menu.add("왕돈가스");
        menu.add("치즈 돈가스");

        Store result = Store.builder().storeCode("S2").name("후쿠짱").menu(menu).build();

        return result;
    }
}
