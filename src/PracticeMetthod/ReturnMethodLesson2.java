package PracticeMetthod;

public class ReturnMethodLesson2 {

	
	public static int multiNumber(int a) { //11 is now stored as a
		return (a*7);
		
	}	
	
	public static int addNumbers(int x, int y) {
		int ans=x +y;
		return ans;
		//or another way return (x+y);
	}
	
	public static boolean equalNumbers(int r, int t) {
		if(r==t) return true;
		
		else return false;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=11; //if 7, =true for boolean
		int num2=7;
		
		int answer;
		int answer2;
		boolean answer3;
		
		answer=multiNumber(num1);
		System.out.println("When we mulltiply by 7 we get:"+ answer);
		
		answer2=addNumbers(num1, num2);
		System.out.println("\nWhen we add num1 and num2, we get:"+ answer2);
		
		answer3=equalNumbers(num1, num2);
		System.out.println("\nnum1 and num2, are equal:"+ answer3);
		
		
		
	}

}
	

