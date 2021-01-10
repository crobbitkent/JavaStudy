package org.mcdonald.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public abstract class Menu implements IUpgradable {
	//=========================FIELD===========================//
	@Getter
	protected String name;
	@Getter
	protected double price;
	@Getter
	protected String category;
	@Getter
	protected Grade grade;
	@Getter
	protected Menu upgradeMenu;
	
	
	public Menu(String name, double price, String category, Grade grade) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.grade = grade;
	}
	
	public void copy(Menu menu) {
		this.name = menu.name;
		this.price = menu.price;
		this.category = menu.category;
	}
	
	public abstract String getTotalName();
	
	@Override
	public void setUpgradeMenu(Menu menu) {
		upgradeMenu = menu;
	}
	
	public Menu getUpgradeMenu() {
		return upgradeMenu;
	}
	
	

}
