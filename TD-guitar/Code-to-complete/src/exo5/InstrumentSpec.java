package exo5;

import java.util.Objects;

public abstract class InstrumentSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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
	
	public boolean matches(InstrumentSpec otherSpec) {
		boolean filterBack = true;
		boolean filterTop = true;
		boolean filterType = true;
		boolean filterModel = true;
		boolean filterBuilder = true;
		
		filterBack = (!isFilter(otherSpec.getBackWood()) || Objects.equals(getBackWood(), otherSpec.getBackWood()));
		filterTop = (!isFilter(otherSpec.getTopWood()) || Objects.equals(getTopWood(), otherSpec.getTopWood()));
		filterType = (!isFilter(otherSpec.getType()) || Objects.equals(getType(), otherSpec.getType()));
		filterModel = (!isFilter(otherSpec.getModel()) || Objects.equals(getModel(), otherSpec.getModel()));
		filterBuilder = (!isFilter(otherSpec.getBuilder()) || Objects.equals(getBuilder(), otherSpec.getBuilder()));
		
		return filterBack && filterBuilder && filterModel && filterTop && filterType;
	}
	
	private boolean isFilter(Object value) {
		return Objects.nonNull(value) && !"".equals(value.toString());
	}
	
	
}
