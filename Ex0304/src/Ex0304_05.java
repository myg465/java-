import java.util.ArrayList;
import java.util.Scanner;

public class Ex0304_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//�Է¹޾Ƽ� arraylist�� �ֱ�
		//1. ȸ���Է� 2. ȸ�����
		//�Է½� id-�빮�� 1���̻� ����,5�ڸ��̻�,�ߺ�üũ  /pw-Ư������1���̻� ���� 8�̻�/ �ֹι�ȣ -���� 14�ڸ��Է�/�̸��� @.�ִ��� üũ
		//�����Է�(0�Ǵ�1�� �ƴϸ� �ٽ��Է�)
		//ȸ����½� gender 0�̸� ���� 1�̸� ���� 
		String[]sub= {"���̵�","�н�����","�̸�","�ֹι�ȣ","�̸���","��ȭ��ȣ","����"};
		String[]input=new String[6];
		int gen=0;
		ArrayList<Member> list=new ArrayList<Member>();
	    while(true) {
	    	System.out.println("[ȸ�� ���� ������]");
	    	System.out.println("1)ȸ�� �Է� 2)ȸ�� ���");
	    	System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.");
	    	int s_num=scan.nextInt();
	    	scan.nextLine();
	    	
	    	switch(s_num) {
	    	case 1:
	    		System.out.println("[ȸ���Է�]");
	    		loop:while(true) {
	    			
	    			while(true) {
	    			System.out.println("���̵� �Է��ϼ���.(�����޴�:0)");
	    			input[0]=scan.nextLine();
	    			if(input[0].equals("0")) {
	    				break loop;
	    			}
	    			boolean check=false;
	    			if(list.isEmpty()) {}
	    			else { for(int i=0;i<list.size();i++) {
	    					Member m=(Member)list.get(i);
	    					if(m.id.equals(input[0])) {
	    						check=true;
	    						break;
	    					}
	    				}
	    			}
	    			if(check==true) {
	    				System.out.println("���̵� �ߺ��� �ֽ��ϴ�.");
	    				continue;
	    			}
	    			if(input[0].length()<5) {
	    				System.out.println("���̵�� 5�ڸ� �̻��̾�� �մϴ�.");
	    				continue;
	    			}
	    			check=false;
	    			for(int i=0;i<input[0].length();i++) {
	    				if(input[0].charAt(i)>='A'&&input[0].charAt(i)>='Z') {
	    					check=true;
	    				}
	    			}
	    			if(check==false) {
	    				System.out.println("�빮�ڸ� �Ѱ��̻� ���Խ��Ѿ� �մϴ�.");
	    				continue;
	    			}
	    			
	    			break;
	    			}
	    			
	    			while(true) {
	    				//pw-Ư������1���̻� ���� 8�̻�
	    				//33-47,58-64,91-96,123-126
	    				System.out.println("��й�ȣ�� �Է��ϼ���.");
	    				input[1]=scan.nextLine();
	    				if(input[1].length()<8) {
	    					System.out.println("��й�ȣ�� 8�� �̻��̾�� �մϴ�.");
	    					continue;
	    				}
	    				
	    				if(input[1].matches("[0-9|a-z|A-Z|��-��|��-��|��-��]*"))
	    				 {
	    					System.out.println("Ư�����ڸ� �ϳ��̻� �����Ͽ����մϴ�.");
	    					continue;
	    				}
	    				break;
	    			}
	    			
	    			
	    			System.out.println("�̸��� �Է��ϼ���.");
	    			input[2]=scan.nextLine();
	    			
	    			
	    			while(true) {
	    				gen=0;
	    				System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
	    				input[3]=scan.nextLine();
	    				if(!(input[3].length()==14)) {
	    					System.out.println("�ֹι�ȣ�� 14�ڸ��� �Է��Ͻʽÿ�");
	    				    continue;
	    				}
	    				if(input[3].charAt(7)==2||input[3].charAt(7)==4) {
	    					gen=1;
	    				}
	    				break;
	    			}
	    			while(true) {
	    				System.out.println("�̸����� �Է��ϼ���.");
	    				input[4]=scan.nextLine();
	    				boolean check=false;
	    				for(int i=0;i<input[4].length();i++) {
	    					if(input[4].contains("@")) {
	    						if(input[4].contains(".")) {
	    							check=true;
	    						}
	    					}
	    				}
	    				if(check==false) {
	    					System.out.println("������ �̸��� ������ �ƴմϴ�.");
	    					continue;
	    				}
	    				break;
	    			}
	    			
	    			System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
	    			input[5]=scan.nextLine();
	    			
	    			list.add(new Member(input[0],input[1],input[2],input[3],input[4],input[5],gen));
	    		
	    		}//while
	    		
	    		break;
	    	case 2:
	    		if(list.isEmpty()) {
	    			System.out.println("������ �����ϴ�.");
	    			break;
	    		}
	    		System.out.println("[ȸ�����]");
	    		for(int i=0;i<sub.length;i++) {
	    			System.out.print(sub[i]+"\t");
	    		}System.out.println();
	    		for(int i=0;i<list.size();i++) {
	    			Member me=(Member)list.get(i);
	    			System.out.println(me);
	    		}
	    		break;
	    	}
	    }//while
		
		
		
	}//main

}//class
