import java.util.Scanner;

public class Ex0303_03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String name="";
		int kor=0;
		int eng=0;
		System.out.println("이름을 입력하세요.");
		name=scan.nextLine();
		System.out.println("국어점수를 입력하세요.");
		kor=scan.nextInt();
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			e.printStackTrace();// 어디서,어떤에러가 났는지 띄워주는 메소드
			System.out.println();
		}
		System.out.println("영어점수를 입력하세요.");
		eng=scan.nextInt();
		
		
		
		
//	
		System.out.println(6);

	}

}
