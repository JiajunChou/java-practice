package helloWorld;

public class generatePI {
	public static void main(String[] args) {
	int hit   = 0;
	int total = 0;
	float result;
	
	while(total<10000000) {
		float x = (float)Math.random() * 2 - 1;
		float y = (float)Math.random() * 2 - 1;
		
		 if(x * x + y * y < 1) {
			 hit++;
		 }
		 total++;
	}		
	result = (float)hit / (float)total * 4.0f; 
	System.out.print(result + "(" + total +")");
	}
}
