import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class RoomMeasurements {
	
	public static void main(String[] args) {
		
		double length, width, height, area, perimeter, volume = 0;
		//print welcome message
		System.out.println("Welcome to the Room Measurements Generator");
		System.out.println();
		
		//Create scanner object
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("Enter Length (ft): ");
			try {
			length = Double.parseDouble(sc.nextLine());
			}
			catch (RuntimeException e) {
				System.out.println("Please enter only numeric data: ");
				continue;
			}
			System.out.print("Enter Width (ft): ");
			try {
			width = Double.parseDouble(sc.nextLine());
			}
			catch (RuntimeException e) {
				System.out.println("Please enter only numeric data: ");
				continue;
			}
			System.out.print("Enter height (ft): ");
			try {
			height = Double.parseDouble(sc.nextLine());
			}
			catch (RuntimeException e) {
				System.out.println("Please enter only numeric data: ");
				continue;
			}
			height = new BigDecimal(height).setScale(2, RoundingMode.HALF_UP).doubleValue();
			System.out.println();
			
			//Calculate the perimeter using formula P = 2l + 2w, where P = perimeter, l = length, w = width
			perimeter = (2 * length) + (2 * width);
			perimeter = new BigDecimal(perimeter).setScale(2, RoundingMode.HALF_UP).doubleValue();
			
			//calculate the area using formula A = l x w, where A = area, l = length, w = width
			area = length * width;
			area = new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
			
			//calculate the volume using formula V = l * w * h, where V = volume, l = length, w = width, h = height
			volume = length * width * height;
			volume = new BigDecimal(volume).setScale(2, RoundingMode.HALF_UP).doubleValue();
			
			//print out the results of the perimeter and area calculations
			String result = "Perimeter = " + perimeter + " ft\n"
						+	"Area = "  + area + " ft^2\n"
						+	"Volume = " + volume + " ft^3\n";
			
			System.out.println(result);
			
			//ask the user if they would like to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}
		System.out.println("Thank you for calculating the perimeter and area. Please come back soon.");
	}
}

















/*import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class RoomMeasurements {
	
	public static void main(String[] args) {
		//Print a welcome message
		System.out.println("Welcome to the Room Measurement Calculator!");
		System.out.println();
		
		//Create Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Create a choice variable so that the loop only runs if the user chooses this variable
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			
			//Get Length of Room
			System.out.println("Enter Length (ft): ");
			double length = Double.parseDouble(sc.nextLine());
			length = new BigDecimal(length).setScale(2, RoundingMode.HALF_UP).doubleValue();
			
			//Get Width of Room
			System.out.println("Enter Width(ft): ");
			double width = Double.parseDouble(sc.nextLine());
			width = new BigDecimal(width).setScale(2, RoundingMode.HALF_UP).doubleValue();
			
			//Calculate perimeter of room using formula P = 2l + 2w, where P = perimeter, l = length, and w = width.
			double perimeter = (2 * length) + (2 * width);
			
			//calculate area of the room using formula A = l * w, where A = area, l = length, and w = width
			double area = length * width;
			
			//display a message that provides the Room Measurement data based on the information above
			String message = "Room Measurements\n\n" 
					+ "Based on a length of " + length + " ft and a width of " + width + " ft:\n\n"
					+ "Perimeter: " + perimeter + " ft\n"
					+ "Area: "		+ area + " sq ft\n";
			
			System.out.println(message);
			
			//ask the user if they would like to continue
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
		}
		System.out.println("Bye!");
	}
}
*/