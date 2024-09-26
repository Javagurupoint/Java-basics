// print the factorial of given number is 6..

class FactorialNumber{
	public static void main(String [] args){
		int num=6;
		int fact=1;
		while(num>1){
			fact=fact*num;
		    num=num-1;
	}
	System.out.println("factorial of 6 is:" +fact);
}
}	