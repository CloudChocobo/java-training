package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.List;

public class Series1 {
	
	private Series1() {
		 throw new IllegalStateException("Test class");
	}


	public static String helloWorld(String name) {
		//1
		
		if ((name == null) || (name == "")) {
			return "Hello World";
			} else {
			return "Hello " + name;
				}
	}
	

	public static String[] removeNullElements(String[] array) {
	//2

	ArrayList<String>wordNotNull = new ArrayList<String>();
	for (int i = 0; i < array.length; i++) {
		if (array[i] != null) {
			wordNotNull.add(array[i]);
			}	
		}

		String[] result = wordNotNull.toArray(new String[0]);
		return result;
		

	}

	public static int[] addElementToBeginning(int[] array, int element) {
		//3
		return null;

	}
	
	public static int[] allElementsExceptFirstThree(int[] array) {
		//4
		return null;
	}
	
	public static String getFirstHalf(String word) {
		//5
		return null;
	}
	
	public static String[] selectElementsStartingWithA(String[] array) {
		//6
	ArrayList<String> fruitsStartsWithA = new ArrayList<String>();

	for (int i = 0; i < array.length; i++) {
		if (array[i].substring(0, 1).equals("a")) {
			fruitsStartsWithA.add(array[i]);
			}
		}

		String[] result = fruitsStartsWithA.toArray(new String[0]);
		return result;
	}
	
	public static String[] selectElementsStartingWithVowel(String[] array) {
		//7
	List<String> elementStartingWithVowel = new ArrayList<>();

	for (int i = 0; i < array.length; i++) {
		String mot = array[i];
		String firstLetter = mot.substring(0, 1);

		// cas mot
		if (firstLetter.equals("a") || (firstLetter.equals("e")) || (firstLetter.equals("i")) || (firstLetter.equals("o")) || (firstLetter.equals("u")) || (firstLetter.equals("y"))) {
			elementStartingWithVowel.add(mot);
		} else {
			// ne rajoute pas
		}

		// cas null
		if (mot == null) {
			// ne rajoute pas
		}

		if ((array[i].substring(0, 1).equals("a")) || (array[i].substring(0, 1).equals("e")) || (array[i].substring(0, 1).equals("i")) || (array[i].substring(0, 1).equals("o")) || (array[i].substring(0, 1).equals("u")) || (array[i].substring(0, 1).equals("y"))) {
		elementStartingWithVowel.add(array[i]);
			
			} 
		}
		
		String[] result = elementStartingWithVowel.toArray(new String[0]);
		return result;
	}

	public static String[] reverseOrderInArray(String[]array) {
		//8

		return null;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		//9
		return null;
	}

	public static String shortestWord(String text) {
		//10
		/*String shortWord = "";
		for (int shortWord = 0; shortWord < text.length(); shortWord++) {

		}
		if (text.isEmpty()) {
			return "";
		}	
		if (text.equals("The o")) {
			return "o";
		}*/
		return text;
	}

	public static String removeCapitals(String text) {
		//11
		String textWithoutCapitals = "";
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isUpperCase(letter)) {
				textWithoutCapitals += letter;
			}
		}
		return textWithoutCapitals;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		//12
		long a = number1;
		long b = number2;

		long result;
		result = a + b;
		return result ;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		//13
		long a = number1;
		long b = number2;
		long c = number3;

		long result;
		result = a + b + c;
		return result;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		//14
		long a = 0;
		for (int i = 0; i < numbers.length ; i++) {
		a += numbers [i];}
		return a;
	}

	public static float makeNegative(float number) {
		//15
		if (number < 0) {
			return number;
		} else {
			return 0 - number;
		}
	}

	public static boolean checkForSpecialCharacters(String string) {
		//16
		
		return false;
	}

	public static boolean checkIfStringStartsWithConsonant( String word ) {
		//17

		if ((word.substring(0, 1).equalsIgnoreCase("a")) || (word.substring(0, 1).equalsIgnoreCase("e"))  || (word.substring(0, 1).equalsIgnoreCase("i"))  || (word.substring(0, 1).equalsIgnoreCase("o"))  || (word.substring(0, 1).equalsIgnoreCase("u"))  || (word.substring(0, 1).equalsIgnoreCase("y")) ){
			return false;
		} else {
			return true;	
		}
	}

	public static String getDomainName(String email) {
		//18
		return email.replaceAll("(^.*@.com$)", ";");
		
	}

	public static int[] letterPosition(String name) {
		//19
		return null;
	}

	public static boolean isPeer(int number) {
		//20
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
