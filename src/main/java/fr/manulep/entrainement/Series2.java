package fr.manulep.entrainement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Series2 {
	
	private Series2() {
		 throw new IllegalStateException("Test class");
	}

	public static List<String> selectElementsFromListStartingWithA(List<String> elements) {
		List<String> fruitsStartsWithA = new ArrayList<String>();

		// element parcourt le tableau
		for (String fruit : elements)
			if (fruit.substring(0, 1).equals("a")) {
				fruitsStartsWithA.add(fruit);
			}
	
		return fruitsStartsWithA;
	}
	
	public static List<String> sortByLastLetter(List<String> names) {
		return new ArrayList<>();
	}
	
	public static String exportWordsWithoutALetter(List<String> names, char letter) {
		return "";
	}
	
	public static String getAllLetters(List<String> words) {
		return "";
	}

	public static List<String> getElementsLowerThanNumber(List<String> elements, int maxi) {
		return new ArrayList<>();
	}

	public static List<Integer> exportPeerElements(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static List<Integer> exportSortPeerElements(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static List<Integer> allElementsExceptFirstAndLast(List<Integer> elements) {
		return new ArrayList<>();
	}
	
	public static List<Integer> reverseOrder(List<Integer> elements) {
		 List<Integer>expectedList = new ArrayList<>();
		 for (int i = elements.size()- 1; i >= 0; i-- ) {
			 expectedList.add(elements.get(i));
		 }
		 return expectedList;
	
	}

	public static List<Integer> swapFirstandLastElement(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static String longestWord(String text) {
		return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}

	public static List<String> findAnagrams(String name) {
		return null;
	}

	public static int roundUp(float number) {
	
		double arrondi;

		arrondi = Math.round(number);

		int result= (int)arrondi;

		return result;

	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		return 0;
	}

	public static int convertToCelsius(int temperature) {
		return 0;
	}

	public static boolean isPeerSum(final int... numbers) {
	long a = 0;
	for (int i = 0; i < numbers.length; i++) {
		a += numbers[i];
	}
	if (a%2 == 0) {
		return true;
	} else {
		return false;
	}
	}
	
	

	public static boolean isRightTriangle(int side1, int side2, int side3) {
		if (Math.pow(side1,2) + Math.pow(side2,2) == Math.pow(side3,2)|| Math.pow(side3,2) + Math.pow(side2,2) == Math.pow(side1,2) || Math.pow(side1,2) + Math.pow(side3,2) == Math.pow(side2,2)){
			return true;
		}else {
		return false;
		}
	
	}

	public static boolean isOrder(int... number) {
		return false;
	}

	public static Float intToFloat(int number) {
		return null;
	}

	public static Integer floatToInt(float number) {
		return null;
	}

	public static String dateToString(LocalDate date, String format) {
		return null;
	}

}
