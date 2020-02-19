
public class Student {
	
	Student(){
		
	}
	Student(String n, int k, int e, int m){// 하나의 메소드다.(조건문도 쓸수있고 다 가능)
		name=n;
		kor=k;
		eng=e;
		math=m;
		total=kor+eng+math;// 알아서 계산됨
		avg=total/3;//알아서 계산됨
	}
	
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	

}
