
public class Main_mall {

	public static void main(String[] args) {
		// ȭ�鱸��

		Mall_excute ex = new Mall_excute();

		loop:while (true) {

			switch (ex.print_main()) {
			case 1:
				ex.join();//ȸ������
				break;
			case 2:
                ex.login();//�α���(�ȿ� �α׾ƿ�)
				break;
			case 3:
                ex.buy();//���θ� ����
				break;
			case 5:
				ex.test();//�׽�Ʈ ���� �Է�(�����ڿ�)
				break;
			case 7:// ���Ÿ�� ����(����������)
                ex.myPage();
				break;
			case 8:
				   
				break;
			case 9:
                 ex.print_mem();// ȸ�����(������)
				break;
			

			default:
				break;
			}// switch
		} // while
	}// main

}// class
