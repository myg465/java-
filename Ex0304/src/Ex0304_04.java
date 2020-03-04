import java.util.Scanner;

public class Ex0304_04 {

	public static void main(String[] args) {
		// 주민번호를 받아서 이 사람이 남자인지 여자인지 확인
		// 컴퓨터학과 c0001 / 영문학과 e0002/ 국문학과 k0003 학번을 입력받아 무슨과인지 확인
		// 대한항공 KE ke,아시아나항공 OZ oz, 에어프랑스 항공 AF af 항공사확인
		//이메일을 입력받으면(골뱅이있는지 체크, 점(.)이있는지 체크)
		
		Scanner scan=new Scanner(System.in);
		loop:while(true) {
		     System.out.println("[각종프로그램]");
		     System.out.println("1)남녀확인 2) 학과확인 3)항공사확인 4)이메일 검증 5)비밀번호 검증 0)종료");
		     System.out.println("숫자를 입력하세요.");
		     int s_num=scan.nextInt();
		     scan.nextLine();
			switch(s_num) {
			case 1:
				loop1:while(true) {
					
					System.out.println("주민번호를 입력하세요.");
					String id=scan.nextLine();
					if(!(id.length()==13)) {
						System.out.println("13자리의 번호를 입력하세요.");
						continue;
					}
					for(int i=0;i<id.length();i++) {
						if(!(id.charAt(i)>='0'&&id.charAt(i)<='9')) {
							System.out.println("숫자만 입력하세요.");
							continue loop1;
					}
					
					if(id.charAt(6)=='1'||id.charAt(6)=='3') {
					System.out.println("남자");
					}
					else if(id.charAt(6)=='2'||id.charAt(6)=='4') {
					System.out.println("여자");
					       }
						}
					break;
				}
				break;
			case 2:
				System.out.println("학번을 입력하세요.");
				String hak=scan.nextLine();
				if(hak.contains("c")) {
					System.out.println("컴퓨터 공학과");
				}
				else if(hak.contains("e")) {
					System.out.println("영문학과");
				}
				else if(hak.contains("k")) {
					System.out.println("국문학과");
				}
				break;
			case 3:
				// 대한항공 KE ke,아시아나항공 OZ oz, 에어프랑스 항공 AF af 항공사확인
				System.out.println("코드를 입력하세요.");
				String co=scan.nextLine();
				if(co.equalsIgnoreCase("ke")) {
					System.out.println("대한항공");
				}
				else if(co.equalsIgnoreCase("oz")) {
					System.out.println("아시아나항공");
				}
				else if(co.equalsIgnoreCase("af")) {
					System.out.println("에어프랑스항공");
				}
				break;
				
			case 4:
				System.out.println("이메일을 입력하세요.");
				String email=scan.nextLine();
				if(!(email.contains("@")&&(email.contains(".")))) {
				   System.out.println("양식에 맞게 입력해주세요.");
				}
				break;
				//비밀번호 특수문자1개포함,대문자1개포함,길이는 8자이상
				//비밀번호를 입력 앞뒤 빈공백을 입력하시면 안됩니다.
				//비밀번호 입력받아서 공백받으면 입력값을 출력
			case 5:
				System.out.println("비밀번호를 입력하세요.");
				String pw=scan.nextLine();
				pw=pw.trim();// 앞뒤공백만 지운다.
				pw=pw.replaceAll(" ", "");
				if(!(pw.length()>=8)) {
					System.out.println("비밀번호는 8자 이상이어야 합니다.");
					break;
				}
				boolean check=false;
				for(int i=0;i<pw.length();i++) {
					if(pw.charAt(i)>='A'&&pw.charAt(i)<='Z') {
						check=true;
					}
				}
				if(check==false) {
					System.out.println("대문자가 1개 이상 포함되어야 합니다.");
				}
				
				System.out.println("입력 패스워드:"+pw);
				System.out.println("패스워드길이:"+pw.length());
				//특수문자 검증 : 대문자 소문자 제외 숫자 제외하면 됨
				
				
				break;
			case 0:
				break loop;
			
			}//switch
			
			
			//주민번호를 입력받는데 -를 기준으로 분리
			//전화번호를 받는데 -를 기준으로 분리해서 출력 
			//비밀번호를 입력 앞뒤 빈공백을 입력하시면 안됩니다.
			//비밀번호 입력받아서 공백받으면 입력값을 출력
			System.out.println("주민번호를 입력하세요.");
			String id=scan.nextLine();
			String[]id_a=id.split("-");
			for(int i=0;i<id_a.length;i++) {
				System.out.println(id_a[i]);
				System.out.println("---------");
			}
			
			System.out.println("전화번호를 입력하세요.");
			String tel=scan.nextLine();
			String[]tel_a=tel.split("-");
			for(int i=0;i<tel_a.length;i++) {
				System.out.println(tel_a[i]);
				System.out.println("---------");
			}
		}//while

	}//main

}//class
