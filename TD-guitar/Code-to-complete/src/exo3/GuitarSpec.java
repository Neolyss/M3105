package exo3;

public class GuitarSpec {
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
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
	
	
}
