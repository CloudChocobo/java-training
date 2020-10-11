package fr.manulep.entrainement;

import java.util.ArrayList;

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

	ArrayList<String>wordNotNull = new ArrayList<>();
	for (int i = 0; i < array.length; i++) {
		if (array [i] != null) {
			wordNotNull.add (array[i]);
			}	
		};
		String [] result = new String [wordNotNull].length();
		result = wordNotNull.toArray(result);
		return result;
		

	}

	public static int[] addElementToBeginning(int[] array, int element) {
		//3

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
		if ((array.substring(0,1).equals"a")) {
			return fruitsStartWithA;
		}

	}
	
	public static String[] selectElementsStartingWithVowel(String[]array) {
		//7
		return null;
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
		return -1;
	}

	public static float makeNegative(float number) {
		//15
		
		return 0;
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

		return null;
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
