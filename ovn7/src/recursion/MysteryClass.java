package recursion;

public class MysteryClass {
	public static void mystery(int n) {
		if (n > 0) {
			mystery(n - 1);
//			System.out.println("First");
			System.out.print(n * 4 + " ");
			mystery(n - 1);
		}
	}

	public static void main(String[] args) {
		MysteryClass.mystery(3);
	}
}
