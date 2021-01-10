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
			result += " ��Ʈ";
			break;
		case large :
			result += " ���� ��Ʈ";
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
