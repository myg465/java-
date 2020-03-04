
public class Member {

	String id;
	String pw;
	String name;
	String s_number;//주민번호
	String email;//이메일
	String tel;//전번
	int gender;//성별
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
