package dipExo5;

public class Main {

	public static void main(String[] args) {
		
		Manager loris = new Manager();
		Worker lambda = new Worker();
		SuperWorker lucas = new SuperWorker();
		loris.setWorker(lambda);
		loris.manage();
		loris.setWorker(lucas);
		loris.manage();

	}

}
