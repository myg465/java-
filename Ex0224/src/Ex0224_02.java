import java.util.Scanner;

public class Ex0224_02 {

	public static void main(String[] args) {
		//2명의 학생-홍길동 100 100 90 이순신 80 90 70
		Student[]stu=new Student[2];//학생두명 배열// 값을 받을때는 [2][3]의 배열처럼 받음
		int stu_count=0;
		
		stu_count=input(stu,stu_count);
		
		
		System.out.println("입력된학생:"+stu_count);
		System.out.println(stu[0].name+"/"+stu[0].total+"/"+stu[0].avg);
		System.out.println(stu[1].name+"/"+stu[1].total+"/"+stu[1].avg);
		
	}
	
    static int input(Student[]stu,int stu_count) {
    	Scanner scan =new Scanner(System.in);
    	int[]score=new int[3];
    	for(int i=0;i<stu.length;i++) {
			System.out.println("이름을 입력하세요.");
			String name=scan.nextLine();
			for(int j=0;j<3;j++) {
				System.out.println("값을 입력하세요.>>");
				score[j]=scan.nextInt();
				scan.nextLine();
				
			}
			stu[i]=new Student(name,score[0],score[1],score[2]);
			stu_count++;
		}
    	return stu_count;
    }//main

}//class
