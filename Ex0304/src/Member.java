
public class Member {

	String id;
	String pw;
	String name;
	String s_number;//�ֹι�ȣ
	String email;//�̸���
	String tel;//����
	int gender;//����
	Member(){
		
	}
	Member(String id, String pw, String name, String s_number, String email, String tel, int gender){
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.s_number=s_number;
		this.email=email;
		this.tel=tel;
		this.gender=gender;
	}
	
	public String toString() {
		return id+"\t"+pw+"\t"+name+"\t"+s_number+"\t"+email+"\t"+tel+"\t"+gender;
	}
	
	
	
}
