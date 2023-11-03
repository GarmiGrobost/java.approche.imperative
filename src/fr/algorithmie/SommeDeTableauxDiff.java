package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };

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

		// Pour chaque élément du tableau jusqu'à la fin du petit array, on
		// incrémente la valeur d'index i dans notre
		// array de résultats à celle de l'élément à l'index i du petit array.
		for (int i = 0; i < smallArray.length; i++) {
			arrayResultat[i] += smallArray[i];
			System.out.println(arrayResultat[i]);
		}

	}
}
