import java.util.Scanner;

public class Ex0304_04 {

	public static void main(String[] args) {
		// �ֹι�ȣ�� �޾Ƽ� �� ����� �������� �������� Ȯ��
		// ��ǻ���а� c0001 / �����а� e0002/ �����а� k0003 �й��� �Է¹޾� ���������� Ȯ��
		// �����װ� KE ke,�ƽþƳ��װ� OZ oz, ���������� �װ� AF af �װ���Ȯ��
		//�̸����� �Է¹�����(������ִ��� üũ, ��(.)���ִ��� üũ)
		
		Scanner scan=new Scanner(System.in);
		loop:while(true) {
		     System.out.println("[�������α׷�]");
		     System.out.println("1)����Ȯ�� 2) �а�Ȯ�� 3)�װ���Ȯ�� 4)�̸��� ���� 5)��й�ȣ ���� 0)����");
		     System.out.println("���ڸ� �Է��ϼ���.");
		     int s_num=scan.nextInt();
		     scan.nextLine();
			switch(s_num) {
			case 1:
				loop1:while(true) {
					
					System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
					String id=scan.nextLine();
					if(!(id.length()==13)) {
						System.out.println("13�ڸ��� ��ȣ�� �Է��ϼ���.");
						continue;
					}
					for(int i=0;i<id.length();i++) {
						if(!(id.charAt(i)>='0'&&id.charAt(i)<='9')) {
							System.out.println("���ڸ� �Է��ϼ���.");
							continue loop1;
					}
					
					if(id.charAt(6)=='1'||id.charAt(6)=='3') {
					System.out.println("����");
					}
					else if(id.charAt(6)=='2'||id.charAt(6)=='4') {
					System.out.println("����");
					       }
						}
					break;
				}
				break;
			case 2:
				System.out.println("�й��� �Է��ϼ���.");
				String hak=scan.nextLine();
				if(hak.contains("c")) {
					System.out.println("��ǻ�� ���а�");
				}
				else if(hak.contains("e")) {
					System.out.println("�����а�");
				}
				else if(hak.contains("k")) {
					System.out.println("�����а�");
				}
				break;
			case 3:
				// �����װ� KE ke,�ƽþƳ��װ� OZ oz, ���������� �װ� AF af �װ���Ȯ��
				System.out.println("�ڵ带 �Է��ϼ���.");
				String co=scan.nextLine();
				if(co.equalsIgnoreCase("ke")) {
					System.out.println("�����װ�");
				}
				else if(co.equalsIgnoreCase("oz")) {
					System.out.println("�ƽþƳ��װ�");
				}
				else if(co.equalsIgnoreCase("af")) {
					System.out.println("�����������װ�");
				}
				break;
				
			case 4:
				System.out.println("�̸����� �Է��ϼ���.");
				String email=scan.nextLine();
				if(!(email.contains("@")&&(email.contains(".")))) {
				   System.out.println("��Ŀ� �°� �Է����ּ���.");
				}
				break;
				//��й�ȣ Ư������1������,�빮��1������,���̴� 8���̻�
				//��й�ȣ�� �Է� �յ� ������� �Է��Ͻø� �ȵ˴ϴ�.
				//��й�ȣ �Է¹޾Ƽ� ��������� �Է°��� ���
			case 5:
				System.out.println("��й�ȣ�� �Է��ϼ���.");
				String pw=scan.nextLine();
				pw=pw.trim();// �յڰ��鸸 �����.
				pw=pw.replaceAll(" ", "");
				if(!(pw.length()>=8)) {
					System.out.println("��й�ȣ�� 8�� �̻��̾�� �մϴ�.");
					break;
				}
				boolean check=false;
				for(int i=0;i<pw.length();i++) {
					if(pw.charAt(i)>='A'&&pw.charAt(i)<='Z') {
						check=true;
					}
				}
				if(check==false) {
					System.out.println("�빮�ڰ� 1�� �̻� ���ԵǾ�� �մϴ�.");
				}
				
				System.out.println("�Է� �н�����:"+pw);
				System.out.println("�н��������:"+pw.length());
				//Ư������ ���� : �빮�� �ҹ��� ���� ���� �����ϸ� ��
				
				
				break;
			case 0:
				break loop;
			
			}//switch
			
			
			//�ֹι�ȣ�� �Է¹޴µ� -�� �������� �и�
			//��ȭ��ȣ�� �޴µ� -�� �������� �и��ؼ� ��� 
			//��й�ȣ�� �Է� �յ� ������� �Է��Ͻø� �ȵ˴ϴ�.
			//��й�ȣ �Է¹޾Ƽ� ��������� �Է°��� ���
			System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
			String id=scan.nextLine();
			String[]id_a=id.split("-");
			for(int i=0;i<id_a.length;i++) {
				System.out.println(id_a[i]);
				System.out.println("---------");
			}
			
			System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
			String tel=scan.nextLine();
			String[]tel_a=tel.split("-");
			for(int i=0;i<tel_a.length;i++) {
				System.out.println(tel_a[i]);
				System.out.println("---------");
			}
		}//while

	}//main

}//class
