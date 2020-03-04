import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0304_06 {

	public static void main(String[] args) {
		//날짜
		Calendar today=Calendar.getInstance();//날짜를 가지고오는 클래스(현재시간을 가져옴)
	    SimpleDateFormat format1=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");//지금날짜를 형태를 정해서
		System.out.println(format1.format(today.getTime()));
		System.out.println("현재년도:"+today.get(Calendar.YEAR));
		System.out.println("현재월:"+today.get(Calendar.MONTH+1));// 월같은 경우에는 0부터시작욈
		System.out.println("현재일:"+today.get(Calendar.DATE));

	}

}
