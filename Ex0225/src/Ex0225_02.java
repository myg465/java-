
public class Ex0225_02 {

	public static void main(String[] args) {
		Student[] stu=new Student[3];
		String[]name= new String[]{"ȫ�浿","�̼���","������"};//�̰� ����
		int[]grade= {3,4,1};
		
		for(int i=0;i<stu.length;i++) {
			stu[i]=new Student(name[i],grade[i]);
		}
		
		//lotto��� 45�� �迭
		int[]lotto=new int[45];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		
		//lotto ��ü ��ü���� 1~45 ���ڰ� ���� ��������� �ְ� �����ϸ� 1~45���ִ� lotto�� �����ɼ� �ֵ���
		
		Lotto deck=new Lotto();
		for(int i=0;i<deck.ball.length;i++) {
			System.out.println(deck.ball[i]);
			
		}
		
		
//		stu[0]=new Student(name[0],grade[0]);
//		stu[1]=new Student(name[1],grade[1]);
//		stu[2]=new Student(name[2],grade[2]);


	}

}

