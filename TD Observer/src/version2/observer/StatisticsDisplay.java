package version2.observer;

import java.util.Observable;
import java.util.Observer;

import version2.weather.WeatherData;

public class StatisticsDisplay implements Observer{
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Observable observable;
	
	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData w = (WeatherData) o;
			float temp = w.getTemperature();
			tempSum += temp;
			numReadings++;
	
			if (temp > maxTemp) {
				maxTemp = temp;
			}
	 
			if (temp < minTemp) {
				minTemp = temp;
			}
		}
		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}

	

}
