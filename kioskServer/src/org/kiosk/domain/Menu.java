package org.kiosk.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Menu {

	private String name;
	private int price;
}
