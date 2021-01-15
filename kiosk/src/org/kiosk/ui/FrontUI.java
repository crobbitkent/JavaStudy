package org.kiosk.ui;

import java.util.List;
import java.util.Scanner;

import lombok.AllArgsConstructor;


public class FrontUI extends BaseUI {

	List<BaseUI> uiList;
	
	
	public FrontUI(Scanner scanner, List<BaseUI> uiList) {
		super(scanner);
		this.uiList = uiList;
	}

    // uiList의 모든 UI를 보여준다.
	private void runClient()throws Exception {
		
		for (BaseUI baseUI : uiList) {
			
			baseUI.show();
		}//end for
		
	}

	// 보여주는 메서드
	@Override
	public void show() throws Exception {
	
		while(true) {
			
			runClient();
			
			if(inputStr("===========ENTER OR QUIT=================").equals("QUIT")) {
				break;
			}
		}
		
	}
	
}
