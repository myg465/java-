import java.util.HashMap;
import java.util.Scanner;

public class Ex0306_03 {

	public static void main(String[] args) {
		//map사용
		Scanner scan=new Scanner(System.in);
		HashMap map=new HashMap();
		map.put("myid","m1234");
		map.put("aaa","a1234");
		map.put("koitt", "k0001");
		map.put("bbb", "b1111");
		map.put("dream", "d0001");
		
		while(true) {
			System.out.println("id와 password를 입력하세요.(대소문자 구별)");
			System.out.print("id:");
			String id=scan.nextLine().trim();
			if(!(map.containsKey(id))) {
				System.out.println("입력한 id가 없습니다.다시 입력하세요.");
				continue;
			}
			System.out.print("pw:");
			String pw=scan.nextLine().trim();
			if(!(map.get(id).equals(pw))) {
				System.out.println("패스워드가 일치하지 않습니다.다시 입력하세요.");
				continue;
			}
			else {
				System.out.println("로그인이 되었습니다.");
			    break;
			}
			
			
			
			
			
			
			
		}
		System.out.println("시스템을 종료합니다.");

	}//main

}//class
