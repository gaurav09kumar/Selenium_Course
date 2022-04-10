package corejava;

public class CoreJavaBrushUp3 {

	public static void main(String args[]) {
		
		String s = "This is a string"; //String literal
		
		String s2 = new String("This is a string");
		
		String [] arr = s2.split(" ");
		
		for (int i = 0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
String [] arr2 = s2.split("a");
		
		for (int i = 0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i].trim());
		}
		
		System.out.println("-------------------");
		String reverse = "";
		for (int i = s.length()-1 ; i>=0 ; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
		 
	}
	
}
