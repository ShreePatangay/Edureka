package entity;

public class MobilePhone {
	private String name;
	private float price;
	private String colour;

	public MobilePhone() {

	}

	public MobilePhone(float price, String colour) {
		super();
		this.price = price;
		this.colour = colour;
	}

	public MobilePhone(String name, float price, String colour) {
		super();
		this.name = name;
		this.price = price;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "MobilePhone [name=" + name + ", price=" + price + ", colour=" + colour + "]";
	}

}
