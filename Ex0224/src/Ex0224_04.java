import java.util.Scanner;

public class Ex0224_04 {

	public static void main(String[] args) {
		//3명의 학생을 입력받아서 학번,이름,국어,영어,수학,합계,평균,등수
		//학번은 1에서부터 1씩증가-자동입력되도록
		//입력부분은 메소드로 분리
		//출력부분은 메소드로 분리
		//등수출력 메소드로 분리
		// 1. 학생성적입력 2. 학생성적출력  3.학생성적수정4.학생등수 입력 5.종료
        Scanner scan=new Scanner(System.in);
        int s_num=0;
        int end=0;
		Student[]stu=new Student[10];
		String[]sub= {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int count=0;
		loop1:while(true) {
			s_num=main_print();
			
			switch(s_num) {
			case 1:
				count=input_stu(stu,sub,count);
				System.out.println("학생성적 입력 완료");
				break;
			case 2:
				print_stu(stu,sub,count);
				System.out.println("학생성적 출력 완료");
				break;
			case 3:
				
				if(update_stu(stu,count)==-1) {
					break loop1;
				}
				System.out.println("학생성적 수정 완료");
				break;
			case 4:
				rank_stu(stu);
				break;
			case 5:
				break loop1;
			}//switch
			
			
			
		}//while
		System.out.println("시스템을 종료합니다.");
	}//main

	static int main_print() {
		int s_num=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("학생성적처리 프로그램");
		System.out.println("1)학생성적입력");
		System.out.println("2)학생성적출력");
		System.out.println("3)학생성적수정");
		System.out.println("4)학생등수입력");
		System.out.println("5)종료");
		System.out.println("원하는 번호를 선택하세요.");
		s_num=scan.nextInt();
		scan.nextLine();
		return s_num;
	}
	
	static int input_stu(Student[]stu,String[]sub,int count) {
		Scanner scan=new Scanner(System.in);
		System.out.println("학생성적 입력을 선택하였습니다.");
		int[]score=new int[3];
		String name="";
		for(int i=count;i<stu.length;i++) {
			System.out.println((count+1)+"번째 학생의 이름을 입력하세요.(상위이동:0)");
			name=scan.nextLine();
			if(name.equals("0")) {
				break;
			}
			for(int j=0;j<score.length;j++) {
				System.out.println(name+"학생의 "+sub[j+2]+"성적을 입력하세요.");
				score[j]=scan.nextInt();
				if(!(score[j]>=0&&score[j]<=100)) {
					System.out.println("숫자를 잘못 입력하였습니다.");
				    j--;
				    continue;
				}
			}
			scan.nextLine();
			stu[i]=new Student(name,score[0],score[1],score[2]);
			count++;
		}
		
		return count;
	}
	
	
	static void print_stu(Student[]stu,String[]sub,int count) {
		System.out.println("학생성적 출력을 선택하였습니다.");
		for(int i=0;i<sub.length;i++) {
			System.out.print(sub[i]+"\t");
		}System.out.println();
		for(int i=0;i<count;i++) {
			System.out.print(stu[i].hak_num+"\t"+stu[i].name+"\t"+stu[i].kor+"\t"+stu[i].eng+"\t"+stu[i].math+"\t"+stu[i].total+"\t"+stu[i].avg+"\t"+stu[i].rank+"\t");
		    System.out.println();
		}
	}
	
	
	static int update_stu(Student[]stu,int count) {//성적수정
		Scanner scan=new Scanner(System.in);
		int s_num=0;
		String input="";
		boolean check=false;
		System.out.println("학생성적 수정을 선택하였습니다.");
		System.out.println("수정을 원하는 학생의 이름을 입력하세요.(상위이동:0,종료:-1)");
		input=scan.nextLine();
		if(input.equals("0")) {
			return 0;
		}
		if(input.equals("-1")) {
			return -1;
		}
		while(true) {
		for(int i=0;i<count;i++) {
			if(input.equals(stu[i].name)) {
				check=true;
				System.out.println(stu[i].name+"학생이 검색되었습니다.");
				System.out.println("1)국어 2)영어 3)수학 4)이름수정 0)이전화면");
				System.out.println("수정을 원하는 번호를 입력하세요.");
				s_num=scan.nextInt();
				scan.nextLine();
				switch(s_num) {
				case 1:
					sw_modify(stu,s_num,i);
					break;
				case 2:
					sw_modify(stu,s_num,i);
					break;
				case 3:
					sw_modify(stu,s_num,i);
//					System.out.println("현재수학점수:"+stu[i].math);
//					System.out.println("새로운 수학성적을 입력하세요.");
//					stu[i].math=scan.nextInt();
//					stu[i].modify();
//					System.out.println("국어점수가"+stu[i].math+"로 수정되었습니다.");
					break;
				case 4:
					System.out.println("현재이름:"+stu[i].name);
					System.out.println("새로운 이름을 입력하세요.");
					stu[i].name=scan.nextLine();
					System.out.println("이름이"+stu[i].name+"로 수정되었습니다.");
					break;
				case 0:
					System.out.println("이전화면으로 돌아갑니다.");
					return 1;
				}//switch
				break;
			}//if
			
		}//for
		if(check==false) {
			System.out.println("학생을 찾을수 없습니다.");
			return 2;
		}
		
		}
		
	}//method(성적수정)
	
	
	static void rank_stu(Student[]stu) {
		System.out.println("등수입력을 선택하였습니다.");
		int count=1;
		for(int i=0;i<stu.length;i++) {
			count=1;
			for(int j=0;j<stu.length;j++) {
				if(stu[i].total<stu[j].total) {
					count++;
				}
			}
			stu[i].rank=count;
		}
		System.out.println("등수입력이 완료되었습니다.");
	}
	
	static void sw_modify(Student[]stu,int s_num,int i) {
		Scanner scan=new Scanner(System.in);
		String[]sub= {"국어","영어","수학"};
		if(s_num==1) {
			System.out.println("현재"+sub[s_num-1]+"점수:"+stu[i].kor);
			System.out.println("새로운"+sub[s_num-1]+"성적을 입력하세요.");
			stu[i].kor=scan.nextInt();
			System.out.println(sub[s_num-1]+"점수가"+stu[i].kor+"으로 수정되었습니다.");
			scan.nextLine();
		}
		else if(s_num==2){
			System.out.println("현재"+sub[s_num-1]+"점수:"+stu[i].eng);
			System.out.println("새로운"+sub[s_num-1]+"성적을 입력하세요.");
			stu[i].eng=scan.nextInt();
			System.out.println(sub[s_num-1]+"점수가"+stu[i].eng+"으로 수정되었습니다.");
			scan.nextLine();		
		}
		else if(s_num==3) {
			System.out.println("현재"+sub[s_num-1]+"점수:"+stu[i].math);
			System.out.println("새로운"+sub[s_num-1]+"성적을 입력하세요.");
			stu[i].math=scan.nextInt();
			System.out.println(sub[s_num-1]+"점수가"+stu[i].eng+"으로 수정되었습니다.");
			scan.nextLine();
		}
		
		stu[i].modify();
	}
	
}//class
