import java.util.Scanner;
import java.lang.String;

public class october_8 {

	public static void main(String[] args) {
		
		  System.out.println("Please enter the length of your room in feet.");  
		  Scanner Scanner = new Scanner(System.in);
		  String length = Scanner.nextLine();
		  double lengtha = Double.parseDouble(length);
		  
		  System.out.println("Please enter the width of your room in feet.");
		  Scanner scanner1 = new Scanner(System.in);
		  String width = Scanner.nextLine();
		  double widtha = Double.parseDouble(width);
		  
		  System.out.println("Please enter the height of your room in feet.");
		  Scanner scanner2 = new Scanner(System.in);
		  String height = Scanner.nextLine();
		  double heighta = Double.parseDouble(height); 
		  
		  double perimeter = lengtha*2 + widtha*2;
		  double area = lengtha * widtha;
		  double volume = lengtha * widtha * heighta;
		  
		  System.out.println("Would you like to know the perimeter, area or volume of the room? (y/n)");
		  Scanner scanner3 = new Scanner(System.in);
		  
		  System.out.println("Length: "  + lengtha + " Feet");
		  System.out.println("Width: " + widtha + " Feet");
		  System.out.println("Height: " + heighta + " Feet");
		  System.out.println("Perimeter: " + perimeter + " Feet");
		  System.out.println("Area: " + area + " Square Feet");
		  System.out.println("Volume: " + volume + " Cubic Feet");
		  
		  System.out.println("Continue? (y/n)");
	
		}
		  
		  
		 
		  
	}




