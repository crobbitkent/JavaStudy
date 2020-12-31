package org.weather.service;

import java.util.Arrays;

import org.weather.domain.WeatherData;

// logic object
public class WeatherService {
	//============================FIELD================================//
	WeatherData[] weatherArray;
	
	
	//============================CONSTRUCTOR================================//
	// DI + 생성자 제한
		public WeatherService() {
			super();
		}
		
	// DI + 생성자 제한
	public WeatherService(WeatherData[] weatherArray) {
		super();
		this.weatherArray = weatherArray;
	}

	
	@Override
	public String toString() {
		return "WeatherService [weatherArray=" + Arrays.toString(weatherArray) + "]";
	}
	
	
	
	
	
	//============================METHOD================================//
	// 가장 높은 온도의 날짜 구하기
	public WeatherData getHighestTemperature() {	
		Arrays.sort(weatherArray, (a,b)->a.getMaxTemperature() - b.getMaxTemperature() > 0 ? -1:1);
		
		return weatherArray[0];
	}
	
	// 가장 일교차가 큰 날
	public WeatherData getHighestGap() {	
		Arrays.sort(weatherArray, (a,b)->a.getTempGap() - b.getTempGap() > 0 ? -1:1);
		
		return weatherArray[0];
	}
	
	// 특정한 날짜의 강수량
	public WeatherData getWeatherByDate(int date) {
		Arrays.sort(weatherArray, (a,b)->a.getDate() - b.getDate() > 0 ? 1:-1);
		
		return weatherArray[date-1];
	}
	
	
	
}
