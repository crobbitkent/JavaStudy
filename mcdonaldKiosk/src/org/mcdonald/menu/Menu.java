package org.mcdonald.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
public class Menu {
	//=========================FIELD===========================//
	protected String name;
	protected double price;
	protected String category;
	@Setter
	private UpgradableStrategy upgradableStrategy;
	
	
	public Menu(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	
	
	//=========================METHOD==========================//
	public void upgrade() {
		upgradableStrategy.upgrade();
	}
	
	
	

}
