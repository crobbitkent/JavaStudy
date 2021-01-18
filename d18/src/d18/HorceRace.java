package d18;

import java.util.ArrayList;
import java.util.List;

public class HorceRace {
	
	public static void main(String[] args) {
		List<Horce> arr = new ArrayList<Horce>();
		
		for(int i = 0; i < 10; ++i) {
			arr.add(new Horce((i+1) + "번마"));
		}
		
		for(Horce horce : arr) {			
			horce.start();
		}
		
//		for(Horce horce : arr) {			
//			System.out.println(horce);
//		}
//		
		System.out.println("OVER");
	}
}
