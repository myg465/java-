import java.util.*;

public class Ex0305_03 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		ArrayList list2=new ArrayList();
		Student stu1=new Student(1,"ȫ�浿",300);
		Student stu2=new Student(2,"�̼���",299);
		Student stu3=new Student(3,"������",280);
		Student stu4=new Student(4,"������",270);
		Student stu5=new Student(5,"������",288);
		list2.add(stu3);
		list2.add(stu1);
		list2.add(stu5);
		list2.add(stu2);
		list2.add(stu4);
		
		
		
		Collections.sort(list2);
		Collections.reverse(list2);
		
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
		
		
		list.add(new Integer(5));//������ ���� Ŭ���� 5�� �߰�
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		list.add(3);//�⺻�� Ÿ���� ������ �ڵ����� ��ü�� ��ȯ�ؼ� �־���(����ڽ�)
		list.add(3, new Integer(7));// ��ġ�� ���Ҽ� �ִ�.
		list.add(5, new Integer(8));

		
		list.clear();//������ �������� ���
		list.remove(1);//�ε�����ȣ�� ������ �� ����
		for(int i=0;i<list.size();i++) {// �پ�������(�ϳ��� ����� ���� ��ĭ���ø���, ����������� ������ĭ���ø���
			list.remove(i);
		}
		for(int i=list.size()-1;i>=0;i--) {//���ʺ��� ������ ������
			list.remove(i);
		}
		
		
		
		
	    Collections.sort(list);
	    Collections.reverse(list);
		
		
		
		System.out.println(list);//toString�� �Ǿ�����

	}

}
