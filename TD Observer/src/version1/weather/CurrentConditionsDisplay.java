package version1.weather;

public class CurrentConditionsDisplay implements Display,Observer {
	private float temperature;
	private float humidity;
	private Subject subject;
	
	public CurrentConditionsDisplay(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}
	
	@Override
	public void actualise(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
