import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0305_02 {

	public static void main(String[] args) {
		
		Calendar cal1=Calendar.getInstance();//객체선언
		Calendar cal2=Calendar.getInstance();// 추상클래스라서 일반 객체선언으로 못가져옴
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal1.getTime()));
		
		System.out.println("현재시간 초로환산 결과:"+(cal1.getTimeInMillis()/1000));//현재시간을 초로 환산한것(원래는 밀리세컨드)
		cal1.set(2020, 2, 14, 15, 39, 42);
		cal2.set(2021, 3, 14, 12, 59, 59);
		long between=((cal1.getTimeInMillis()/1000)-(cal2.getTimeInMillis()/1000));
		System.out.println("기간동안 초환산:"+between);
		long day=between/(24*60*60*1);
		long hour=(between%(24*60*60*1))/(60*60*1);
		long minute=((between%(24*60*60*1))%(60*60*1))/60;
		long second=((((between%(24*60*60*1))%(60*60*1))%60)/1);
		
		System.out.println(day+"일"+hour+"시"+minute+"분"+second+"초");
		

	}

}
