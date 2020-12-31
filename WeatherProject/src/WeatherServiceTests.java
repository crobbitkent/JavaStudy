import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.weather.domain.WeatherData;
import org.weather.service.WeatherService;

class WeatherServiceTests {

	WeatherService service;

	
	@BeforeEach
	void setup() throws Exception{
		// 2020년 8월
		WeatherData[] arr = new WeatherData[31];	
		arr[0] = new WeatherData(1,38, 23, 0);
		arr[1] = new WeatherData(2,37, 25, 0);
		arr[2] = new WeatherData(3,37, 26, 0);
		arr[3] = new WeatherData(4,35, 26, 0);
		arr[4] = new WeatherData(5,35, 26, 0);
		arr[5] = new WeatherData(6,35, 26, 0);
		arr[6] = new WeatherData(7,35, 24, 0);
		arr[7] = new WeatherData(8,33, 23, 48);
		arr[8] = new WeatherData(9,32, 24, 0);
		arr[9] = new WeatherData(10,34, 24, 0);
		arr[10] = new WeatherData(11,35, 21, 0);
		arr[11] = new WeatherData(12,34, 23, 2);
		arr[12] = new WeatherData(13,34, 24, 27);
		arr[13] = new WeatherData(14,34, 24, 0);
		arr[14] = new WeatherData(15,36, 24, 0);
		arr[15] = new WeatherData(16,32, 20, 0);
		arr[16] = new WeatherData(17,30, 17, 0);
		arr[17] = new WeatherData(18,30, 17, 0);
		arr[18] = new WeatherData(19,30, 19, 0);
		arr[19] = new WeatherData(20,30, 19, 0);
		arr[20] = new WeatherData(21,30, 21, 12);
		arr[21] = new WeatherData(22,33, 19, 0);
		arr[22] = new WeatherData(23,27, 23, 2);
		arr[23] = new WeatherData(24,24, 21, 23);
		arr[24] = new WeatherData(25,29, 21, 1);
		arr[25] = new WeatherData(26,30, 17, 0);
		arr[26] = new WeatherData(27,31, 20, 0);
		arr[27] = new WeatherData(28,30, 22, 27);
		arr[28] = new WeatherData(29,23, 20, 384);
		arr[29] = new WeatherData(30,30, 22, 1);
		arr[30] = new WeatherData(31,29, 19, 1);
		
		service = new WeatherService(arr);
	}
	
	// 최고 온도 테스트
	@Test
	void test1() {
		System.out.println(service.getHighestTemperature());
		assertEquals(38, service.getHighestTemperature().getMaxTemperature());
	}
	
	// 최고 일교차 테스트
	@Test
	void test2() {
		System.out.println(service.getHighestGap());
		assertEquals(15, service.getHighestGap().getTempGap());
	}
	
	// 특정 날짜 확인 테스트
	@Test
	void test3() {
		System.out.println(service.getWeatherByDate(31));
		assertEquals(31, service.getWeatherByDate(31).getDate());
	}

}
