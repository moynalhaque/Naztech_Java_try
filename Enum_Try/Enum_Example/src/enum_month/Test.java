package enum_month;

public class Test {

	public static void main(String[] args) {
		
//		Month[] months=Month.values();
//		for(Month month:months) {
//			System.out.println("Month name="+month.getMonth_name()+""+month.getDay_num());
//		}
		
		String monthName=Month.contains("qwe");
		if(monthName==null) {
			System.out.println("Not found");
		}else {
			System.out.println(monthName);
		}
		
	}

}
