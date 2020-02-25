
public class Ex0225_02 {

	public static void main(String[] args) {
		Student[] stu=new Student[3];
		String[]name= new String[]{"홍길동","이순신","김유신"};//이게 정식
		int[]grade= {3,4,1};
		
		for(int i=0;i<stu.length;i++) {
			stu[i]=new Student(name[i],grade[i]);
		}
		
		//lotto라는 45개 배열
		int[]lotto=new int[45];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		
		//lotto 객체 객체에서 1~45 숫자가 들어가서 만들어질수 있게 선언만하면 1~45들어가있는 lotto가 생성될수 있도록
		
		Lotto deck=new Lotto();
		for(int i=0;i<deck.ball.length;i++) {
			System.out.println(deck.ball[i]);
			
		}
		
		
//		stu[0]=new Student(name[0],grade[0]);
//		stu[1]=new Student(name[1],grade[1]);
//		stu[2]=new Student(name[2],grade[2]);


	}

}

