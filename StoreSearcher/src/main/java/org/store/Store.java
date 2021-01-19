package org.store;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Store {

    private String storeCode;
    private String name;
    private List<String> menu;
    private String x;
    private String y;

}
