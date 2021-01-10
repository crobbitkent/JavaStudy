package org.mcdonald.menu;

public class SideMenu extends Menu implements IUpgradable {


	public SideMenu(String name, double price, String category, Grade grade) {
		super(name, price, category, grade);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public String getTotalName() {
		String result = this.name;
		switch(grade) {
		case small :
			result += " 스몰";
			break;
		case medium :
			result += " 미디엄";
			break;
		case large :
			result += " 라지";
			break;
		}
		
		return result;
	}
	
	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setUpgradeMenu(Menu menu) {
		upgradeMenu = menu;
	}
}
