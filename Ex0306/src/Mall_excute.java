import java.util.*;

public class Mall_excute {
//��ɾ�(�޼ҵ�)

	Scanner scan = new Scanner(System.in);
	String[] sub_member = { "�̸�", "��ȭ��ȣ", "�����ݾ�", "��������Ʈ", "��������", "���̵�", "�н�����" };
	ArrayList<Member> memArr = new ArrayList<Member>();// ȸ������ ���� ����Ʈ
	ArrayList<Cart> cart = new ArrayList<Cart>();// �������� ���� ����Ʈ
	HashMap idpw = new HashMap();// ���̵��й�ȣ ���� ��
	HashMap login = new HashMap();// �α��� üũ ��
	String[] id_test = { "asasa", "qwqwq", "zxzxz", "erere" };// ���� ������
	String[] pw_test = { "12345678", "23456789", "34567890", "01234567" };
	String[] name_test = { "ȫ�浿", "�̼���", "������", "ȫ���" };
	String[] tel_test = { "010-2934-3385", "02-399-3355", "070-2283-1122", "02-3944-4965" };
	String adminid = "admin";// ������
	String adminpw = "1234";
	String temp;

	void test() {
		for (int i = 0; i < id_test.length; i++) {
			memArr.add(new Member(id_test[i], name_test[i], tel_test[i]));
			idpw.put(id_test[i], pw_test[i]);
		}
	}

	int print_main() {
		System.out.println("[���̸�Ʈ]   (5�� �׽�Ʈ�� �����Է�)");
		System.out.println("1) ȸ������ 2) �α��� 3) ��ǰ���� ");
		System.out.println("7) �α׾ƿ� 8) ȸ���˻� 9) ȸ��������ü��� 0) ���� ");
		System.out.println("��ȣ�� �Է����ּ���");
		int s_num = scan.nextInt();
		scan.nextLine();
		return s_num;
	}

	void login() {
		loop1: while (true) {
			if (login.isEmpty()) {
				boolean check = false;
				System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.(��ҹ��ڸ� �����մϴ�.)");
				System.out.print("id:");
				String id = scan.nextLine();
				if (!(idpw.containsKey(id))) {
					System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
					continue;
				}
				System.out.println("pw:");
				String pw = scan.nextLine();
				if (!(idpw.get(id).equals(pw))) {
					System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
					System.out.println("ȸ�������� �Ͻðڽ��ϱ�?(y/n)");
					if (scan.nextLine().equalsIgnoreCase("y")) {
						System.out.println("ȸ������ ȭ������ �̵��մϴ�.");
						join();
						break loop1;
					}
					else {
						break loop1;
					}
				}
				login.put(id, pw);
				temp=id;
				break;
			} else {
				System.out.println("�α����� �Ǿ��ֽ��ϴ�. �α׾ƿ� ȭ������ �̵��մϴ�.");
				logout();
				break loop1;
			}

		} // while
	}// �α��� �޼ҵ�

	void logout() {
		System.out.println("�α׾ƿ��� �Ͻðڽ��ϱ�?");
		if (scan.nextLine().equalsIgnoreCase("y")) {
			if (!(login.isEmpty())) {
				login.clear();
				temp=null;
				System.out.println("�α׾ƿ��� �Ǿ����ϴ�.");
			}
		}
	}// �α׾ƿ� �޼ҵ�

	void join() {
		System.out.println("[ȸ������]");
		String[] info = new String[4];
		loop2: while (true) {
			System.out.println("����� ���̵� �Է��ϼ���.(3���̻�)(�����޴�:0)");
			info[0] = scan.nextLine();
			if (back(info[0]) == 0) {
				System.out.println("�����޴��� �̵��մϴ�.");
				return;
			}

			if (idpw.containsKey(info[0])) {
				System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.");
				continue;
			} // �ߺ��˻�

			if (info[0].length() < 3) {
				System.out.println("���̵�� 3�� �̻��̾�� �մϴ�.");
				continue;
			}
			break;
		} // ���̵�while

		while (true) {
			System.out.println("��й�ȣ�� �Է��� �ּ���.");
			info[1] = scan.nextLine();
			if (info[1].length() < 8) {
				System.out.println("��й�ȣ�� 8�� �̻��̾�� �մϴ�.");
				continue;
			}
			break;

		} // ��й�ȣ while

		System.out.println("�̸��� �Է��� �ּ���.");
		info[2] = scan.nextLine();
		System.out.println("��ȭ��ȣ�� �Է��� �ּ���.");
		info[3] = scan.nextLine();

		idpw.put(info[0], info[1]);
		memArr.add(new Member(info[0], info[2], info[3]));
	}// join �޼ҵ�

