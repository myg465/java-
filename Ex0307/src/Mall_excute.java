import java.util.*;

public class Mall_excute {
//명령어(메소드)

	Scanner scan = new Scanner(System.in);
	String[] sub_member = { "이름", "전화번호", "보유금액", "보유포인트", "가입일자", "아이디", "패스워드" };
	ArrayList<Member> memArr = new ArrayList<Member>();// 회원가입 정보 리스트
	ArrayList<Cart> cart = new ArrayList<Cart>();// 구매정보 저장 리스트
	HashMap idpw = new HashMap();// 아이디비밀번호 저장 해시맵
	HashMap login = new HashMap();// 로그인 체크 해시맵
	String[] id_test = { "asasa", "qwqwq", "zxzxz", "erere" };// 더미 데이터
	String[] pw_test = { "12345678", "23456789", "34567890", "01234567" };
	String[] name_test = { "홍길동", "이순신", "김유신", "홍길순" };
	String[] tel_test = { "010-2934-3385", "02-399-3355", "070-2283-1122", "02-3944-4965" };
	String adminid = "admin";// 관리자아이디
	String adminpw = "1234";//관리자 패스워드
	String temp;// 로그인아이디 임시저장
    Member buy_temp=new Member();//로그인 고객 임시저장
	void test() {
		for (int i = 0; i < id_test.length; i++) {
			memArr.add(new Member(id_test[i], name_test[i], tel_test[i]));
			idpw.put(id_test[i], pw_test[i]);
		}
	}

	int print_main() {
		System.out.println("[하이마트]   (99번 테스트용 더미입력)");
		System.out.println("1) 회원가입 2) 로그인 3) 상품보기 ");
		System.out.println("4) 마이페이지 5) 관리자모드 0) 종료 ");
		System.out.println("번호를 입력해주세요");
		int s_num = scan.nextInt();
		scan.nextLine();
		return s_num;
	}

	int login() {
		loop1:while (true) {
			if (login.isEmpty()) {
				boolean check = false;
				System.out.println("아이디와 비밀번호를 입력해주세요.(대소문자를 구분합니다./ 회원가입이동:0)");
				System.out.print("id:");
				String id = scan.nextLine();
				if(id.equals("0")) {
					System.out.println("회원가입 페이지로 이동합니다.");
					join();
					return 1;
				}
				if (!(idpw.containsKey(id))) {
					System.out.println("아이디가 일치하지 않습니다.");
					continue;
				}
				System.out.println("pw:");
				String pw = scan.nextLine();
				if (!(idpw.get(id).equals(pw))) {
					System.out.println("패스워드가 일치하지 않습니다.");
					System.out.println("회원가입을 하시겠습니까?(y/n)");
					if (scan.nextLine().equalsIgnoreCase("y")) {
						System.out.println("회원가입 화면으로 이동합니다.");
						join();
						return 1;
					}
					else {
						continue;
					}
				}
				login.put(id, pw);
				temp=id;
				for(int i=0;i<memArr.size();i++) {
					Member m=(Member)memArr.get(i);
					if(id.equals(m.getId())) {
						buy_temp=m;
					}
				}
				break;
			} else {
				System.out.println("로그인이 되어있습니다. 로그아웃 화면으로 이동합니다.");
				logout();
				break loop1;
			}

		} // while
	return 0;
	}// 로그인 메소드

	void logout() {
		System.out.println("로그아웃을 하시겠습니까?");
		if (scan.nextLine().equalsIgnoreCase("y")) {
			if (!(login.isEmpty())) {
				login.clear();
				temp=null;
				buy_temp=null;
				System.out.println("로그아웃이 되었습니다.");
			}
		}
	}// 로그아웃 메소드

	void join() {
		System.out.println("[회원가입]");
		String[] info = new String[4];
		loop2: while (true) {
			System.out.println("사용할 아이디를 입력하세요.(3자이상)(이전메뉴:0)");
			info[0] = scan.nextLine();
			if (back(info[0]) == 0) {
				System.out.println("이전메뉴로 이동합니다.");
				return;
			}

			if (idpw.containsKey(info[0])) {
				System.out.println("중복된 아이디가 있습니다.");
				continue;
			} // 중복검사

			if (info[0].length() < 3) {
				System.out.println("아이디는 3자 이상이어야 합니다.");
				continue;
			}
			break;
		} // 아이디while

		while (true) {
			System.out.println("비밀번호를 입력해 주세요.");
			info[1] = scan.nextLine();
			if (info[1].length() < 8) {
				System.out.println("비밀번호는 8자 이상이어야 합니다.");
				continue;
			}
			break;

		} // 비밀번호 while

		System.out.println("이름을 입력해 주세요.");
		info[2] = scan.nextLine();
		System.out.println("전화번호를 입력해 주세요.");
		info[3] = scan.nextLine();

		idpw.put(info[0], info[1]);
		memArr.add(new Member(info[0], info[2], info[3]));
	}// join 메소드

