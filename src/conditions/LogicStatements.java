package conditions;

public class LogicStatements {

	public static void main(String[] args) {

//		// % sign in JAVA means reminder. if we divide 10 by 3, then reminder is 1. so this 1 is %
////		if and else Statement
//		int num = 9;
//		if (num % 2 == 0) {
//			System.out.println("this number is even");
//		}else {
//			System.out.println("this number is odd");
//			
//			int fuck = 10;
//			if (fuck % 2 == 0) {
//				System.out.println("this number is even");
//			}else {
//				System.out.println("this number is odd");
//				}
//		}
////		if statement, else if statement, else statement
//		String month = "Jan";
//		if (month.equals("Jan")) {
//			System.out.println("this is the first month");
//		}else if (month.equals("Dec")); {
//			System.out.println("this is the last month");
//			
//		}
		
//		Switch Statement
		int today = 2;
		String currentDay;
		switch(today) {
			case 1: currentDay = "Mon";
			break;
			case 2: currentDay = "Tues";
			break;
			case 3: currentDay = "Wed";
			break;
			case 4: currentDay = "Thurs";
			break;
			case 5: currentDay = "Fri";
			break;
			case 6: currentDay = "Sat";
			break;
			case 7: currentDay = "Sun";
			break;
			default: currentDay = "incorrect number";
			}
		System.out.println("today is:"+currentDay);
		
			
	
		
	}

}
