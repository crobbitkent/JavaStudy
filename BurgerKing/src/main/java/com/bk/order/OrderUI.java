package com.bk.order;

import com.bk.menu.Menu;
import com.bk.menu.MenuService;

import java.util.List;
import java.util.Scanner;

public class OrderUI extends BaseUI{

    // 얘를 interface로 해도 좋다.
    private OrderService orderService;
    private MenuService menuService;

    OrderUI(Scanner scanner) {
        super(scanner);
    }

    // 주문 시작!!!( = 시나리오 )
    @Override
    public void show() throws Exception {
        // 1. 메뉴 목록 출력
        List<Menu> menus = menuService.getAllMenus();


        // 2. 메뉴 선택


        // 3. 수량 입력

        // 3-1. 업그레이드

        // 4. OrderItem생성 후, Order에 추가

        // 5. 확인

        // 6. 주문하기
    }
}