	void print_mem() {
		System.out.println("[회원정보출력]");
		while (true) {
			System.out.println("관리자 id를 입력하세요");
			if (scan.nextLine().equals(adminid)) {
				System.out.println("관리자 pw를 입력하세요.");
				if (scan.nextLine().equals(adminpw)) {
					break;
				}
			} else {
				System.out.println("id나 pw가 틀립니다. 확인후 다시 접속하세요.");
				continue;
			 }
		    }//관리자 로그인 while
			if (memArr.isEmpty()) {
				System.out.println("표시할 정보가 없습니다!");
				return;
			}

			System.out.println("1)전체출력 2) 검색출력");
			System.out.println("원하는 번호를 입력하세요.(이전메뉴:0)");
			int s_num = scan.nextInt();
			if (s_num == 0) {
				return;
			}
			switch (s_num) {
			case 1:
				System.out.println("회원정보를 전체출력합니다.");
				Collections.sort(memArr);
				print_sub();
				System.out.println();
				for (int i = 0; i < memArr.size(); i++) {
					Member mem = (Member) memArr.get(i);
					System.out.print(mem);
					System.out.print(idpw.get(mem.getId()));
					System.out.println();
				}
				break;
			case 2:
				System.out.println("검색을 원하는 이름을 입력하세요.(이전메뉴:0)");
				String check_name = scan.nextLine();
				if (back(check_name) == 0) {
					System.out.println("이전메뉴로 이동합니다.");
					return;
				}
				for (int i = 0; i < memArr.size(); i++) {
					Member sp = (Member) memArr.get(i);
					if (sp.getName().contains(check_name)) {
						print_sub();
						System.out.println();
						System.out.print(sp);
						System.out.print(idpw.get(sp.getId()));
						System.out.println();
					}
				}
				break;
			}// switch
	}// 회원출력(관리자) 메소드
	
	void print_sub() {
		for (int j = 0; j < sub_member.length; j++) {
			if (sub_member[j].length() == 4) {
				System.out.print(sub_member[j] + "\t\t");
			} else {
				System.out.print(sub_member[j] + "\t");
			}
		}
	}// 제목출력 메소드

	int back(String check) {
		if (check.equals("0")) {
			return 0;
		}
		return 1;
	}// (기능)뒤로가기

