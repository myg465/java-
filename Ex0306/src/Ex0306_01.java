import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ex0306_01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Student> list=new ArrayList<Student>();
		int[]hak_num= {1001,1002,1003};
		String[]name= {"ȫ�浿","�̼���","������"};
		int[]total= {299,288,300};
		for(int i=0;i<hak_num.length;i++) {
			list.add(new Student(hak_num[i],name[i],total[i]));
		}
		
		while(true) {
			System.out.println("1)�й����� 2) �̸����� 3)��������");
			int num=scan.nextInt();
			switch(num) {
			case 1://�й�����
                Collections.sort(list,new Comparator<Student>() {
					@Override
					public int compare(Student s1, Student s2) {//s1������ ��,s2�����ǰ�
						if(s1.hak_num<s2.hak_num) {
							return -1;
						}
						else if(s1.hak_num>s2.hak_num) {
							return 1;
						}
						return 0;
					}
                });
                 for(int i=0;i<list.size();i++) {
                	 System.out.println(list.get(i));
                 }
				break;
			case 2://�̸�����
				Collections.sort(list,new Comparator<Student>() {
					@Override
					public int compare(Student s1, Student s2) {
						return s1.name.compareTo(s2.name);
					}
				});
				for(int i=0;i<list.size();i++) {
               	 System.out.println(list.get(i));
                }
				break;
			case 3:
				Collections.sort(list,new Comparator<Student>() {
					@Override
					public int compare(Student s1, Student s2) {
						if(s1.total<s2.total) {
							return -1;
						}
						else if(s1.total>s2.total) {
							return 1;
						}
						return 0;
					}
				});
				for(int i=0;i<list.size();i++) {
               	 System.out.println(list.get(i));
                }
				break;
			}
		}//while

	}//main

}//class
