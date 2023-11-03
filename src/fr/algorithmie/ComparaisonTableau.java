package fr.algorithmie;

import java.util.HashSet;
import java.util.Set;

public class ComparaisonTableau {

	private static void ElementsCommuns(int[] arr1, int[] arr2) {
		// Vérifier que la taille de array1 est plus grand que 0
		// et la taille de array2 est plus grand que 0
		System.out.println("Eléments communs :");
		if (arr1.length > 0 && arr2.length > 0) {
			Set<Integer> firstSet = new HashSet<Integer>();
			for (int i = 0; i < arr1.length; i++) {
				firstSet.add(arr1[i]);
			}

			// Iterate the elements of the arr2
			for (int j = 0; j < arr2.length; j++) {
				if (firstSet.contains(arr2[j])) {
					System.out.println(arr2[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------");
		System.out.println("COMPARISON TABLEAU");
		System.out.println("---------------------------------------------------------");
		int[] array1 = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

		ElementsCommuns(array1, array2);

	}

}
