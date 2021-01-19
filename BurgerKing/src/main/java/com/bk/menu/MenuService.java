package com.bk.menu;

import java.util.List;

public class MenuService {

    private MenuDAO menuDAO;

    // 모든 메뉴를 전달
    public List<Menu> getAllMenus() throws Exception {
        return menuDAO.getAllMenus();
    }



}
