import java.util.ArrayList;
import java.util.Scanner;

public class Studenttest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		ArrayList<Student>stu=new ArrayList<Student>();
		stu.add(new Student("홍길동",90,70,60));
		stu.add(new Student("이순신",45,33,87));
		stu.add(new Student("강감찬",55,66,56));
		stu.add(new Student("김유신",99,100,45));
		String[]sub= {"학번","이름","국어","영어","수학","합계","평균","등수"};
		loop:while(true) {
			System.out.println("[학생 성적 프로그램]");
			System.out.println("1)학생입력 2)학생 출력 3)등수 입력 4)학생검색 0)종료");
			System.out.println("원하는 번호를 입력하세요.");
			int s_num=scan.nextInt();
			scan.nextLine();
			switch(s_num) {
			case 1:
				System.out.println("[학생입력]");
				while(true) {
					System.out.println((stu.size()+1)+"번째 학생의 이름을 입력하세요.(상위:0)");
					String name=scan.nextLine();
					if(name.equals("0")) {
						System.out.println("상위메뉴로 이동합니다.");
						break;
					}
					int[]score=new int [3];
					for(int i=0;i<score.length;i++) {
						System.out.println(name+"학생의"+sub[i+2]+"성적을 입력하세요.");
						score[i]=scan.nextInt();
						scan.nextLine();
					}
					stu.add(new Student(name,score[0],score[1],score[2]));
				}
				break;
			case 2:
				System.out.println("[학생출력]");
				if(stu.isEmpty()) {
					System.out.println("데이터가 없습니다.");
					break;
				}
				for(int i=0;i<sub.length;i++) {
					System.out.print(sub[i]+"\t");
				}System.out.println();
				for(int i=0;i<stu.size();i++) {
					System.out.println(stu.get(i));
				}
				
				break;
			case 3:
				int count=1;
				for(int i=0;i<stu.size();i++) {
					count=1;
					Student s1=(Student)stu.get(i);
					for(int j=0;j<stu.size();j++) {
						Student s2=(Student)stu.get(j);
						if(s1.sum<s2.sum) {
							count++;
						}
					}
					s1.rank=count;
				}
				
				System.out.println("등수입력이 완료 되었습니다.");
				break;
			case 4:
				while(true) {
					boolean check=false;
					System.out.println("[학생검색]");
					System.out.println("검색을 원하는 학생의 이름을 입력하세요.(상위:0)");
					String s_name=scan.nextLine();
					if(s_name.equals("0")) {
						System.out.println("상위메뉴로 이동합니다.");
						break;
					}
					for(int i=0; i<stu.size();i++) {
						Student s_stu=(Student)stu.get(i);
						if(s_stu.name.contains(s_name)) {
							for(int j=0;j<sub.length;j++) {
								System.out.print(sub[j]+"\t");
							}System.out.println();
							System.out.println(s_stu);
							check=true;
						}
					}
					if(check==false) {
						System.out.println("찾는 학생이 없습니다.");
						continue;
					}
				}
				break;
			case 0:
				break loop;
			default:
				System.out.println("번호를 잘못 입력하였습니다.");
				break;
			}//switch
			
		}//while
System.out.println("시스템을 종료합니다.");
	}//main

}//class
class Student{
	final int hak_num;
	static int count=0;
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float avg;
	int rank;
	{
		hak_num=++count;
	}
	Student(){
		
	}
	Student(String name, int kor, int eng, int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		cal(kor,eng,math);
	}
	void cal(int a,int b,int c) {
		sum=a+b+c;
		avg=((int)(sum/3.0)*10)/10f;
	}
	
	public String toString() {
		return hak_num+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+rank+"\t";
	}
}
