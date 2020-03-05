import java.util.ArrayList;
import java.util.Scanner;

public class Mall_excute {
//명령어(메소드)

	Scanner scan=new Scanner(System.in);
	String[]sub_member= {"아이디","패스워드","이름","전화번호","보유금액","보유포인트"};
	ArrayList<Member>memArr=new ArrayList<Member>();
	ArrayList<Login>s_login=new ArrayList<Login>();
	
	
	int print_main() {
		System.out.println("[하이마트]");
		System.out.println("1) 회원가입 2) 로그인 3) 상품보기 ");
		System.out.println("7) 로그아웃 8) 회원검색 9) 회원정보전체출력 0) 종료");
		System.out.println("번호를 입력해주세요");
		int s_num=scan.nextInt();
		scan.nextLine();
		return s_num;
	}
	
	void login() {
		loop1:while(true) {
			String[]login_check=new String[2];
			for(int i=0;i<login_check.length;i++) {
				System.out.println(sub_member[i]+"를 입력하세요.");
				login_check[i]=scan.nextLine();
			}
			boolean check=false;
			for(int i=0;i<memArr.size();i++) {
				Member ch=(Member)memArr.get(i);
				if(login_check[0].equals(ch.getId())&&login_check[1].equals(ch.getPw())) {
					System.out.println("로그인이 완료되었습니다.");
					s_login.add(new Login(ch.getId()));
					check=true;
					break loop1;
				}
			}
			if(check==false) {
				System.out.println("아이디나 패스워드가 일치하지 않습니다.");
				System.out.println("회원가입을 하시겠습니까?(y/n)");
				if(scan.nextLine().equalsIgnoreCase("y")) {
					System.out.println("회원가입 화면으로 이동합니다.");
					join();
					break loop1;
				}
				continue;
			}
			
		}
		
	}//로그인 메소드
	
    void logout() {
	   s_login.clear();
    }//로그아웃 메소드
	
	void join() {
		System.out.println("[회원가입]");
		String[]info=new String[4];
		loop2:while(true) {
			System.out.println("사용할 아이디를 입력하세요.(3자이상)(이전메뉴:0)");
			info[0]=scan.nextLine();
			if(back(info[0])==0) {
				System.out.println("이전메뉴로 이동합니다.");
				return;
			}
			for(int i=0;i<memArr.size();i++) {
			     Member m=(Member)memArr.get(i);
			     if(info[0].equals(m.getId())) {
			    	 System.out.println("중복된 아이디가 있습니다.");
			    	 continue loop2;
			        }
			    }//중복검사 for
			if(info[0].length()<3) {
				System.out.println("아이디는 3자 이상이어야 합니다.");
				continue;
			}
			break;
		}//아이디while
		
		while(true) {
			System.out.println("비밀번호를 입력해 주세요.");
			info[1]=scan.nextLine();
			if(info[1].length()<8) {
				System.out.println("비밀번호는 8자 이상이어야 합니다.");
				continue;
			}
			break;
			
		}//비밀번호 while
		
		System.out.println("이름을 입력해 주세요.");
		info[2]=scan.nextLine();
		
		
		System.out.println("전화번호를 입력해 주세요.");
		info[3]=scan.nextLine();
			
			
		memArr.add(new Member(info[0],info[1],info[2],info[3]));
	}//join 메소드
	
	void print_sp() {
		while(true) {
			System.out.println("검색을 원하는 이름을 입력하세요.(이전메뉴:0)");
			String check_name=scan.nextLine();
			if(back(check_name)==0) {
				System.out.println("이전메뉴로 이동합니다.");
				return;
			}
			for(int i=0;i<memArr.size();i++) {
				Member sp=(Member)memArr.get(i);
				if(sp.getName().contains(check_name)) {
					print_mem(i);
				}
			}
			
		}
	}//회원 검색출력 메소드
	
	
	void print_mem(){
		System.out.println("[회원정보 전체출력]");
		for(int i=0;i<sub_member.length;i++) {
			System.out.print(sub_member[i]+"\t");
		}System.out.println();
		for(int i=0;i<memArr.size();i++) {
			System.out.println(memArr.get(i));
		}
	}// 회원전체출력 메소드
	void print_mem(int j){
		System.out.println("[회원정보출력]");
		for(int i=0;i<sub_member.length;i++) {
			System.out.print(sub_member[i]+"\t");
		}System.out.println();
		for(int i=j;i<j+1;i++) {
			System.out.println(memArr.get(i));
		}
	}// 회원검색출력 메소드(오버로딩)
	
	int back(String check) {
		if(check.equals("0")) {
			return 0;
		}
		return 1;
	}//(기능)뒤로가기
	
	int buy() {
	    while(true) {
	    	if(s_login.isEmpty()) {//로그인 검증
	    		System.out.println("로그인 후 사용가능합니다.");
	    		return -2;
	    	}
	    }
	}//구매
	
	
	
}//class
