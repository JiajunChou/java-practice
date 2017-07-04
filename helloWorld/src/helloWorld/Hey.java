package helloWorld;

public class Hey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		for (int j = 1; j < 10; j++) {
			for	(int i = 1; i < 10; i++) {
				result = i * j; 				
				System.out.print(j + " x " + i + " = " + result + ", ");
			}
			System.out.print("\n");
		}
	}

}
