
public class ershier {
	public static void main(String [] args) {
	int yr=2017, no=10;
	String mth="October", week="Tuesday";
	System.out.println(week+", "+mth+" "+no+", "+yr);
	System.out.println(week+" "+no+" "+mth+" "+yr);
	int hr=11, min=59,sec=50;
	System.out.println(hr+":"+min+":"+sec);
	System.out.println("seconds since midnight is "+hr*3600+min*60+sec+" seconds");
	System.out.println("seconds remained is "+(24-hr)*3600+(60-59)*60+(60-sec)+" seconds");
	double y=((11.0*3600.0+59.0*60+50.0)/(24.0*3600.0));
	System.out.println(y);
	int hour=12, minute=5,second=45;
	String timefinished=hour+":"+minute+":"+second;
	System.out.println(timefinished);
	}
}
