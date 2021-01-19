package com.bk.menu;

import java.util.List;

public interface MenuDAO {

    // 모든 메뉴를 가져와야한다.
    List<Menu> getAllMenus() throws Exception;

}
