import java.util.Scanner;

public class Ex0227_04 {

	public static void main(String[] args) {
		
		// instanceof  예제
		// 앰블런스 객체를 1개 선언, 카객체에 넣고, 드라이브 메소드 실행, 다시 형변환해서, 앰블런스 객체 1개 추가, 사이렌 실행
		// 변신 카 프로그램 1)소방차 생성 2)앰블런스 생성 3)트럭생성
		// 4)기본차로 변신 5)원래 생성된 차로 변신 6)종료
		// 원하는 번호를 입력하세요.
		Scanner scan = new Scanner(System.in);
		int s_num = 0;
		Car car=null;
		FireEngine fire=new FireEngine();
		Ambulance amb=new Ambulance();
		Truck tru=new Truck();
		
		loop:while (true) {
			System.out.println("변신 차 프로그램");
			System.out.println("1)소방차 생성 2)앰블런스 생성 3)트럭생성");
			System.out.println("4)기본차로 변신 5)원래 생성된 차로 변신  6)종료");
			System.out.println("원하는 번호를 선택하세요.");
			s_num = scan.nextInt();
			switch (s_num) {
			case 1:
                System.out.println("소방차가 생성 되었습니다.");
                fire.water();
                car=fire;//기본차 변신
				break;
			case 2:
				System.out.println("앰블런스가 생성 되었습니다.");
				amb.siren();
				car=amb;//기본차 변신
				break;
			case 3:
                System.out.println("트럭이 생성 되었습니다.");
                tru.stuff();
                car=tru;//기본차 변신
				break;
			case 4:
				System.out.println("기본차로 변신");//
				car.drive();
				break;
			case 5:
				if(car instanceof FireEngine) {
					System.out.println("소방차로 다시변신");
					fire=(FireEngine)car;
					fire.water();
				}
				if(car instanceof Ambulance) {
					System.out.println("앰블런스로 다시변신");
					amb=(Ambulance)car;
					amb.siren();
				}
				if(car instanceof Truck) {
					System.out.println("트럭으로 다시변신");
					tru=(Truck)car;
					tru.stuff();
				}
					
				break;
			case 6:

				break loop;
			}

		} // while

//		Ambulance e=new Ambulance();
//		Car c3=null;
//		c3=e;
//		c3.drive();
//		Ambulance e2=null;
//		e2=(Ambulance)c3;
//		e2.siren();

//		FireEngine fe=new FireEngine();
//		
//		if(fe instanceof FireEngine) {
//			System.out.println("네 fireEngine 객체 맞습니다.");
//		}
//		if(fe instanceof Car) {
//			System.out.println("네 Car 객체 맞습니다.");
//		}
//		if(fe instanceof Object) {
//			System.out.println("네 Object 객체 맞습니다.");
//		}
		// 형변환이 가능한지 여부확인

	}//main
	


}//class
