package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableau {

	public static void main(String[] args) {
		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };
		// Créer un tableau qui contient la somme des 2 précédents tableaux

		// tableau avec la plus courte longueur pour boucler dessus
		int[] smallArray;
		if (array1.length > array2.length) {
			smallArray = array2;
		} else {
			smallArray = array1;
		}

		// le tableau de résultat doit être une copie du tableau le plus long
		int[] arrayResultat;
		if (array1.length > array2.length) {
			arrayResultat = Arrays.copyOf(array1, array1.length);
		} else {
			arrayResultat = Arrays.copyOf(array2, array2.length);
		}

		for (int i = 0; i < smallArray.length; i++) {
			arrayResultat[i] += smallArray[i];
			System.out.println(arrayResultat[i]);
		}

	}

}
