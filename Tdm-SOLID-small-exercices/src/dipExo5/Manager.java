package dipExo5;

public class Manager {
	
	private IWorker worker;

	public Manager() {
		super();
	}

	public void setWorker(IWorker worker) {
		this.worker = worker;
	}

	public IWorker getWorker() {
		return worker;
	}
	
	public void manage() {
		worker.work();
	}
	
}
