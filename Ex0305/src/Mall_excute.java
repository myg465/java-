import java.util.ArrayList;
import java.util.Scanner;

public class Mall_excute {
//��ɾ�(�޼ҵ�)

	Scanner scan=new Scanner(System.in);
	String[]sub_member= {"���̵�","�н�����","�̸�","��ȭ��ȣ","�����ݾ�","��������Ʈ"};
	ArrayList<Member>memArr=new ArrayList<Member>();
	ArrayList<Login>s_login=new ArrayList<Login>();
	
	
	int print_main() {
		System.out.println("[���̸�Ʈ]");
		System.out.println("1) ȸ������ 2) �α��� 3) ��ǰ���� ");
		System.out.println("7) �α׾ƿ� 8) ȸ���˻� 9) ȸ��������ü��� 0) ����");
		System.out.println("��ȣ�� �Է����ּ���");
		int s_num=scan.nextInt();
		scan.nextLine();
		return s_num;
	}
	
	void login() {
		loop1:while(true) {
			String[]login_check=new String[2];
			for(int i=0;i<login_check.length;i++) {
				System.out.println(sub_member[i]+"�� �Է��ϼ���.");
				login_check[i]=scan.nextLine();
			}
			boolean check=false;
			for(int i=0;i<memArr.size();i++) {
				Member ch=(Member)memArr.get(i);
				if(login_check[0].equals(ch.getId())&&login_check[1].equals(ch.getPw())) {
					System.out.println("�α����� �Ϸ�Ǿ����ϴ�.");
					s_login.add(new Login(ch.getId()));
					check=true;
					break loop1;
				}
			}
			if(check==false) {
				System.out.println("���̵� �н����尡 ��ġ���� �ʽ��ϴ�.");
				System.out.println("ȸ�������� �Ͻðڽ��ϱ�?(y/n)");
				if(scan.nextLine().equalsIgnoreCase("y")) {
					System.out.println("ȸ������ ȭ������ �̵��մϴ�.");
					join();
					break loop1;
				}
				continue;
			}
			
		}
		
	}//�α��� �޼ҵ�
	
    void logout() {
	   s_login.clear();
    }//�α׾ƿ� �޼ҵ�
	
	void join() {
		System.out.println("[ȸ������]");
		String[]info=new String[4];
		loop2:while(true) {
			System.out.println("����� ���̵� �Է��ϼ���.(3���̻�)(�����޴�:0)");
			info[0]=scan.nextLine();
			if(back(info[0])==0) {
				System.out.println("�����޴��� �̵��մϴ�.");
				return;
			}
			for(int i=0;i<memArr.size();i++) {
			     Member m=(Member)memArr.get(i);
			     if(info[0].equals(m.getId())) {
			    	 System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.");
			    	 continue loop2;
			        }
			    }//�ߺ��˻� for
			if(info[0].length()<3) {
				System.out.println("���̵�� 3�� �̻��̾�� �մϴ�.");
				continue;
			}
			break;
		}//���̵�while
		
		while(true) {
			System.out.println("��й�ȣ�� �Է��� �ּ���.");
			info[1]=scan.nextLine();
			if(info[1].length()<8) {
				System.out.println("��й�ȣ�� 8�� �̻��̾�� �մϴ�.");
				continue;
			}
			break;
			
		}//��й�ȣ while
		
		System.out.println("�̸��� �Է��� �ּ���.");
		info[2]=scan.nextLine();
		
		
		System.out.println("��ȭ��ȣ�� �Է��� �ּ���.");
		info[3]=scan.nextLine();
			
			
		memArr.add(new Member(info[0],info[1],info[2],info[3]));
	}//join �޼ҵ�
	
	void print_sp() {
		while(true) {
			System.out.println("�˻��� ���ϴ� �̸��� �Է��ϼ���.(�����޴�:0)");
			String check_name=scan.nextLine();
			if(back(check_name)==0) {
				System.out.println("�����޴��� �̵��մϴ�.");
				return;
			}
			for(int i=0;i<memArr.size();i++) {
				Member sp=(Member)memArr.get(i);
				if(sp.getName().contains(check_name)) {
					print_mem(i);
				}
			}
			
		}
	}//ȸ�� �˻���� �޼ҵ�
	
	
	void print_mem(){
		System.out.println("[ȸ������ ��ü���]");
		for(int i=0;i<sub_member.length;i++) {
			System.out.print(sub_member[i]+"\t");
		}System.out.println();
		for(int i=0;i<memArr.size();i++) {
			System.out.println(memArr.get(i));
		}
	}// ȸ����ü��� �޼ҵ�
	void print_mem(int j){
		System.out.println("[ȸ���������]");
		for(int i=0;i<sub_member.length;i++) {
			System.out.print(sub_member[i]+"\t");
		}System.out.println();
		for(int i=j;i<j+1;i++) {
			System.out.println(memArr.get(i));
		}
	}// ȸ���˻���� �޼ҵ�(�����ε�)
	
	int back(String check) {
		if(check.equals("0")) {
			return 0;
		}
		return 1;
	}//(���)�ڷΰ���
	
	int buy() {
	    while(true) {
	    	if(s_login.isEmpty()) {//�α��� ����
	    		System.out.println("�α��� �� ��밡���մϴ�.");
	    		return -2;
	    	}
	    }
	}//����
	
	
	
}//class
