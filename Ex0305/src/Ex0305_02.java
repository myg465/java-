import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0305_02 {

	public static void main(String[] args) {
		
		Calendar cal1=Calendar.getInstance();//��ü����
		Calendar cal2=Calendar.getInstance();// �߻�Ŭ������ �Ϲ� ��ü�������� ��������
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal1.getTime()));
		
		System.out.println("����ð� �ʷ�ȯ�� ���:"+(cal1.getTimeInMillis()/1000));//����ð��� �ʷ� ȯ���Ѱ�(������ �и�������)
		cal1.set(2020, 2, 14, 15, 39, 42);
		cal2.set(2021, 3, 14, 12, 59, 59);
		long between=((cal1.getTimeInMillis()/1000)-(cal2.getTimeInMillis()/1000));
		System.out.println("�Ⱓ���� ��ȯ��:"+between);
		long day=between/(24*60*60*1);
		long hour=(between%(24*60*60*1))/(60*60*1);
		long minute=((between%(24*60*60*1))%(60*60*1))/60;
		long second=((((between%(24*60*60*1))%(60*60*1))%60)/1);
		
		System.out.println(day+"��"+hour+"��"+minute+"��"+second+"��");
		

	}

}
