import java.util.Scanner;

public class Ex0227_04 {

	public static void main(String[] args) {
		
		// instanceof  ����
		// �ں��� ��ü�� 1�� ����, ī��ü�� �ְ�, ����̺� �޼ҵ� ����, �ٽ� ����ȯ�ؼ�, �ں��� ��ü 1�� �߰�, ���̷� ����
		// ���� ī ���α׷� 1)�ҹ��� ���� 2)�ں��� ���� 3)Ʈ������
		// 4)�⺻���� ���� 5)���� ������ ���� ���� 6)����
		// ���ϴ� ��ȣ�� �Է��ϼ���.
		Scanner scan = new Scanner(System.in);
		int s_num = 0;
		Car car=null;
		FireEngine fire=new FireEngine();
		Ambulance amb=new Ambulance();
		Truck tru=new Truck();
		
		loop:while (true) {
			System.out.println("���� �� ���α׷�");
			System.out.println("1)�ҹ��� ���� 2)�ں��� ���� 3)Ʈ������");
			System.out.println("4)�⺻���� ���� 5)���� ������ ���� ����  6)����");
			System.out.println("���ϴ� ��ȣ�� �����ϼ���.");
			s_num = scan.nextInt();
			switch (s_num) {
			case 1:
                System.out.println("�ҹ����� ���� �Ǿ����ϴ�.");
                fire.water();
                car=fire;//�⺻�� ����
				break;
			case 2:
				System.out.println("�ں����� ���� �Ǿ����ϴ�.");
				amb.siren();
				car=amb;//�⺻�� ����
				break;
			case 3:
                System.out.println("Ʈ���� ���� �Ǿ����ϴ�.");
                tru.stuff();
                car=tru;//�⺻�� ����
				break;
			case 4:
				System.out.println("�⺻���� ����");//
				car.drive();
				break;
			case 5:
				if(car instanceof FireEngine) {
					System.out.println("�ҹ����� �ٽú���");
					fire=(FireEngine)car;
					fire.water();
				}
				if(car instanceof Ambulance) {
					System.out.println("�ں����� �ٽú���");
					amb=(Ambulance)car;
					amb.siren();
				}
				if(car instanceof Truck) {
					System.out.println("Ʈ������ �ٽú���");
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
//			System.out.println("�� fireEngine ��ü �½��ϴ�.");
//		}
//		if(fe instanceof Car) {
//			System.out.println("�� Car ��ü �½��ϴ�.");
//		}
//		if(fe instanceof Object) {
//			System.out.println("�� Object ��ü �½��ϴ�.");
//		}
		// ����ȯ�� �������� ����Ȯ��

	}//main
	


}//class
