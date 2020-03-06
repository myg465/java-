
public class Main_mall {

	public static void main(String[] args) {
		// 화면구성

		Mall_excute ex = new Mall_excute();

		loop:while (true) {

			switch (ex.print_main()) {
			case 1:
				ex.join();//회원가입
				break;
			case 2:
                ex.login();//로그인(안에 로그아웃)
				break;
			case 3:
                ex.buy();//쇼핑몰 입장
				break;
			case 5:
				ex.test();//테스트 더미 입력(개발자용)
				break;
			case 7:// 구매목록 보기(마이페이지)
                ex.myPage();
				break;
			case 8:
				   
				break;
			case 9:
                 ex.print_mem();// 회원출력(관리자)
				break;
			

			default:
				break;
			}// switch
		} // while
	}// main

}// class
