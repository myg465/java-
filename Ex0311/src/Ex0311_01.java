
public class Ex0311_01 {

	public static void main(String[] args) {
		// 입력을 3개 시켜놓고 1개씩 입력받을수 있게 클래스 3개 main,excute, student
		int s_num=0;
		Stu_excute stu_ex=new Stu_excute();
		loop:while(true) {
		s_num=stu_ex.print_main();
			switch(s_num) {
			case 1:
				stu_ex.stu_input();
				break;
			case 2:
				stu_ex.stu_print();
				break;
			case 3:
				stu_ex.stu_search();
				break;
			case 4:
				stu_ex.stu_rank();
				break;
			case 0:
				break loop;
			default:
				System.out.println("숫자를 잘못 입력하였습니다.");
				break;
			}
			
		}//while

	}//main

}//class
