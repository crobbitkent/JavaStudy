package org.mcdonald.menu;



public class BurgerMenu extends Menu {
	
	public BurgerMenu(String name, double price, String category, Grade grade) {
		super(name, price, category, grade);

	}

	@Override
	public String getTotalName() {
		String result = this.name;
		
		switch(grade) {
		case medium :
			result += " 세트";
			break;
		case large :
			result += " 라지 세트";
			break;
		}
		
		return result;
	}
	
	public void setUpgradeMenu(BurgerMenu menu) {
		upgradeMenu = menu;
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub		
	}
}