	void print_mem() {
		System.out.println("[ȸ���������]");
		while (true) {
			System.out.println("������ id�� �Է��ϼ���");
			if (scan.nextLine().equals("admin")) {
				System.out.println("������ pw�� �Է��ϼ���.");
				if (scan.nextLine().equals("1234")) {
					System.out.println("ȸ�������� ��ü����մϴ�.");
					break;
				}
			} else {
				System.out.println("id�� pw�� Ʋ���ϴ�. Ȯ���� �ٽ� �����ϼ���.");
			}
			if (memArr.isEmpty()) {
				System.out.println("ǥ���� ������ �����ϴ�!");
				break;
			}

			System.out.println("1)��ü��� 2) �˻����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.(�����޴�:0)");
			int s_num = scan.nextInt();
			if (s_num == 0) {
				break;
			}
			switch (s_num) {
			case 1:
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
				System.out.println("�˻��� ���ϴ� �̸��� �Է��ϼ���.(�����޴�:0)");
				String check_name = scan.nextLine();
				if (back(check_name) == 0) {
					System.out.println("�����޴��� �̵��մϴ�.");
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
		}

	}// ȸ�����(������) �޼ҵ�
	void print_sub() {
		for (int j = 0; j < sub_member.length; j++) {
			if (sub_member[j].length() == 4) {
				System.out.print(sub_member[j] + "\t\t");
			} else {
				System.out.print(sub_member[j] + "\t");
			}
		}
	}// ������� �޼ҵ�

	int back(String check) {
		if (check.equals("0")) {
			return 0;
		}
		return 1;
	}// (���)�ڷΰ���

	void buy() {
		
		int s_num = 0;
		

		if (login.isEmpty()) {
			System.out.println("�α����� �ʿ��� ���� �Դϴ�. �α��� ȭ������ �̵��մϴ�.");
			login();
		}
		while (true) {
			System.out.println("[��ǰ ī�װ�]");
			System.out.println("1) TV 2) ����� 3) ��Ź��");
			System.out.println("���ϴ� ī�װ��� �����ϼ���.(����ȭ��:0)");
			s_num = scan.nextInt();
			if (s_num == 0) {
				break;
			}
			switch (s_num) {
			case 1:
				for(;;) {
				System.out.println("[TV]");
				System.out.println("��ǰ���: 1)LCDTV 2)LEDTV 3)OLEDTV");
				System.out.println("��ǰ�� �����ϼ���.");
				s_num=scan.nextInt();
				scan.nextLine();
				switch(s_num) {
				case 1:
					System.out.println("[������]");
					System.out.println(new Lcdtv());
                    if(ch_buy()==1) {
                    	Lcdtv c=new Lcdtv();
                    	cart.add(new Cart(temp, c.getName(), c.getPrice(), c.getPrice()));
                    }
					break;
				case 2:
					System.out.println("[������]");
					System.out.println(new Ledtv());
					if(ch_buy()==1) {
                    	Ledtv c=new Ledtv();
                    	cart.add(new Cart(temp, c.getName(), c.getPrice(), c.getPrice()));
                    }
					break;
				case 3:
					System.out.println("[������]");
					System.out.println(new Oledtv());
					if(ch_buy()==1) {
                    	Oledtv c=new Oledtv();
                    	cart.add(new Cart(temp, c.getName(), c.getPrice(), c.getPrice()));
                    }
					break;
				}
					break;
				}
				break;
			case 2:
				for(;;) {
				System.out.println("[�����]");
				System.out.println("��ǰ���: 1)�Ϲ��� ����� 2)�繮�� �����");
				System.out.println("��ǰ�� �����ϼ���.");
				s_num=scan.nextInt();
				scan.nextLine();
				switch(s_num) {
				case 1:
					System.out.println("[������]");
					System.out.println(new Oneref());
					if(ch_buy()==1) {
						Oneref c=new Oneref();
                    	cart.add(new Cart(temp, c.getName(), c.getPrice(), c.getPrice()));
                    }
					break;
				case 2:
					System.out.println("[������]");
					System.out.println(new Tworef());
					if(ch_buy()==1) {
						Tworef c=new Tworef();
                    	cart.add(new Cart(temp, c.getName(), c.getPrice(), c.getPrice()));
                    }
					break;
				
				}
				break;
				}
				break;
			case 3:
				for(;;) {
				System.out.println("[��Ź��]");
				System.out.println("��ǰ���: 1)�뵹�̼�Ź�� 2)�巳��Ź�� 3)�Ｚ�׶�����Ź������");
				System.out.println("��ǰ�� �����ϼ���.");
				s_num=scan.nextInt();
				scan.nextLine();
				switch(s_num) {
				case 1:
					System.out.println("[������]");
					System.out.println(new Twash());
					if(ch_buy()==1) {
						Twash c=new Twash();
                    	cart.add(new Cart(temp, c.getName(), c.getPrice(), c.getPrice()));
                    }
					break;
				case 2:
					System.out.println("[������]");
					System.out.println(new Dwash());
					if(ch_buy()==1) {
						Dwash c=new Dwash();
                    	cart.add(new Cart(temp, c.getName(), c.getPrice(), c.getPrice()));
                    }
					break;
				case 3:
					System.out.println("[������]");
					System.out.println(new DDwash());
					if(ch_buy()==1) {
						DDwash c=new DDwash();
                    	cart.add(new Cart(temp, c.getName(), c.getPrice(), c.getPrice()));
                    }
					break;
				}
				break;
				}
				break;
			}//ī�װ� switch
			
		}//���� ��üwhile

	}// ���� �޼ҵ�
	
	int ch_buy(){
		System.out.println("�����Ͻðڽ��ϱ�?(y/n)");
		if(scan.nextLine().equalsIgnoreCase("y")) {
			return 1;
		}
		return 0;
	}// ���Ű��� �޼ҵ�
	
	void myPage() {
		System.out.println("[����������]");
		System.out.println("1) ������� 2) ���Ÿ�����");
		switch(scan.nextInt()) {
		case 1:
			for (int i = 0; i < memArr.size(); i++) {
				Member sp = (Member) memArr.get(i);
				if (sp.getId().contains(temp)) {
					print_sub();
					System.out.println();
					System.out.print(sp);
					System.out.print(idpw.get(sp.getId()));
					System.out.println();
					break;
				}
			}
			break;
		case 2:
			break;
		}
	}
	
	
	

}// class
