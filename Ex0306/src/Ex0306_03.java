import java.util.HashMap;
import java.util.Scanner;

public class Ex0306_03 {

	public static void main(String[] args) {
		//map���
		Scanner scan=new Scanner(System.in);
		HashMap map=new HashMap();
		map.put("myid","m1234");
		map.put("aaa","a1234");
		map.put("koitt", "k0001");
		map.put("bbb", "b1111");
		map.put("dream", "d0001");
		
		while(true) {
			System.out.println("id�� password�� �Է��ϼ���.(��ҹ��� ����)");
			System.out.print("id:");
			String id=scan.nextLine().trim();
			if(!(map.containsKey(id))) {
				System.out.println("�Է��� id�� �����ϴ�.�ٽ� �Է��ϼ���.");
				continue;
			}
			System.out.print("pw:");
			String pw=scan.nextLine().trim();
			if(!(map.get(id).equals(pw))) {
				System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.�ٽ� �Է��ϼ���.");
				continue;
			}
			else {
				System.out.println("�α����� �Ǿ����ϴ�.");
			    break;
			}
			
			
			
			
			
			
			
		}
		System.out.println("�ý����� �����մϴ�.");

	}//main

}//class
