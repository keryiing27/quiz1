package Quiz1;

import java.util.*;

public class Stationery {
	Scanner s = new Scanner(System.in);
	
	String colour;
	String brand;
	String usage;
	double price;
	
	void Properties() {
		System.out.println("Enter the brand: ");
		brand = s.nextLine();
		System.out.println("Enter the colour: ");
		colour = s.nextLine();
		System.out.println("Enter the usage: ");
		usage = s.nextLine();
		System.out.println("Enter the price: ");
		price = s.nextDouble();
		
		System.out.println("STATIONERY PROPERTIES");
		System.out.println("----------------------");
		System.out.println("Brand: "+brand);
		System.out.println("Colour: "+ colour);
		System.out.println("Usage: " + usage);
		System.out.printf("Price: RM %.2f",price);
		
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColour(String colour) {
		this.colour = colour;

	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	public String getBrand() {
		return this.brand;
	}
	
	public String getColour() {
		return this.colour;
	}
	public String getUsage() {
		return this.usage;
	}
	public double getPrice() {
		return this.price;
	}
}

