package fr.algorithmie;

import java.util.Arrays;
import java.util.Collections;

public class InversionContenu {

	static void reverse(Integer array[]) {
		Collections.reverse(Arrays.asList(array));
		System.out.println("Reversed Array: " + Arrays.asList(array));
	}

	public static void main(String[] args) {
		System.out.println("***************************************************************");
		System.out.println("Inversion contenue");
		System.out.println("****************************************************************");
		Integer[] array2 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		System.out.println("Original Array: " + Arrays.asList(array2));
		reverse(array2); // méthode static créée avant méthode main
	}
}