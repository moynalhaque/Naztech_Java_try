package enum_month;


public enum Month {
	
JANUARY("JANUARY",31),FEBRUARY("FEBRUARY",28),MARCH("MARCH",31),APRIL("APRIL",30),
MAY("MAY",31),JUNE("JUNE",30),JULY("JULY",31),AUGUST("AUGUST",31),SEPTEMBER("SEPTEMBER",30),
OCTOBER("OCTOBER",31),NOVEMBER("NOVEMBER",30),DECEMBER("DECEMBER",31);
	
	private final String month_name;
	private final int day_num;
	static String mon;
	Month(String month_name,int day_num){
		this.month_name=month_name;
		this.day_num=day_num;
	}
	
	
	
	public String getMonth_name() {
		return month_name;
	}



	public int getDay_num() {
		return day_num;
	}
	
	public static String contains(String s) {
		for(Month choice:values()) {
			if(choice.getMonth_name().substring(0, 3).equals(s)||choice.getMonth_name().equals(s)) {
				mon=choice.getMonth_name();
			}
			
		}
		return mon;
	}

}

