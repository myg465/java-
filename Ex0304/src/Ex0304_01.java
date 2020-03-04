
public class Ex0304_01 {

	public static void main(String[] args) {
		// 
	    Person p1=new Person(8880101105519L);
	    Person p2=new Person(8880101105519L);

	    System.out.println("P1:"+p1);
	    System.out.println("P2:"+p2);
	    
	    System.out.println("==비교연산 결과:"+(p1==p2));//주소값이 달라서 false
	    System.out.println("equals비교결과:"+p1.equals(p2));
	}

}

class Person{
	
	long id;
	
	Person(){ }
	Person(long id){
		this.id=id;
	}
	
	public boolean equals(Object obj) {// 오버라이딩
		if(obj!=null&& obj instanceof Person) {
//			Person p=(Person)obj;
//			if(id==p.id) {
//				return true;
//			}
		  return id==((Person)obj).id;// 위의 코드와 똑같음
		}else {
			return false;
		}
		
	}
	
	public String toString() {
		return "변수 값:"+id;
	}
}

