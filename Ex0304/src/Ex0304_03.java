
public class Ex0304_03 extends Object{

	public static void main(String[] args) {
		Card c1=new Card(7,"ȫ�浿","����","�븮",170,4,3,"010-3384-3384");
		Card c2=new Card(3,"�̼���","�Ǹ�","���",140,1,2,"010-3300-3384");
		Card c3=new Card(1,"ȫ���","��ȹ","����",300,30,9,"010-3384-3328");
		//3���� ������ �Է��ϰ� toString�� �������̵� �ؼ� ����ϱ�
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
class Card{
	int id_num;
	String name;
	String department;
	String position;//��å
	int salary;//����
	int period;//�ٹ��Ⱓ
	int v_count;//����
	String tel;//��ȭ��ȣ
	
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
		return "�����ȣ:"+id_num+"  �̸�:"+name+"  �μ�:"+department
		+"  ��å:"+position+"  ����:"+salary+"����  �ٹ��Ⱓ:"+v_count+"��  ��ȭ��ȣ:"+tel;
	}
	
	
	
	
	
}
