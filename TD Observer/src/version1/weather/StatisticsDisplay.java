package version1.weather;

public class StatisticsDisplay implements Display,Observer {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Subject subject;
	
	public StatisticsDisplay(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void actualise(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}
		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}

}
