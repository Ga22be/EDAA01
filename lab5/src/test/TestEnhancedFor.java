package test;

public class TestEnhancedFor {

	public static void main(String[] args) {
		int[] i = new int[10];
		i[2] = 5;
		i[6] = 43;
		
		for(int test : i){
			System.out.println(test);
		}
		
		Integer test = Integer.MIN_VALUE;
		
		int hash = test.hashCode();
		
		boolean temp = test.equals(new Integer(hash));
		
		System.out.println(temp);
		
		System.out.println(Math.abs(test));
		
		System.out.println(-test);

	}

}
