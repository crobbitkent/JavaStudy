package com.bk.menu;

import lombok.Data;

@Data
public class UpgradeMenu extends Menu{

    private double extra; // 업그레이트 추가 가격
    private Menu nextMenu; // 업그레이드할 메뉴

}
