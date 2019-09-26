package exo5;

import java.util.Objects;

public class MandolinSpec extends InstrumentSpec {
	
	private Style style;

	public MandolinSpec(Builder builder, String model,Style style,Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}

	public Style getStyle() {
		return style;
	}

	@Override
	public boolean matches(InstrumentSpec searchInstrumentSpec) {
		boolean filterStyle = true;
		if(searchInstrumentSpec instanceof MandolinSpec) {
			MandolinSpec searchMandolinSpec = (MandolinSpec) searchInstrumentSpec;
			filterStyle = !(Objects.nonNull(searchMandolinSpec.getStyle())) || Objects.equals(style, searchMandolinSpec.getStyle());
		}
		else {
			filterStyle = false;
		}
		return super.matches(searchInstrumentSpec) && filterStyle;
		}
	
}
