
public class Stu_info{
	//�й�, �̸�, �а�, �г�,
	static int count;
	int hak_num;
	String name;
	String major;
	int grade;
	
	{
		hak_num=++count;
	}
	Stu_info(){
		
	}
	
	Stu_info(String name,String major, int grade){
		this.name=name;
		this.major=major;
		this.grade=grade;
		
		
	}
	
	public String toString() {
		return hak_num+"\t"+name+"\t"+major+"\t"+grade+"\t";
	}
}
