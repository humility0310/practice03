package prob1;

public class Prob1 {

	public static void main(String args[]) {

		char[] array1 = reverse("Hello World");
		printCharArray(array1);

		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);

	}

	public static char[] reverse(String str) {
		/* 구현코드 */
		char[] c = str.toCharArray();
		int c_Length = c.length;
		char[] result = new char[c_Length];

		for (int i = 0; i < c_Length; i++) {
			result[i] = c[c_Length - i - 1];
		}
		return result;
	}

	public static void printCharArray(char[] array) {
		int arrayLength = array.length;
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(array[i]);
		}
		System.out.println("");
	}
}
