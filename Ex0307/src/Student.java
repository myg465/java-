
public class Student {

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
		return "�й�:"+hak_num+"�̸�:"+name+"�հ�:"+total;
	}
	
}
