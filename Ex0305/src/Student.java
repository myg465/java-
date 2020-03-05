
public class Student implements Comparable<Student>{
	int hak_num;
	String name;
	int total;
	
	
	Student(){}
	Student(int hak_num,String name, int total){
		this.hak_num=hak_num;
		this.name=name;
		this.total=total;
	}
	
	
	
	public String toString() {
		return "학번:"+hak_num+"  이름:"+name+"  합계:"+total;
	}
	@Override
	public int compareTo(Student s) {//sort할 기준을 정해주는 오버라이딩
//		return this.name.compareTo(s.name);//비교를 해서 더큰쪽이면 순서를 바꾼다.(이름)(리턴값:1,0,-1)
		if(this.hak_num<s.hak_num) {//숫자를 비교하는쪽
			return 1;
		}else if(this.hak_num>s.hak_num) {
			return -1;
		}
		return 0;
	}

}
