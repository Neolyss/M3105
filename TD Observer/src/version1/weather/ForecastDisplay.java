package version1.weather;

public class ForecastDisplay implements Display,Observer {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Subject subject;

	public ForecastDisplay(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void actualise(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
		currentPressure = pressure;
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
