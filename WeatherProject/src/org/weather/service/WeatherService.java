package org.weather.service;

import java.util.Arrays;

import org.weather.domain.WeatherData;

// logic object
public class WeatherService {
	//============================FIELD================================//
	WeatherData[] weatherArray;
	
	
	//============================CONSTRUCTOR================================//
	// DI + ������ ����
		public WeatherService() {
			super();
		}
		
	// DI + ������ ����
	public WeatherService(WeatherData[] weatherArray) {
		super();
		this.weatherArray = weatherArray;
	}

	
	@Override
	public String toString() {
		return "WeatherService [weatherArray=" + Arrays.toString(weatherArray) + "]";
	}
	
	
	
	
	
	//============================METHOD================================//
	// ���� ���� �µ��� ��¥ ���ϱ�
	public WeatherData getHighestTemperature() {	
		Arrays.sort(weatherArray, (a,b)->a.getMaxTemperature() - b.getMaxTemperature() > 0 ? -1:1);
		
		return weatherArray[0];
	}
	
	// ���� �ϱ����� ū ��
	public WeatherData getHighestGap() {	
		Arrays.sort(weatherArray, (a,b)->a.getTempGap() - b.getTempGap() > 0 ? -1:1);
		
		return weatherArray[0];
	}
	
	// Ư���� ��¥�� ������
	public WeatherData getWeatherByDate(int date) {
		Arrays.sort(weatherArray, (a,b)->a.getDate() - b.getDate() > 0 ? 1:-1);
		
		return weatherArray[date-1];
	}
	
	
	
}
