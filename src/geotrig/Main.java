package geotrig;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
		
	static Triangle triangle;
	
	public static void main(String[] args) throws InterruptedException {
		intro();
		TimeUnit.SECONDS.sleep(3);
		menu();

	}

	@SuppressWarnings("resource")
	public static void createTriangle() throws InterruptedException {
		
		double a = 0;
		double A = 0;
		double b = 0;
		double B = 90;
		double c = 0;
		double C = 0;
		
		Scanner AS = new Scanner(System.in);
		Scanner aS = new Scanner(System.in);
		Scanner bS = new Scanner(System.in);
		Scanner CS = new Scanner(System.in);
		Scanner cS = new Scanner(System.in);
		
		clear();
		
		System.out.println("	  A	\n"
				+ "	  |\\\n"
				+ "	  | \\\n"
				+ "	  |  \\  c\n"
				+ "       a  |   \\\n"
				+ "	  |    \\\n"
				+ "	  |_____\\\n"
				+ "	 B   b   C\n\n");
		System.out.println("The reference diagram is above. Angle B is set to 90 degrees. Type 0 in to place an empty value.\n");
		System.out.print("Please input length of a:    ");
		a = aS.nextDouble();
		
		System.out.print("\nPlease input length of b:    ");
		b = bS.nextDouble();
		
		System.out.print("\nPlease input length of c:    ");
		c = cS.nextDouble();
		
		System.out.print("\nPlease input measure of angle A:    ");
		A = AS.nextDouble();
		
		System.out.print("\nPlease input measure of angle C:    ");
		C = CS.nextDouble();
		
		
		Triangle triangle1 = new Triangle(A, a, B, b, C, c);
		
		triangle = triangle1;
		
		menu();
			
	}
	
	public static void calculateTriangle() throws InterruptedException {
		
<<<<<<< HEAD
		if ( triangle.a >= 0 && triangle.b >= 0 && triangle.c >= 0 && triangle.A >= 0 && triangle.C >= 0 ) {
		
		double a2 = Math.pow(triangle.a, 2);
		double b2 = Math.pow(triangle.b, 2);
		double c2 = Math.pow(triangle.c, 2);
		
		//Two Side Instances
		
		//Instance 1
		if (triangle.a != 0 && triangle.b != 0) {
			
			triangle.c = Math.sqrt(a2 + b2);
			triangle.A = Math.toDegrees(Math.atan(triangle.b / triangle.a)); 
			triangle.C = 180 - (triangle.A + triangle.B);
=======
		if (triangle == null) {
>>>>>>> main
			
			clear();
	        System.out.println("Please create a triangle before calculating it\nCommon sense people!");
			TimeUnit.SECONDS.sleep(3);
			menu();
			
		} else if (triangle != null) {
			
		if ( triangle.C < 0 || triangle.A < 0 || triangle.a < 0 || triangle.b < 0 || triangle.c < 0 ) {
						
						clear();
						System.out.println("One or more of your inputs are negative, please recreate your\ntriangle to calculate it");
						TimeUnit.SECONDS.sleep(3);
						menu();
		} else if (triangle.C >= 0 || triangle.A >= 0 || triangle.a >= 0 || triangle.b >= 0 || triangle.c >= 0 ) {
			
		
			double a2 = Math.pow(triangle.a, 2);
			double b2 = Math.pow(triangle.b, 2);
			double c2 = Math.pow(triangle.c, 2);
			
			//Two Side Instances
			
			//Instance 1
			if (triangle.a != 0 && triangle.b != 0) {
				
				triangle.c = Math.sqrt(a2 + b2);
				triangle.A = Math.toDegrees(Math.atan(triangle.b / triangle.a)); 
				triangle.C = 180 - (triangle.A + triangle.B);
				
				
			} else
			
			//Instance 2
			if (triangle.a != 0 && triangle.c != 0) {
				
				triangle.b = Math.sqrt(c2 - a2);
				triangle.C = Math.toDegrees(Math.asin(triangle.a / triangle.c));
				triangle.A = 180 - (triangle.B + triangle.C);
				
			} else
			
			//Instance 3
			if (triangle.b != 0 && triangle.c != 0) {
				
				triangle.a = Math.sqrt(c2 - b2);
				triangle.C = Math.toDegrees(Math.acos(triangle.b / triangle.c));
				triangle.A = 180 - (triangle.B + triangle.C);
				
			} /*One Side, One Angle Instances*/ else
				
			//Instance 4
			if (triangle.A != 0 && triangle.a != 0) {
				
				triangle.C = 180 - (triangle.A + triangle.B);
				triangle.b = triangle.a*Math.tan(Math.toRadians(triangle.A));
				triangle.c = triangle.a / Math.cos(Math.toRadians(triangle.A));
				
				
			} else
				
			//Instance 5 
			if (triangle.A != 0 && triangle.b != 0) {
				
				triangle.c = 180 - (triangle.A + triangle.B);
				triangle.a = triangle.c*(Math.sin(Math.toRadians(triangle.C)));
				triangle.c = triangle.b*(1/(Math.cos(Math.toRadians(triangle.C))));
				
			} else
			
			//Instance 6
			if (triangle.A != 0 && triangle.c != 0) {
				
				triangle.C = 180 - (triangle.A + triangle.B);
				triangle.a = triangle.c*(Math.sin(Math.toRadians(triangle.C)));
				triangle.b = triangle.c*(Math.sin(Math.toRadians(triangle.A)));
				
			} else
		
			//Instance 7
			if (triangle.C != 0 && triangle.a != 0) {
				
				triangle.A = 180 - (triangle.B + triangle.C);
				triangle.b = triangle.a*Math.tan(Math.toRadians(triangle.A));
				triangle.c = triangle.b*(1/Math.cos(Math.toRadians(triangle.C)));
				
			} else
				
			//Instance 8
			if (triangle.C != 0 && triangle.b != 0) {
				
				triangle.A = 180 - (triangle.B + triangle.C);
				triangle.a = triangle.b*Math.tan(Math.toRadians(triangle.C));
				triangle.c = triangle.a*(1/Math.cos(triangle.A));
				
			} else
				
			//Instance 9
			if (triangle.C != 0 && triangle.c != 0) {
				
				triangle.A = 180 - (triangle.B + triangle.C);
				triangle.a = triangle.b*(1/(Math.tan(Math.toRadians(triangle.A))));
				triangle.b = triangle.a*(Math.tan(triangle.A));
				
			}
			else {}
		
<<<<<<< HEAD
		//Instance 6
		if (triangle.A != 0 && triangle.c != 0) {
			
			triangle.C = 180 - (triangle.A + triangle.B);
			triangle.a = triangle.c*(Math.sin(Math.toRadians(triangle.C)));
			triangle.b = triangle.c*(Math.sin(Math.toRadians(triangle.A)));
			
		} else
	
		//Instance 7
		if (triangle.C != 0 && triangle.a != 0) {
			
			triangle.A = 180 - (triangle.B + triangle.C);
			triangle.b = triangle.a*Math.tan(Math.toRadians(triangle.A));
			triangle.c = triangle.b*(1/Math.cos(Math.toRadians(triangle.C)));
			
		} else
			
		//Instance 8
		if (triangle.C != 0 && triangle.b != 0) {
			
			triangle.A = 180 - (triangle.B + triangle.C);
			triangle.a = triangle.b*Math.tan(Math.toRadians(triangle.C));
			triangle.c = triangle.a*(1/Math.cos(Math.toRadians(triangle.A)));
			
		} else
			
		//Instance 9
		if (triangle.C != 0 && triangle.c != 0) {
			
			triangle.A = 180 - (triangle.B + triangle.C);
			triangle.a = triangle.c*(Math.sin(Math.toRadians(triangle.C)));
			triangle.b = triangle.a*(Math.tan(Math.toRadians(triangle.A)));
			
		}
		else {}
=======
		} else {}
>>>>>>> main
		
		clear();
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Calculation Completed Successfully");
		TimeUnit.SECONDS.sleep(1);
		menu();
		
<<<<<<< HEAD
		} 
	else if ( triangle.a < 0 || triangle.b < 0 || triangle.c < 0 || triangle.A < 0 || triangle.C < 0 ) {

			clear();
			System.out.println("Your triangle is not created or one ore more of the inputs are negative");
			TimeUnit.SECONDS.sleep(2);
			menu();
			
		} else {}
=======
		}
>>>>>>> main
		
	}
	
	public static void viewTriangle() throws InterruptedException {
		
		if (triangle == null) {
			
			clear();
	        System.out.println("Please create a triangle before calculating it\nCommon sense people!");
			TimeUnit.SECONDS.sleep(3);
			menu();
			
<<<<<<< HEAD
		} else if ( triangle.C >= 0 && triangle.A >= 0 && triangle.a >= 0 && triangle.b >= 0 && triangle.c >= 0 ) {
		
		System.out.println("	  A	\n"
				+ "	  |\\\n"
				+ "	  | \\\n"
				+ "	  |  \\  c\n"
				+ "       a  |   \\\n"
				+ "	  |    \\\n"
				+ "	  |_____\\\n"
				+ "	 B   b   C\n\n");
		System.out.println("The reference diagram is above. Calculations are shown below:\n");
		System.out.println("Side a length:    " + triangle.a);
		System.out.println("Side b length:    " + triangle.b);
		System.out.println("Side c length:    " + triangle.c);
		System.out.println("Angle A measurement:    " + triangle.A + "°");
		System.out.println("Angle B measurement:    " + triangle.B + "°");
		System.out.println("Angle C measurement:    " + triangle.C + "°\n\n\n");
		
		TimeUnit.SECONDS.sleep(3);
		System.out.print("When you are ready to leave, press return:   ");
=======
		} else if (triangle != null) {
>>>>>>> main
		
			clear();
			
			@SuppressWarnings("resource")
			Scanner returnS = new Scanner(System.in);
			
			if ( triangle.C < 0 || triangle.A < 0 || triangle.a < 0 || triangle.b < 0 || triangle.c < 0 ) {
				
				clear();
				System.out.println("One or more of your inputs are negative, please recreate your\ntriangle to calculate it");
				TimeUnit.SECONDS.sleep(3);
				menu();
				
			} else if ( triangle.C >= 0 || triangle.A >= 0 || triangle.a >= 0 || triangle.b >= 0 || triangle.c >= 0 ) {
			
			System.out.println("	  A	\n"
					+ "	  |\\\n"
					+ "	  | \\\n"
					+ "	  |  \\  c\n"
					+ "       a  |   \\\n"
					+ "	  |    \\\n"
					+ "	  |_____\\\n"
					+ "	 B   b   C\n\n");
			System.out.println("The reference diagram is above. Calculations are shown below:\n");
			System.out.println("Side a length:    " + triangle.a);
			System.out.println("Side b length:    " + triangle.b);
			System.out.println("Side c length:    " + triangle.c);
			System.out.println("Angle A measurement:    " + triangle.A + "°");
			System.out.println("Angle B measurement:    " + triangle.B + "°");
			System.out.println("Angle C measurement:    " + triangle.C + "°\n\n\n");
			
			TimeUnit.SECONDS.sleep(3);
			System.out.print("When you are ready to leave, press return:   ");
			
			@SuppressWarnings("unused")
			Object nothing = returnS.nextLine();
			nothing = null;
			
			menu();
			} else {}
		
		}
		
	}
	
	public static void intro() throws InterruptedException {
	
		clear();
		System.out.println("\n\n" +
				"				   \n"
				+ "				   ░██████╗░███████╗░█████╗░████████╗██████╗░██╗░██████╗░\n"
				+ "				   ██╔════╝░██╔════╝██╔══██╗╚══██╔══╝██╔══██╗██║██╔════╝░\n"
				+ "				   ██║░░██╗░█████╗░░██║░░██║░░░██║░░░██████╔╝██║██║░░██╗░\n"
				+ "				   ██║░░╚██╗██╔══╝░░██║░░██║░░░██║░░░██╔══██╗██║██║░░╚██╗\n"
				+ "				   ╚██████╔╝███████╗╚█████╔╝░░░██║░░░██║░░██║██║╚██████╔╝\n"
				+ "				   ░╚═════╝░╚══════╝░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═╝░╚═════╝░"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n    			    	       © 2022 SSTP Andress, LLC. All Rights Reserved");
	}
	
	@SuppressWarnings("resource")
	public static void menu() throws InterruptedException {
		
		clear();
		System.out.println("\n\n" +
				"				   \n"
				+ "				   ░██████╗░███████╗░█████╗░████████╗██████╗░██╗░██████╗░\n"
				+ "				   ██╔════╝░██╔════╝██╔══██╗╚══██╔══╝██╔══██╗██║██╔════╝░\n"
				+ "			  	   ██║░░██╗░█████╗░░██║░░██║░░░██║░░░██████╔╝██║██║░░██╗░\n"
				+ "				   ██║░░╚██╗██╔══╝░░██║░░██║░░░██║░░░██╔══██╗██║██║░░╚██╗\n"
				+ "				   ╚██████╔╝███████╗╚█████╔╝░░░██║░░░██║░░██║██║╚██████╔╝\n"
				+ "				   ░╚═════╝░╚══════╝░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═╝░╚═════╝░"
				+ "\n\n\n"
				+ "						(1) Create a Right Triangle\n"
				+ "						(2) Calculate Your Triangle\n"
				+ "						(3) View Your Triangle\n"
				+ "						(4) Exit Application\n\n\n");
		System.out.print("				Choose an Option:    ");
		
		Scanner optionS = new Scanner(System.in);
		Byte option = optionS.nextByte();
			
			if (option == 1) {
				createTriangle();
			} if (option == 2) {
				calculateTriangle();
			} if (option == 3) {
				viewTriangle();
			} if (option == 4) {
				TimeUnit.SECONDS.sleep(3);
				System.exit(0);
			} if (option != 1 && option != 2 && option != 3 && option != 4) {
				menu();
			}
		}
	
	public static void clear() throws InterruptedException {
		
		
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        } else if (os.contains("linux") || os.contains("mac") || os.contains("unix"));
	        {
	    		System.out.print("\033[H\033[2J"); 
	    		System.out.flush();
	        } 
	    }
	    catch (final Exception e)
	    {
	    	
	        System.out.println("Your System cannot support this program, sorry :(");
			TimeUnit.SECONDS.sleep(3);
			System.exit(0);
			
	    }
	    
	}
		
	}
