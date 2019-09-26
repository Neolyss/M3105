package exo5;

public abstract class Instrument {
	private String serialNumber;
	private double price;
	private InstrumentSpec instrumentSpec;
	
	public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.instrumentSpec = instrumentSpec;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double prix) {
		this.price = prix;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public InstrumentSpec getInstrumentSpec() {
		return instrumentSpec;
	}
	
}