	void buy() {
		int s_num = 0;
		if (login.isEmpty()) {
			System.out.println("로그인이 필요한 서비스 입니다. 로그인 화면으로 이동합니다.");
			if(login()==1) {
			return;	
			}
		}
		while (true) {
			System.out.println("[상품 카테고리]");
			System.out.println("1) TV 2) 냉장고 3) 세탁기");
			System.out.println("원하는 카테고리를 선택하세요.(이전화면:0)");
			s_num = scan.nextInt();
			if (s_num == 0) {
				break;
			}
			switch (s_num) {
			case 1:
				for(;;) {
				System.out.println("[TV]");
				System.out.println("상품목록: 1)LCDTV 2)LEDTV 3)OLEDTV");
				System.out.println("상품을 선택하세요.");
				s_num=scan.nextInt();
				scan.nextLine();
				switch(s_num) {
				case 1:
					buy_sub(new Lcdtv());
					break;
				case 2:
					buy_sub(new Ledtv());
					break;
				case 3:
					buy_sub(new Oledtv());
					break;
				}
					break;
				}
				break;
			case 2:
				for(;;) {
				System.out.println("[냉장고]");
				System.out.println("상품목록: 1)일반형 냉장고 2)양문형 냉장고");
				System.out.println("상품을 선택하세요.");
				s_num=scan.nextInt();
				scan.nextLine();
				switch(s_num) {
				case 1:
					buy_sub(new Oneref());
					break;
				case 2:
					buy_sub(new Tworef());
					break;
				
				}
				break;
				}
				break;
			case 3:
				for(;;) {
				System.out.println("[세탁기]");
				System.out.println("상품목록: 1)통돌이세탁기 2)드럼세탁기 3)삼성그랑데세탁건조기");
				System.out.println("상품을 선택하세요.");
				s_num=scan.nextInt();
				scan.nextLine();
				switch(s_num) {
				case 1:
					buy_sub(new Twash());
					break;
				case 2:
					buy_sub(new Dwash());
					break;
				case 3:
					buy_sub(new DDwash());
					break;
				}
				break;
				}
				break;
			}//카테고리 switch
			
		}//구매 전체while

	}// 구매 메소드
	void buy_sub(Product p) {
		System.out.println("[상세정보]");
		if(p instanceof Lcdtv) { System.out.println(new Lcdtv()); }
		else if(p instanceof Ledtv) { System.out.println(new Ledtv()); }
		else if(p instanceof Oledtv) { System.out.println(new Oledtv()); }
		else if(p instanceof Oneref) { System.out.println(new Oneref());}
		else if(p instanceof Tworef) { System.out.println(new Tworef());}
		else if(p instanceof Twash) { System.out.println(new Twash()); }
		else if(p instanceof Dwash) { System.out.println(new Dwash()); }
		else if(p instanceof DDwash) { System.out.println(new DDwash()); }
		System.out.println("구입하시겠습니까?(y/n)");
		if(ch_yn()==1) {
			if(buy_temp.getMoney()<p.getPrice()) {
				System.out.println("가지고계신 금액이 부족합니다. 충전하시겠습니까?(y/n)");
				if(!(ch_yn()==1)) {
					System.out.println("이전화면으로 이동합니다.");
					return;
				}
				else {
					System.out.println("충전화면으로 이동합니다.");
					money_ch();
					if(buy_temp.getMoney()<p.getPrice()) {
						return;
					}
				}
			}
        	cart.add(new Cart(temp, p.getName(), p.getPrice(), p.getBonus()));
        	buy_temp.setMoney(buy_temp.getMoney()-p.getPrice());
        	buy_temp.setPoint(buy_temp.getPoint()+p.getBonus());
        	
            System.out.println(p.getName()+"구매를 완료하였습니다.");
        }
	}//구매서브 메소드
	
	void money_ch() {
		System.out.println("현재 보유금액:"+buy_temp.getMoney()+"원");
		System.out.println("충전을 원하는 금액을 입력하세요.");
		int addMoney=scan.nextInt();
		scan.nextLine();
		System.out.println(addMoney+"원을 충전하시겠습니까?(y/n)");
		if(ch_yn()==0) {
			return;
		}
		else {
			buy_temp.setMoney(buy_temp.getMoney()+addMoney);
			System.out.println(addMoney+"원을 충전하였습니다.");
			System.out.println("현재 보유금액:"+buy_temp.getMoney()+"원");
		}
	}
	
	int ch_yn(){
		if(scan.nextLine().equalsIgnoreCase("y")) {
			return 1;
		}
		return 0;
	}// 결정 메소드
	
	void myPage() {
		if (login.isEmpty()) {
			System.out.println("로그인이 필요한 서비스 입니다. 로그인 화면으로 이동합니다.");
			if(login()==1) {
			return;	
			}
		}
		//아이디,상품명,가격,포인트,구매일자 출력
		String[]cartPrint= {"구매아이디","상품명","상품가격","적립포인트","구매일자"};
		System.out.println("[마이페이지]");
		System.out.println("1) 정보출력 2) 구매목록출력");
		switch(scan.nextInt()) {
		case 1:
			System.out.println("회원님의 정보를 출력합니다.");
					print_sub();
					System.out.println();
					System.out.print(buy_temp);
					System.out.print(idpw.get(buy_temp.getId()));
					System.out.println();
			break;
		case 2:
			int sumBuy = 0;
			int sumBonus = 0;
			System.out.println("구매하신 목록을 출력합니다.");
			for(int i=0;i<cartPrint.length;i++) {
					System.out.print(cartPrint[i]+"\t");
			}System.out.println();
			for(int i=0;i<cart.size();i++) {
				Cart t=(Cart)cart.get(i);
				System.out.println(t);
				sumBuy=sumBuy+t.getPrice();
				sumBonus=sumBonus+t.getBonus();
			}
			System.out.println("==================================================");
			System.out.println("전체구매금액:"+sumBuy+"원");
			System.out.println("전체 적립 포인트"+sumBonus+"포인트");
			
			break;
		}
		
	}//마이페이지
	
	
	

}// class
