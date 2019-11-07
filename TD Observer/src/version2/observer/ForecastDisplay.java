package version2.observer;

import java.util.Observable;
import java.util.Observer;

import version2.weather.WeatherData;

public class ForecastDisplay implements Observer {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Observable observable;

	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData w = (WeatherData) o;
			lastPressure = currentPressure;
			currentPressure = w.getPressure();
		}
		display();		
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	
	
}
