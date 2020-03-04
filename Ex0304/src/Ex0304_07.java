import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0304_07 {

	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format_time1=format1.format(today.getTime());
		System.out.println(today.getTimeInMillis());//현재날짜의 시간을 초로 반환해줌
		System.out.println();
		System.out.println("현재일시:"+format_time1);
		System.out.println("이해의 년도:"+today.get(Calendar.YEAR));
		System.out.println("월(0~11,0:1월):"+(today.get(Calendar.MONTH)+1));
		System.out.println("이해의 몇째주:"+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달의 몇째주:"+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("이달의 몇일:"+today.get(Calendar.DATE));
		System.out.println("이달의 몇일:"+ today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이해의 몇일:"+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7,1:일요일):"+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이달의 몇째요일:"+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후(0:오전,1:오후):"+today.get(Calendar.AM_PM));
		System.out.println("시간(0~11):"+today.get(Calendar.HOUR));
		System.out.println("시간(0~23):"+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59):"+today.get(Calendar.MINUTE));
		System.out.println("초(0~59):"+today.get(Calendar.SECOND));
		System.out.println("1000분의1초(0~999):"+today.get(Calendar.MILLISECOND));
		

	}

}
