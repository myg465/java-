import java.util.*;

public class Mall_excute {
//��ɾ�(�޼ҵ�)

	Scanner scan = new Scanner(System.in);
	String[] sub_member = { "�̸�", "��ȭ��ȣ", "�����ݾ�", "��������Ʈ", "��������", "���̵�", "�н�����" };
	ArrayList<Member> memArr = new ArrayList<Member>();// ȸ������ ���� ����Ʈ
	ArrayList<Cart> cart = new ArrayList<Cart>();// �������� ���� ����Ʈ
	HashMap idpw = new HashMap();// ���̵��й�ȣ ���� �ؽø�
	HashMap login = new HashMap();// �α��� üũ �ؽø�
	String[] id_test = { "asasa", "qwqwq", "zxzxz", "erere" };// ���� ������
	String[] pw_test = { "12345678", "23456789", "34567890", "01234567" };
	String[] name_test = { "ȫ�浿", "�̼���", "������", "ȫ���" };
	String[] tel_test = { "010-2934-3385", "02-399-3355", "070-2283-1122", "02-3944-4965" };
	String adminid = "admin";// �����ھ��̵�
	String adminpw = "1234";//������ �н�����
	String temp;// �α��ξ��̵� �ӽ�����
    Member buy_temp=new Member();//�α��� �� �ӽ�����
	void test() {
		for (int i = 0; i < id_test.length; i++) {
			memArr.add(new Member(id_test[i], name_test[i], tel_test[i]));
			idpw.put(id_test[i], pw_test[i]);
		}
	}

	int print_main() {
		System.out.println("[���̸�Ʈ]   (99�� �׽�Ʈ�� �����Է�)");
		System.out.println("1) ȸ������ 2) �α��� 3) ��ǰ���� ");
		System.out.println("4) ���������� 5) �����ڸ�� 0) ���� ");
		System.out.println("��ȣ�� �Է����ּ���");
		int s_num = scan.nextInt();
		scan.nextLine();
		return s_num;
	}

	int login() {
		loop1:while (true) {
			if (login.isEmpty()) {
				boolean check = false;
				System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.(��ҹ��ڸ� �����մϴ�./ ȸ�������̵�:0)");
				System.out.print("id:");
				String id = scan.nextLine();
				if(id.equals("0")) {
					System.out.println("ȸ������ �������� �̵��մϴ�.");
					join();
					return 1;
				}
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
				System.out.println("�α����� �Ǿ��ֽ��ϴ�. �α׾ƿ� ȭ������ �̵��մϴ�.");
				logout();
				break loop1;
			}

		} // while
	return 0;
	}// �α��� �޼ҵ�

