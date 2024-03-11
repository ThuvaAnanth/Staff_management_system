public class Sixth{
public static void main(String[]args){
	int dayNum= 4;
	String Day;
	
	  System.out.println("Value of the Day :",dayNum);
	 
	 Switch(dayNum){
		case 1 : Day="Monday";
			break;
		case 2 : Day="Tuesday";
			break;
		case 3 : Day="Wednesday";
			break;
		case 4 : Day="Thursday";
			break;
		case 5 : Day="Friday";
			break;
		case 6 : Day="Saturday";
			break;
		case 7 : Day="Sunday";
			break;
		default : Day="Invalid day...";
			break;
}
	  System.out.println("Day of the week : "+Day);
	  System.out.println("Good Bye");

  
}