public class Card {
	// 0=green 1=purple 2=red
	private static final String[] COLOR_NAMES = { "Green", "Purple", "Red" };
	private int color;
	
	// 0=oval 1=squiggly 2=diamond
	private static final String[] SHAPE_NAMES = { "Oval(s)", "Squiggle(s)",
			"Diamond(s)" };
	private int shape;
	
	// 0=clear 1= solid 2=lined
	private static final String[] SHADING_NAMES = { "Clear", "Solid", "Lined" };
	private int shading;
	
	private int number;

	public Card(int color, int shape, int shading, int number) {
		// This is cutting redundant code out.
		// If I didn't call set color here, I would be skipping any validation of the color.
		this.setColor(color);
		this.setShape(shape);
		this.setShading(shading);
		this.setNumber(number);

	}

	public String toString() {
		// % tells it to expect an argument. letter means how you should present
		// whatever the argument is. d= digit s=string
		return String.format("%d %s %s %s", this.number,
				this.getShadingString(), this.getColorString(),
				this.getShapeString());
	}

	private String getColorString() {
		return Card.COLOR_NAMES[this.color];
	}

	private String getShapeString() {
		return Card.SHAPE_NAMES[this.shape];
	}

	private String getShadingString() {
		return Card.SHADING_NAMES[this.shading];
	}

	public int getColor() {
		return this.color;
	}

	public int getShape() {
		return this.shape;
	}

	public int getShading() {
		return this.shading;
	}

	public int getNumber() {
		return this.number;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public void setShape(int shape) {
		this.shape = shape;
	}

	public void setShading(int shading) {
		this.shading = shading;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
