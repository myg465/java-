
public class Student {
	
	Student(){
		
	}
	Student(String n, int k, int e, int m){// �ϳ��� �޼ҵ��.(���ǹ��� �����ְ� �� ����)
		name=n;
		kor=k;
		eng=e;
		math=m;
		total=kor+eng+math;// �˾Ƽ� ����
		avg=total/3;//�˾Ƽ� ����
	}
	
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	

}
