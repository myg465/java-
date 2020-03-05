
public class Main_mall {

	public static void main(String[] args) {
		// 화면구성

		Mall_excute ex = new Mall_excute();

		loop:while (true) {

			switch (ex.print_main()) {
			case 1:
				ex.join();
				break;
			case 2:
                ex.login();
				break;
			case 3:
                ex.buy();
				break;
				
			case 7:
                ex.logout();
				break;
			case 8:
                ex.print_sp();
				break;
			case 9:
                 ex.print_mem();
				break;

			default:
				break;
			}// switch
		} // while
	}// main

}// class
