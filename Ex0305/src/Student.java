
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
		return "�й�:"+hak_num+"  �̸�:"+name+"  �հ�:"+total;
	}
	@Override
	public int compareTo(Student s) {//sort�� ������ �����ִ� �������̵�
//		return this.name.compareTo(s.name);//�񱳸� �ؼ� ��ū���̸� ������ �ٲ۴�.(�̸�)(���ϰ�:1,0,-1)
		if(this.hak_num<s.hak_num) {//���ڸ� ���ϴ���
			return 1;
		}else if(this.hak_num>s.hak_num) {
			return -1;
		}
		return 0;
	}

}
