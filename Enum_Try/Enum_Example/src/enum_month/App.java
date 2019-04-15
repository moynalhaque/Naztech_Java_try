package enum_month;

enum Month_1 {
	JANUARY,FEBRUARY,MARCH,APRIL,
	MAY,JUNE,JULY,AUGUST,SEPTEMBER,
	OCTOBER,NOVEMBER,DECEMBER;
}

public class App {
	
	 Month_1 month;
	    
	    public App(Month_1 month) {
	    	this.month=month;
	    }
	    
	    
	    public void getChooseMonth() {
	    	
	 
			switch(month) {
			
			case JANUARY:
				System.out.println("This is JANUARY");
				break;
				
			case FEBRUARY:
				System.out.println("This is FEBRUARY");
				break;
			
		    case MARCH:
			   System.out.println("This is MARCH");
			   break; 

	        case APRIL:
		       System.out.println("This is APRIL");
		       break;

	        case MAY:
	         System.out.println("This is MAY");
	         break;

	       case JUNE:
	         System.out.println("This is JUNE");
	         break;

	       case JULY:
	         System.out.println("This is JULY");
	         break;

	       case AUGUST:
	         System.out.println("This is AUGUST");
	         break;

	       case SEPTEMBER:
	          System.out.println("This is SEPTEMBER");
	          break;

	       case OCTOBER:
	       System.out.println("This is OCTOBER");
	       break;

	       case NOVEMBER:
	        System.out.println("This is NOVEMBER");
	        break;

	        case DECEMBER:
	        System.out.println("This is DECEMBER");
	        break;

	       default:
	       System.out.println("In South Direction");
	       break;
		}
	}
	    
	

	public static void main(String[] args) {
		String str = "appa"; 
		App a1=new App(Month_1.valueOf(str));
		a1.getChooseMonth();
	}

}
