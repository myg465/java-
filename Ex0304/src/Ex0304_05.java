import java.util.ArrayList;
import java.util.Scanner;

public class Ex0304_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//입력받아서 arraylist에 넣기
		//1. 회원입력 2. 회원출력
		//입력시 id-대문자 1개이상 포함,5자리이상,중복체크  /pw-특수문자1개이상 길이 8이상/ 주민번호 -포함 14자리입력/이메일 @.있는지 체크
		//성별입력(0또는1이 아니면 다시입력)
		//회원출력시 gender 0이면 남자 1이면 여자 
		String[]sub= {"아이디","패스워드","이름","주민번호","이메일","전화번호","성별"};
		String[]input=new String[6];
		int gen=0;
		ArrayList<Member> list=new ArrayList<Member>();
	    while(true) {
	    	System.out.println("[회원 관리 페이지]");
	    	System.out.println("1)회원 입력 2)회원 출력");
	    	System.out.println("원하는 번호를 입력하세요.");
	    	int s_num=scan.nextInt();
	    	scan.nextLine();
	    	
	    	switch(s_num) {
	    	case 1:
	    		System.out.println("[회원입력]");
	    		loop:while(true) {
	    			
	    			while(true) {
	    			System.out.println("아이디를 입력하세요.(이전메뉴:0)");
	    			input[0]=scan.nextLine();
	    			if(input[0].equals("0")) {
	    				break loop;
	    			}
	    			boolean check=false;
	    			if(list.isEmpty()) {}
	    			else { for(int i=0;i<list.size();i++) {
	    					Member m=(Member)list.get(i);
	    					if(m.id.equals(input[0])) {
	    						check=true;
	    						break;
	    					}
	    				}
	    			}
	    			if(check==true) {
	    				System.out.println("아이디 중복이 있습니다.");
	    				continue;
	    			}
	    			if(input[0].length()<5) {
	    				System.out.println("아이디는 5자리 이상이어야 합니다.");
	    				continue;
	    			}
	    			check=false;
	    			for(int i=0;i<input[0].length();i++) {
	    				if(input[0].charAt(i)>='A'&&input[0].charAt(i)>='Z') {
	    					check=true;
	    				}
	    			}
	    			if(check==false) {
	    				System.out.println("대문자를 한개이상 포함시켜야 합니다.");
	    				continue;
	    			}
	    			
	    			break;
	    			}
	    			
	    			while(true) {
	    				//pw-특수문자1개이상 길이 8이상
	    				//33-47,58-64,91-96,123-126
	    				System.out.println("비밀번호를 입력하세요.");
	    				input[1]=scan.nextLine();
	    				if(input[1].length()<8) {
	    					System.out.println("비밀번호는 8자 이상이어야 합니다.");
	    					continue;
	    				}
	    				
	    				if(input[1].matches("[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힝]*"))
	    				 {
	    					System.out.println("특수문자를 하나이상 포함하여야합니다.");
	    					continue;
	    				}
	    				break;
	    			}
	    			
	    			
	    			System.out.println("이름을 입력하세요.");
	    			input[2]=scan.nextLine();
	    			
	    			
	    			while(true) {
	    				gen=0;
	    				System.out.println("주민번호를 입력하세요.");
	    				input[3]=scan.nextLine();
	    				if(!(input[3].length()==14)) {
	    					System.out.println("주민번호는 14자리를 입력하십시오");
	    				    continue;
	    				}
	    				if(input[3].charAt(7)==2||input[3].charAt(7)==4) {
	    					gen=1;
	    				}
	    				break;
	    			}
	    			while(true) {
	    				System.out.println("이메일을 입력하세요.");
	    				input[4]=scan.nextLine();
	    				boolean check=false;
	    				for(int i=0;i<input[4].length();i++) {
	    					if(input[4].contains("@")) {
	    						if(input[4].contains(".")) {
	    							check=true;
	    						}
	    					}
	    				}
	    				if(check==false) {
	    					System.out.println("적절한 이메일 형식이 아닙니다.");
	    					continue;
	    				}
	    				break;
	    			}
	    			
	    			System.out.println("전화번호를 입력하세요.");
	    			input[5]=scan.nextLine();
	    			
	    			list.add(new Member(input[0],input[1],input[2],input[3],input[4],input[5],gen));
	    		
	    		}//while
	    		
	    		break;
	    	case 2:
	    		if(list.isEmpty()) {
	    			System.out.println("정보가 없습니다.");
	    			break;
	    		}
	    		System.out.println("[회원출력]");
	    		for(int i=0;i<sub.length;i++) {
	    			System.out.print(sub[i]+"\t");
	    		}System.out.println();
	    		for(int i=0;i<list.size();i++) {
	    			Member me=(Member)list.get(i);
	    			System.out.println(me);
	    		}
	    		break;
	    	}
	    }//while
		
		
		
	}//main

}//class
