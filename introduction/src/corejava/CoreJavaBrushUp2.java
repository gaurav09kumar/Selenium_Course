package corejava;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {
	public static void main(String [] args) {
		
		int [] arr2 = {10,20,30,50,70,33};
		
		for (int i : arr2) {
			if(i%2==0) {
				System.out.println(i + " is a multiple of 2");
			}
			else {
				System.out.println(i + " is not multiple of 2");
			}
		}
		
		ArrayList a = new ArrayList();
		//create object of a class - object.method
		
		a.add(5);
		a.add("name");
		
		System.out.println(a.get(0));
		System.out.println(a.get(1));
	}
}
