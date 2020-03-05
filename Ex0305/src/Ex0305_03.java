import java.util.*;

public class Ex0305_03 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		ArrayList list2=new ArrayList();
		Student stu1=new Student(1,"홍길동",300);
		Student stu2=new Student(2,"이순신",299);
		Student stu3=new Student(3,"김유신",280);
		Student stu4=new Student(4,"유관순",270);
		Student stu5=new Student(5,"강감찬",288);
		list2.add(stu3);
		list2.add(stu1);
		list2.add(stu5);
		list2.add(stu2);
		list2.add(stu4);
		
		
		
		Collections.sort(list2);
		Collections.reverse(list2);
		
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
		
		
		list.add(new Integer(5));//정수형 래퍼 클래스 5를 추가
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		list.add(3);//기본형 타입을 넣으면 자동으로 객체로 변환해서 넣어줌(오토박싱)
		list.add(3, new Integer(7));// 위치를 정할수 있다.
		list.add(5, new Integer(8));

		
		list.clear();//간단히 모두지우는 명령
		list.remove(1);//인덱스번호로 삭제할 곳 지정
		for(int i=0;i<list.size();i++) {// 다안지워짐(하나를 지우고 위로 한칸씩올리고, 다음거지우고 위로한칸씩올리고
			list.remove(i);
		}
		for(int i=list.size()-1;i>=0;i--) {//뒤쪽부터 지워야 지워짐
			list.remove(i);
		}
		
		
		
		
	    Collections.sort(list);
	    Collections.reverse(list);
		
		
		
		System.out.println(list);//toString이 되어있음

	}

}
