import java.util.*;

public class Ex0302_03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Stu_info>info=new ArrayList<Stu_info>();
		
		
		String[]name= {"ȫ�浿","ȫ�浿","�̼���"};
		String[]major= {"��ǻ�Ͱ���","�����а�","�̼��а�"};
		int[]grade= {1,2,4};
		String[]tel= {"02-1224-5534","029-2235-4433","010-3454-3355"};
		info.add(new Stu_info(name[0],major[0],grade[0],tel[0]));
		info.add(new Stu_info(name[1],major[1],grade[1],tel[1]));
		info.add(new Stu_info(name[2],major[2],grade[2],tel[2]));
		while(true) {
			System.out.println("1) �л������Է� 2) ��� 3) �˻�");
			int num=scan.nextInt();
			scan.nextLine();
			switch(num) {
			case 1:
//				while(true) {
//					System.out.println("�̸��� �Է��ϼ���.(����ȭ��:99)");
//					String name1=scan.nextLine();
//					if(name1.equals("99")) {
//						System.out.println("����ȭ������ ���ư��ϴ�.");
//						break;
//					}
//					System.out.println("������ �Է��ϼ���.");
//					String major1=scan.nextLine();
//					System.out.println("�г��� �Է��ϼ���.");
//					int grade1=scan.nextInt();
//					scan.nextLine();
//					System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
//					String tel1=scan.nextLine();
//					//��ü�� �ֱ�
//					info.add(new Stu_info(name1,major1,grade1,tel1));
//				}
				break;
			
			case 2:
				if(info.isEmpty()) {//������ ���� Ȯ��
					System.out.println("�����Ͱ� �����ϴ�.");
					break;
				}
				
				for(int i=0;i<info.size();i++) {
					Stu_info stu=(Stu_info)info.get(i);
					System.out.print(stu.hak_num+"\t"+stu.name+"\t"+stu.major);
					System.out.println();
				}
				break;
				
			case 3:
				while(true) {
					System.out.println("�˻��� �̸��� �Է��ϼ���.(����ȭ��:99)");
					String name2=scan.nextLine();
					if(name2.equals("99")) {
						System.out.println("����ȭ������ �̵��մϴ�.");
						break;
					}
					for(int i=0;i<info.size();i++) {//���������� ������
						Stu_info stu=(Stu_info)info.get(i);
						if(name2.equals(stu.name)) {
							System.out.println("ã�� �л���");
							System.out.println(stu.hak_num+" "+stu.name+" "+stu.major+" "+stu.grade+" "+stu.tel);
						}
					}
				}
				break;
			}
			
		}
		
		
		
//		String name="";
//		String major="";
//		int grade=0;
//		String tel="";
		
//		for(int i=0;i<3;i++) {
//			System.out.println("�̸��� �Է��ϼ���.");
//			name=scan.nextLine();
//			System.out.println("������ �Է��ϼ���.");
//			major=scan.nextLine();
//			System.out.println("�г��� �Է��ϼ���.");
//			grade=scan.nextInt();
//			scan.nextLine();
//			System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
//			tel=scan.nextLine();
//			info.add(new Stu_info(name,major,grade,tel));
//		}
//		for(int i=0;i<info.size();i++) {
//			Stu_info s=(Stu_info)info.get(i);
//			System.out.println(s);
//		}

	}

}
