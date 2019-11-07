package version2.observer;

import java.util.Observable;
import java.util.Observer;

import version2.weather.WeatherData;

public class CurrentConditionsDisplay implements Observer {
	private float temperature;
	private float humidity;
	private Observable observable;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData w = (WeatherData) o;
			this.temperature = w.getTemperature();
			this.humidity = w.getHumidity();
		}
		display();	
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}

	
}
