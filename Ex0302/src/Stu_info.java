
public class Stu_info {
     //학생 정보 1. 학번-hak_num 2. 이름-name 3. 학과-major 4. 학년-grade 5. 전화번호-tel 
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
	
	public String toString() {//참조변수만 입력해도 출력
		return ""+hak_num+"  "+name+"  "+major+"  "+grade+"  "+tel;
	}
	
}
