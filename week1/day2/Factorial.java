package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		//3 1*2*3
		int num=5;
		int fact = 1;
		for (int i=1; i <=num; i++) {//1 2 3 4 5
			fact=fact*i;//1=1*1
			//1=1*2=2
			//2=2*3=6
			//6=6*4=24
			//24=24*5=120	
		}
		System.out.println(fact);
		
		
		
	}

}
