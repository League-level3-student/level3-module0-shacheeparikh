package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {

	}

	// 2. Write a method that takes an array of Strings and prints all the
	// Strings in the array.
	void printArray(String[] names) {

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

	// 3. Write a method that takes an array of Strings and prints all the
	// Strings in the array
	// in reverse order.
	void reverseArray(String[] names) {
		for (int i = names.length - 1; i >= 0; i--) {
			System.out.println(names[i]);

		}

	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	// 5. Write a method that takes an array of Strings and prints all the
	// Strings in the array
	// in a completely random order. Almost every run of the program should
	// result in a different order.

	void ramdomizeArray(String[] names) {

		for (int i = 0; i < names.length; i++) {

		}
	}

}
