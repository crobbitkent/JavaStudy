package com.bk.order;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Order {

    private int orderNumber;
    private List<OrderItem> itemList;
    // 날짜

    public void addItem(OrderItem item){
        // 최초 생성
        if(null == itemList){
            itemList = new ArrayList<>();
        }

        // 찾아서 있으면 수량을 올려준다.
        // for문 돌면서 찾는다?

        // 없으면 그냥 넣는다.
        itemList.add(item);
    }

}
