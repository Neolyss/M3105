package exo2;

public class Guitar {

	private String serialNumber;
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private double price;
	
	public Guitar(String serialNumber,double price,Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.price = price;
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

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean equals = true;
		if (obj instanceof Guitar) {
			Guitar currentGuitar = (Guitar)obj;
			equals = currentGuitar.getBackWood().equals(this.getBackWood()) &&
					currentGuitar.getBuilder().equals(this.getBuilder()) &&
					currentGuitar.getTopWood().equals(this.getTopWood()) &&
					currentGuitar.getModel().equalsIgnoreCase(this.getModel());
		}
		return equals;
	}
	
	

}
