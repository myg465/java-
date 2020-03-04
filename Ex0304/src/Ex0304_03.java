
public class Ex0304_03 extends Object{

	public static void main(String[] args) {
		Card c1=new Card(7,"홍길동","영업","대리",170,4,3,"010-3384-3384");
		Card c2=new Card(3,"이순신","판매","사원",140,1,2,"010-3300-3384");
		Card c3=new Card(1,"홍길순","기획","과장",300,30,9,"010-3384-3328");
		//3명의 직원을 입력하고 toString을 오버라이딩 해서 출력하기
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
class Card{
	int id_num;
	String name;
	String department;
	String position;//직책
	int salary;//월급
	int period;//근무기간
	int v_count;//년차
	String tel;//전화번호
	
	Card(){
		
	}
	Card(int id_num, String name, String department, String position, 
		int salary, int period, int v_count, String tel) {
		this.id_num=id_num;
		this.name=name;
		this.department=department;
		this.position=position;
		this.salary=salary;
		this.period=period;
		this.v_count=v_count;
		this.tel=tel;
	}
	
	public String toString() {
		return "사원번호:"+id_num+"  이름:"+name+"  부서:"+department
		+"  직책:"+position+"  월급:"+salary+"만원  근무기간:"+v_count+"년  전화번호:"+tel;
	}
	
	
	
	
	
}
