import java.util.*;


public class Ex0306_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//set ->4,6,57,3,2,10 저장하여 출력하기
		//map -> 1,개 /2,소/3,말/4,범/5,돼지
		//로그인 형태를 만들어 보고 map 모두 출력하기
		
		HashSet s1=new HashSet();
		HashMap m1=new HashMap();
		int[]set= {4,6,57,3,2,10};
		for(int i=0;i<set.length;i++) {
			s1.add(set[i]);
		}
		String[]map= {"개","소","말","범","돼지"};
		for(int i=0;i<map.length;i++) {
			m1.put((i+1), map[i]);
		}
		
		while(true) {
			System.out.println("1)set출력 2) 로그인 3) map출력");
			switch(scan.nextInt()) {
			case 1:
				Iterator it3=s1.iterator();
				while(it3.hasNext()) {
					System.out.println(it3.next());
				}
				break;
			case 2:
				while(true) {
					System.out.println("아이디와 비밀번호를 입력하세요.");
					System.out.print("id:");
					int id=scan.nextInt();
					scan.nextLine();
					if(!(m1.containsKey(id))) {
						System.out.println("id가 틀렸습니다.");
						continue;
					}
					
					System.out.print("pw:");
					String pw =scan.nextLine().trim();
					if(!(m1.get(id).equals(pw))) {
						System.out.println("비밀번호가 일치하지 않습니다.");
						continue;
					}
					System.out.println("로그인이 완료되었습니다.");
					break;
					
					//비밀번호
				}
				break;
			case 3:
				Iterator it4=m1.entrySet().iterator();
				while(it4.hasNext()) {
					System.out.println(it4.next());
				}
				break;
			}
		}//while

	}

}
