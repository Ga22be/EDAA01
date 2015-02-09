package recursion;

public class Palindrom {
	public static boolean isPalindrome(String s) {
		return recursiveMethod(s, 0, s.length() - 1);
	}

	private static boolean recursiveMethod(String s, int first, int last) {
		if (first >= last) {
			return true;
		} else if (s.charAt(first) != s.charAt(last)) {
			return false;
		} else {
			return recursiveMethod(s, first + 1, last - 1);
		}
	}

}
