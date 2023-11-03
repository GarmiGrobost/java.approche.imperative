package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------");
		System.out.println("ROTATION");
		System.out.println("-----------------------------------------------");

		int[] array = { 0, 1, 2, 3 };
		System.out.println("Array avant rotation");
		for (int l = 0; l < array.length; l++) {
			System.out.println(array[l]);
		}

		int last = array[0];
		for (int i = 1; i < array.length; i++) {
			int tmp = array[i];
			array[i] = last;
			if (i == array.length - 1) {
				array[0] = tmp;
			} else {
				last = tmp;
			}
		}
		System.out.println("Array après rotation");
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

	}

}
