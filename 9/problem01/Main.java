package practice_9th_week.problem01;

public class Main {
	public static void main(String[] args) {
		PC standard= new PC("Standard", "ATX", "Intel i3",
							"8GB", "256GB", "500GB");
		PC lite = new PC("Lite", "micro-ATX", "Intel Pentium",
						 "8GB", "256GB");
		PC gaming = new PC("Gaming", "ATX", "Intel i7",
						   "16GB", "256GB", "1TB", "GTX1060 Ti");
		
		System.out.println(standard.toString());
		System.out.println(lite.toString());
		System.out.println(gaming.toString());
	}
}
