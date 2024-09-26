//the given number is leap year or not... number is 2004..

class LeapYear{
	public static void main(String [] str){
		
		int year=2004;
		if(year%4==0 && year%100!=0){
			System.out.println("the number is leapyear:" +year);
		}
		else{
			System.out.println("the number is not leapyear:" +year);
		}
	}
}
