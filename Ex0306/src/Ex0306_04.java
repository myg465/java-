import java.util.*;

public class Ex0306_04 {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		HashSet set1=new HashSet();
		ArrayList list1=new ArrayList();
		
		list1.add(new Integer(1));
		list1.add(new Integer(2));
		list1.add(new Integer(3));
		
		map.put("myId", "1234");
		map.put("dream", "d1111");
		map.put("aaa", "aoooo");//중복이 되면 앞에게 사라짐
		map.put("bbb", "d1111");
		map.put("aaa","axxxx");
		
		
		Iterator it=map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	

	}

}
