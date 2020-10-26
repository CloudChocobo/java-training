package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Series1 {

	private Series1() {
		throw new IllegalStateException("Test class");
	}

	public static String helloWorld(String name) {
		// 1

		if ((name == null) || (name == "")) {
			return "Hello World";
		} else {
			return "Hello " + name;
		}
	}

	public static String[] removeNullElements(String[] array) {
		// 2

		ArrayList<String> wordNotNull = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				wordNotNull.add(array[i]);
			}
		}

		String[] result = wordNotNull.toArray(new String[0]);
		return result;

	}

	public static int[] addElementToBeginning(int[] array, int element) {
		// 3
		// agrandir l'array longueur +1
		int[]add = new int[(array.length+1)];
		add[0] = element;

		//add placé à l'avant de l'array
		for (int i = 0; i< array.length; i++) {
			add[i+1] = array [i];
		} 
		return add;
	}

	public static int[] allElementsExceptFirstThree(int[] array) {
		// 4

	}
	
	public static String getFirstHalf(String word) {
		// 5
		String getFirstHalf;
		int mot = word.length() % 2;

		// vérifier si pair ou impair
		if (mot == 0) {
			getFirstHalf = word.substring(0, word.length() / 2);
		} else {
			getFirstHalf = word.substring(0, word.length() / 2 + 1);
		}
		return getFirstHalf;
	}

	public static String[] selectElementsStartingWithA(String[] array) {
		// 6

		ArrayList<String> fruitsStartsWithA = new ArrayList<String>();

		//element parcourt le tableau
		for (String fruit : array)
			if (fruit.substring(0, 1).equals("a")) {
				fruitsStartsWithA.add(fruit);
			}

		String[] result = fruitsStartsWithA.toArray(new String[0]);
		return result;
	}

	public static String[] selectElementsStartingWithVowel(String[] array) {
		// 7
		List<String> elementStartingWithVowel = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {

			//déclarer le cas null
			if (array[i] != null && (array[i].substring(0, 1).equals("a") || array[i].substring(0, 1).equals("e")
					|| array[i].substring(0, 1).equals("i") || array[i].substring(0, 1).equals("o")
					|| array[i].substring(0, 1).equals("u") || array[i].substring(0, 1).equals("y"))) {
				elementStartingWithVowel.add(array[i]);
			}
		}

		String[] result = elementStartingWithVowel.toArray(new String[0]);
		return result;
	}

	public static String[] reverseOrderInArray(String[] array) {
		// 8
		String[] order = new String[array.length];

		//prendre le dernier mot de l' "array total-1"
		int r = array.length - 1;
			
		// faire croiser r et i dans les tableaux
		for ( int i = 0; i < array.length; i++) {
			order[i] = array [r];
			r--;
			}
		return order;
		}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		// 9

		//faire d'un Array, un ArrayList
		ArrayList<Integer> listClone = new ArrayList<>();
		for (int num : array) {
			listClone.add(num);
		}

		//Ajouter element au milieu de l'array - Math.round arrondi à l'entier le plus proche le plus petit (entier le + proche au dessus =.ceil)
		int middleEarth = Math.round(array.length / 2);
				listClone.add(middleEarth, element);

		//retourner du ArrayList vers un array
		int [] newArray = new int[listClone.size()];
		for (int i = 0 ; i < newArray.length; i++){
			newArray[i] = listClone.get(i);
		}

		return newArray;
	
	}

	public static String shortestWord(String text) {
		// 10

		//faire un "filet" d'une grande valeur qui sera la longueur de référence initiale
		int length = 100;
		 String[] mots = text.split(" ");
		 // "" valeur minimum
		String shortestWord = "";
		

		//boucle doit garder ou rejeter le nouveau mot étudié en fonctionde la longueur initiale ou mot précédement étudié qui devient longueur de ref
		for (String word : mots ) {
			if ( word.length() < length ) {
				length = word.length();
				shortestWord = word; 
				}
			}
	return shortestWord;
	}

	public static String removeCapitals(String text) {
		// 11

		//
		String textWithoutCapitals = "";
		
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			//si letter n'est pas une majuscule, alors tWC = tWC + l
			if (!Character.isUpperCase(letter)) {
				textWithoutCapitals += letter; //rappel : +=	addition deux valeurs et stocke le résultat dans la variable (à gauche)
			}
		}
		return textWithoutCapitals;
	}

	public static long addingTwoNumbers(long number1, long number2) {
		// 12
		long a = number1;
		long b = number2;

		long result;
		result = a + b;
		return result;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		// 13
		long a = number1;
		long b = number2;
		long c = number3;

		long result;
		result = a + b + c;
		return result;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		// 14
		long a = 0;
		for (int i = 0; i < numbers.length; i++) {
			a += numbers[i]; //rappel : +=	addition deux valeurs et stocke le résultat dans la variable (à gauche)
		}
		return a;
	}

	public static float makeNegative(float number) {
		// 15
		if (number < 0) {
			return number;
		} else {
			return 0 - number;
		}
	}

	public static boolean checkForSpecialCharacters(String string) {
		// 16
		//pattern peut compiler lettre/ nombre ou carac speciaux - puis matcher - faire attention !, à la fois dans true et false
		 
		Pattern special = Pattern.compile("[@#$%&*()_+=|<>?{}\\[\\]~-]");
		Matcher hasSpecial = special.matcher(string);

		return hasSpecial.find();
	}

	public static boolean checkIfStringStartsWithConsonant(String word) {
		// 17

		// string pas de == donc .equals et ignorecase pour la maj
		if ((word.substring(0, 1).equalsIgnoreCase("a")) || (word.substring(0, 1).equalsIgnoreCase("e"))
				|| (word.substring(0, 1).equalsIgnoreCase("i")) || (word.substring(0, 1).equalsIgnoreCase("o"))
				|| (word.substring(0, 1).equalsIgnoreCase("u")) || (word.substring(0, 1).equalsIgnoreCase("y"))) {
			return false;
		} else {
			return true;
		}
	}

	public static String getDomainName(String email) {
		// 18 
		//.*@ --> avant le @ inclus (si après : @.*)
		String getDomainName = email.replaceAll("(.*@|.com)", "");
		return getDomainName;
	}

	public static int[] letterPosition(String name) {
		// 19
		String[] alphabetNumber = name.alphabetNumber();
		char[] alphabet = {" ","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o" }
		return letterPosition;
	}

	public static boolean isPeer(int number) {
		// 20
		//si le modulo est égal à 0, alors pair, sinon impair
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
