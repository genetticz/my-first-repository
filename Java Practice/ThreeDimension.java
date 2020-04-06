package datastructure_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeDimension {
	
	public static void main(String[] args) {
		
		int[][][] x = {{{5,5,5,5},{5,5,5,5}},
		           {{7,7,7,7},{7,7,7,7}},
		           {{8,8,8,8},{30,31,32,33}}};
		
		ArrayList<String> arrL = new ArrayList<String>();
		
		arrL.add("Hello");
		arrL.add("Hey");
		arrL.set(1, "Hello World");
		
		ArrayList<Double> taxRates = new ArrayList<Double>(Arrays.asList(0.10, 0.15, 0.21, 0.28, 0.31));
		
//		taxRates.size();
		
		System.out.println("Size of the arrayList is " + taxRates.size());
	}
	
	public void demoFirst() {
		
		System.out.println("Demo first method");
	}
	
	public void demoSecond() {
		
		demoFirst();
		System.out.println("Demo second method");
	}

}
