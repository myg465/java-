
public class Stu_info {
     //�л� ���� 1. �й�-hak_num 2. �̸�-name 3. �а�-major 4. �г�-grade 5. ��ȭ��ȣ-tel 
	static int count=0;
	int hak_num;
	String name;
	String major;
	int grade;
	String tel;
	
	{
		hak_num=++count;
	}
	
	Stu_info(){
		
	}
	Stu_info(String name, String major, int grade, String tel){
		this.name=name;
		this.major=major;
		this.grade=grade;
		this.tel=tel;
	}
	
	public String toString() {//���������� �Է��ص� ���
		return ""+hak_num+"  "+name+"  "+major+"  "+grade+"  "+tel;
	}
	
}
