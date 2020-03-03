
public class Ex0303_02 {

	public static void main(String[] args) {
		A a=new A();
		a.methodA(new Data());

	}

}

class A{
	public void methodA(I i) {
		System.out.println("methodA 가 호출");
		i.methodB();
	}
}

interface I{
	public void methodB();
}
class Data implements I{
	public void methodB() {
		System.out.println("methodB 가 호출되었습니다.");
	}
}



