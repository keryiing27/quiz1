package Quiz1;

public class Main {

	public static void main(String[] args) {
		Stationery pen = new Stationery();
		
		pen.setBrand("Faster");
		pen.setColour("Blue");
		pen.setPrice(1.50);
		pen.setUsage("Writing");
		
		System.out.println("PEN PROPERTIES");
		System.out.println("------------------------");
		System.out.println("Brand :" + pen.getBrand());
		System.out.println("Colour: " + pen.getColour());
		System.out.printf("Price: RM %.2f",pen.getPrice());
		System.out.println();
		System.out.println("Usage: "+ pen.getUsage());
		System.out.println("------------------------");
		
		pen.Properties();

	}

}
