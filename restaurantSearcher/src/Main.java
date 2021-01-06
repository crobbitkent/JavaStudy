import java.util.Scanner;

import org.restaurant.domain.Restaurant;
import org.restaurant.repository.RestaurantDAO;
import org.restaurant.service.RestaurantService;
import org.restaurant.ui.RestaurantUI;

public class Main {

	public static void main(String[] args) {
		
		Restaurant[] arr = {
				new Restaurant("멘야시노기", 37.503888, 127.020795) ,
				new Restaurant("다시 사랑한다면", 37.4999646, 127.0440272),
				new Restaurant("사이공리", 37.50708072, 126.939729),
				new Restaurant("창신동 매운족발", 37.612990, 127.064718),
				new Restaurant("홍보성", 37.484009, 127.125127),
				new Restaurant("스시야", 37.36327968, 127.106347),
				new Restaurant("불불이족발", 37.456393, 126.899672),
				new Restaurant("영동족발", 37.48477547, 127.0379592)
		};
		
		Scanner scanner = new Scanner(System.in);
		RestaurantDAO dao = new RestaurantDAO(arr);
		RestaurantService service = new RestaurantService(dao);
		RestaurantUI ui = new RestaurantUI(service, scanner);
		
	}
}
