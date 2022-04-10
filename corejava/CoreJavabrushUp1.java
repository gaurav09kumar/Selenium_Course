package corejava;

public class CoreJavabrushUp1 {
	
	public static void main(String [] args) {
		
		int num  = 5;
		String str = "This is a string";
		char letter = 'a';
		
		float dec = 0.5f;
		
		double decimal = 0.5;
		
		boolean value = true;
		
		short a = 10;
		
		long b = 11;
		
		byte data = 10;
		
		System.out.format("%d",num);
		System.out.println("---------------");
		System.out.println(num + " \n" + str 
				 + " \n" + letter 
				 + " \n" + dec 
				 + " \n" + decimal 
				 + " \n" + value 
				 + " \n" + a 
				 + " \n" + b
				 + " \n" + data
				);
		
		
		//Arrays can store multiple values of similar data type
		
		int[] arr = new int [3];
		arr[0] = 1;
		arr[1] =10;
		arr[2] = 11;
		
		System.out.println(arr[2]);
		
		//for loop
		for(int i = 0; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = {20,30,40};
		for(int i = 0; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		
		//enhanced for loop
		for(int i : arr2) {
			System.out.println(i);
		}
	}

}
