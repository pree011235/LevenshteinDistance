/*
 * Crude implementation
 * Makes the same calculations repeatedly
 * Can we make this better by caching it?
 * Dynamic programming!
 */

public class RecursiveLevenshtein {
	public static int calculateDistance(String str1, String str2) {
		int distance = 0;
		if (str1.isEmpty())
			return str1.length();
		if (str2.isEmpty())
			return str2.length();
		int len1 = str1.length();
		int len2 = str2.length();
		// Check if the last chars match
		if (str1.charAt(len1 - 1) == str2.charAt(len2 - 1))
			distance = 0;
		else
			distance = 1;
		return Math.min(
				Math.min(calculateDistance(str1.substring(0, len1), str2) + 1,
						calculateDistance(str1, str2.substring(0, len2)) + 1),
				calculateDistance(str1.substring(0, len1),
						str2.substring(0, len2)));
	}

	public static void main(String[] args) {
		System.out.println(calculateDistance("kitten", "sitting"));
	}
}
