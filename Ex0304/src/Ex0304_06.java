import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0304_06 {

	public static void main(String[] args) {
		//��¥
		Calendar today=Calendar.getInstance();//��¥�� ��������� Ŭ����(����ð��� ������)
	    SimpleDateFormat format1=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");//���ݳ�¥�� ���¸� ���ؼ�
		System.out.println(format1.format(today.getTime()));
		System.out.println("����⵵:"+today.get(Calendar.YEAR));
		System.out.println("�����:"+today.get(Calendar.MONTH+1));// ������ ��쿡�� 0���ͽ��ۿ�
		System.out.println("������:"+today.get(Calendar.DATE));

	}

}
