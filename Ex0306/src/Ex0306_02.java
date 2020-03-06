import java.util.HashSet;
import java.util.Iterator;

public class Ex0306_02 {
	//set과 이터레이터

	public static void main(String[] args) {
		HashSet set1=new HashSet();
		set1.add(new Integer(1));
		set1.add(new Integer(2));
		set1.add(new Integer(1));
		set1.add(new Integer(4));
		set1.add(new Integer(1));
		set1.add(new Integer(6));

		Iterator it =set1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());// 순서대로 나오지 않는다.
			it.remove();//읽어온 1개를 지운다.
		}
		Iterator it1 =set1.iterator();
		System.out.print("두번째출력:");
		while(it1.hasNext()) {
			System.out.println(it1.next());// 순서대로 나오지 않는다., 
		}
		
		
		
		
		

	}

}
