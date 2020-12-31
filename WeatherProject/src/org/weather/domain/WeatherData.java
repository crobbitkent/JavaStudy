package org.weather.domain;




// data transfer object
public class WeatherData {
	
	//============================FIELD================================//
	int date;
	double minTemperature;
	double maxTemperature;
	int rainAmount;
	
	
	//============================CONSTRUCTOR================================//
	public WeatherData(int date, double maxTemperature, double minTemperature, int rainAmount) {
		super();
		this.date = date;
		this.minTemperature = minTemperature;
		this.maxTemperature = maxTemperature;
		this.rainAmount = rainAmount;
	}
	
	
	public WeatherData(int date, double maxTemperature, double minTemperature) {
		// System.out.println("Hello, Weather!");
		// 위가 불가능한 이유는 생성자 위에 로직을 넣지 마라...
		this(date, minTemperature, maxTemperature, 0);
	}

	
	@Override
	public String toString() {
		return "WeatherData [date=" + date + ", minTemperature=" + minTemperature + ", maxTemperature=" + maxTemperature
				+ ", rainAmount=" + rainAmount + "]";
	}



	//============================METHOD================================//
	
	
	//============================GETTER & SETTER================================//
	
	public int getTempGap() {
		return (int)(maxTemperature - minTemperature);
	}
	
	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}


	public double getMinTemperature() {
		return minTemperature;
	}


	public void setMinTemperature(double minTemperature) {
		this.minTemperature = minTemperature;
	}


	public double getMaxTemperature() {
		return maxTemperature;
	}


	public void setMaxTemperature(double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}


	public int getRainAmount() {
		return rainAmount;
	}


	public void setRainAmount(int rainAmount) {
		this.rainAmount = rainAmount;
	}
	
}