	void logout() {
		System.out.println("�α׾ƿ��� �Ͻðڽ��ϱ�?");
		if (scan.nextLine().equalsIgnoreCase("y")) {
			if (!(login.isEmpty())) {
				login.clear();
				temp=null;
				buy_temp=null;
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
			if (scan.nextLine().equals(adminid)) {
				System.out.println("������ pw�� �Է��ϼ���.");
				if (scan.nextLine().equals(adminpw)) {
					break;
				}
			} else {
				System.out.println("id�� pw�� Ʋ���ϴ�. Ȯ���� �ٽ� �����ϼ���.");
				continue;
			 }
		    }//������ �α��� while
			if (memArr.isEmpty()) {
				System.out.println("ǥ���� ������ �����ϴ�!");
				return;
			}

			System.out.println("1)��ü��� 2) �˻����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.(�����޴�:0)");
			int s_num = scan.nextInt();
			if (s_num == 0) {
				return;
			}
			switch (s_num) {
			case 1:
				System.out.println("ȸ�������� ��ü����մϴ�.");
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
			if(login()==1) {
			return;	
			}
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
				System.out.println("[�����]");
				System.out.println("��ǰ���: 1)�Ϲ��� ����� 2)�繮�� �����");
				System.out.println("��ǰ�� �����ϼ���.");
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
				System.out.println("[��Ź��]");
				System.out.println("��ǰ���: 1)�뵹�̼�Ź�� 2)�巳��Ź�� 3)�Ｚ�׶�����Ź������");
				System.out.println("��ǰ�� �����ϼ���.");
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
			}//ī�װ� switch
			
		}//���� ��üwhile

	}// ���� �޼ҵ�
	void buy_sub(Product p) {
		System.out.println("[������]");
		if(p instanceof Lcdtv) { System.out.println(new Lcdtv()); }
		else if(p instanceof Ledtv) { System.out.println(new Ledtv()); }
		else if(p instanceof Oledtv) { System.out.println(new Oledtv()); }
		else if(p instanceof Oneref) { System.out.println(new Oneref());}
		else if(p instanceof Tworef) { System.out.println(new Tworef());}
		else if(p instanceof Twash) { System.out.println(new Twash()); }
		else if(p instanceof Dwash) { System.out.println(new Dwash()); }
		else if(p instanceof DDwash) { System.out.println(new DDwash()); }
		System.out.println("�����Ͻðڽ��ϱ�?(y/n)");
		if(ch_yn()==1) {
			if(buy_temp.getMoney()<p.getPrice()) {
				System.out.println("�������� �ݾ��� �����մϴ�. �����Ͻðڽ��ϱ�?(y/n)");
				if(!(ch_yn()==1)) {
					System.out.println("����ȭ������ �̵��մϴ�.");
					return;
				}
				else {
					System.out.println("����ȭ������ �̵��մϴ�.");
					money_ch();
					if(buy_temp.getMoney()<p.getPrice()) {
						return;
					}
				}
			}
        	cart.add(new Cart(temp, p.getName(), p.getPrice(), p.getBonus()));
        	buy_temp.setMoney(buy_temp.getMoney()-p.getPrice());
        	buy_temp.setPoint(buy_temp.getPoint()+p.getBonus());
        	
            System.out.println(p.getName()+"���Ÿ� �Ϸ��Ͽ����ϴ�.");
        }
	}//���ż��� �޼ҵ�
	
	void money_ch() {
		System.out.println("���� �����ݾ�:"+buy_temp.getMoney()+"��");
		System.out.println("������ ���ϴ� �ݾ��� �Է��ϼ���.");
		int addMoney=scan.nextInt();
		scan.nextLine();
		System.out.println(addMoney+"���� �����Ͻðڽ��ϱ�?(y/n)");
		if(ch_yn()==0) {
			return;
		}
		else {
			buy_temp.setMoney(buy_temp.getMoney()+addMoney);
			System.out.println(addMoney+"���� �����Ͽ����ϴ�.");
			System.out.println("���� �����ݾ�:"+buy_temp.getMoney()+"��");
		}
	}
	
	int ch_yn(){
		if(scan.nextLine().equalsIgnoreCase("y")) {
			return 1;
		}
		return 0;
	}// ���� �޼ҵ�
	
	void myPage() {
		if (login.isEmpty()) {
			System.out.println("�α����� �ʿ��� ���� �Դϴ�. �α��� ȭ������ �̵��մϴ�.");
			if(login()==1) {
			return;	
			}
		}
		//���̵�,��ǰ��,����,����Ʈ,�������� ���
		String[]cartPrint= {"���ž��̵�","��ǰ��","��ǰ����","��������Ʈ","��������"};
		System.out.println("[����������]");
		System.out.println("1) ������� 2) ���Ÿ�����");
		switch(scan.nextInt()) {
		case 1:
			System.out.println("ȸ������ ������ ����մϴ�.");
					print_sub();
					System.out.println();
					System.out.print(buy_temp);
					System.out.print(idpw.get(buy_temp.getId()));
					System.out.println();
			break;
		case 2:
			int sumBuy = 0;
			int sumBonus = 0;
			System.out.println("�����Ͻ� ����� ����մϴ�.");
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
			System.out.println("��ü���űݾ�:"+sumBuy+"��");
			System.out.println("��ü ���� ����Ʈ"+sumBonus+"����Ʈ");
			
			break;
		}
		
	}//����������
	
	
	

}// class
