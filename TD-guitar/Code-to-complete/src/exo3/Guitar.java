package exo3;

public class Guitar {

	private GuitarSpec guitarSpec;
	private String serialNumber;
	private double price;
	
	public Guitar(String serialNumber,double price,Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}
	
	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = true;
		if (obj instanceof Guitar) {
			Guitar currentGuitar = (Guitar)obj;
			GuitarSpec currentSpec = currentGuitar.getGuitarSpec();
			equals = currentSpec.getBackWood().equals(this.guitarSpec.getBackWood()) &&
					currentSpec.getBuilder().equals(this.guitarSpec.getBuilder()) &&
					currentSpec.getTopWood().equals(this.guitarSpec.getTopWood()) &&
					currentSpec.getModel().equalsIgnoreCase(this.guitarSpec.getModel());
		}
		return equals;
	}
	
	

}
