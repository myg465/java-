import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Ex0302_02 {

	public static void main(String[] args) {
		
		// Student
		// 학생 10명 성적받기 상적처리 프로그램
		// Student[]stu=new Student[10];-> Vector list =new Vector();
	    Scanner scan=new Scanner(System.in);
		ArrayList<Student>list=new ArrayList<Student>();
//	    Student[]stu=new Student[10];
		
		String[]name1= {"홍길동","이순신","김유신"};
		int[]kor1= {100,90,95};
		int[]eng1= {80,70,89};
		
		list.add(new Student(name1[0],kor1[0],eng1[0]));
		list.add(new Student(name1[1],kor1[1],eng1[1]));
		list.add(new Student(name1[2],kor1[2],eng1[2]));

		if(list.isEmpty()) {
			System.out.println("학생입력이 없습니다.");
		}
		else {
			for(int i=0;i<list.size();i++) {
				Student s = (Student)list.get(i);//s는 임시객체
				System.out.print(s.hak_num+"\t");
				System.out.print(s.name+"\t");
				System.out.print(s.kor+"\t");
				System.out.print(s.eng+"\t");
				System.out.print(s.total+"\t");
				System.out.print(s.avg+"\t");
				System.out.println();
			}
		}
		
		
//		String name="";
//		int kor=0;
//		int eng=0;
//		
//		while(true) {//무한대로 넣을수 있음
//			
//			System.out.println("이름을 입력해 주세요.>>");
//			name=scan.nextLine();
//			System.out.println("국어 점수를 입력하세요.>>");
//			kor=scan.nextInt();
//			System.out.println("영어 점수를 입력하세요.>>");
//			eng=scan.nextInt();
//			scan.nextLine();
//			list.add(new Student(name,kor,eng));
//			System.out.println("1명 성적 추가가 되었습니다.");
//			
//		}
		

	}

}
