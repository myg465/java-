import java.util.*;


public class Ex0306_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//set ->4,6,57,3,2,10 �����Ͽ� ����ϱ�
		//map -> 1,�� /2,��/3,��/4,��/5,����
		//�α��� ���¸� ����� ���� map ��� ����ϱ�
		
		HashSet s1=new HashSet();
		HashMap m1=new HashMap();
		int[]set= {4,6,57,3,2,10};
		for(int i=0;i<set.length;i++) {
			s1.add(set[i]);
		}
		String[]map= {"��","��","��","��","����"};
		for(int i=0;i<map.length;i++) {
			m1.put((i+1), map[i]);
		}
		
		while(true) {
			System.out.println("1)set��� 2) �α��� 3) map���");
			switch(scan.nextInt()) {
			case 1:
				Iterator it3=s1.iterator();
				while(it3.hasNext()) {
					System.out.println(it3.next());
				}
				break;
			case 2:
				while(true) {
					System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���.");
					System.out.print("id:");
					int id=scan.nextInt();
					scan.nextLine();
					if(!(m1.containsKey(id))) {
						System.out.println("id�� Ʋ�Ƚ��ϴ�.");
						continue;
					}
					
					System.out.print("pw:");
					String pw =scan.nextLine().trim();
					if(!(m1.get(id).equals(pw))) {
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
						continue;
					}
					System.out.println("�α����� �Ϸ�Ǿ����ϴ�.");
					break;
					
					//��й�ȣ
				}
				break;
			case 3:
				Iterator it4=m1.entrySet().iterator();
				while(it4.hasNext()) {
					System.out.println(it4.next());
				}
				break;
			}
		}//while

	}

}
