import java.util.*;

public class Ex0302_03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Stu_info>info=new ArrayList<Stu_info>();
		
		
		String[]name= {"홍길동","홍길동","이순신"};
		String[]major= {"컴퓨터공학","영문학과","미술학과"};
		int[]grade= {1,2,4};
		String[]tel= {"02-1224-5534","029-2235-4433","010-3454-3355"};
		info.add(new Stu_info(name[0],major[0],grade[0],tel[0]));
		info.add(new Stu_info(name[1],major[1],grade[1],tel[1]));
		info.add(new Stu_info(name[2],major[2],grade[2],tel[2]));
		while(true) {
			System.out.println("1) 학생정보입력 2) 출력 3) 검색");
			int num=scan.nextInt();
			scan.nextLine();
			switch(num) {
			case 1:
//				while(true) {
//					System.out.println("이름을 입력하세요.(이전화면:99)");
//					String name1=scan.nextLine();
//					if(name1.equals("99")) {
//						System.out.println("이전화면으로 돌아갑니다.");
//						break;
//					}
//					System.out.println("전공을 입력하세요.");
//					String major1=scan.nextLine();
//					System.out.println("학년을 입력하세요.");
//					int grade1=scan.nextInt();
//					scan.nextLine();
//					System.out.println("전화번호를 입력하세요.");
//					String tel1=scan.nextLine();
//					//객체에 넣기
//					info.add(new Stu_info(name1,major1,grade1,tel1));
//				}
				break;
			
			case 2:
				if(info.isEmpty()) {//데이터 유무 확인
					System.out.println("데이터가 없습니다.");
					break;
				}
				
				for(int i=0;i<info.size();i++) {
					Stu_info stu=(Stu_info)info.get(i);
					System.out.print(stu.hak_num+"\t"+stu.name+"\t"+stu.major);
					System.out.println();
				}
				break;
				
			case 3:
				while(true) {
					System.out.println("검색할 이름을 입력하세요.(이전화면:99)");
					String name2=scan.nextLine();
					if(name2.equals("99")) {
						System.out.println("이전화면으로 이동합니다.");
						break;
					}
					for(int i=0;i<info.size();i++) {//동명이인이 있으면
						Stu_info stu=(Stu_info)info.get(i);
						if(name2.equals(stu.name)) {
							System.out.println("찾는 학생은");
							System.out.println(stu.hak_num+" "+stu.name+" "+stu.major+" "+stu.grade+" "+stu.tel);
						}
					}
				}
				break;
			}
			
		}
		
		
		
//		String name="";
//		String major="";
//		int grade=0;
//		String tel="";
		
//		for(int i=0;i<3;i++) {
//			System.out.println("이름을 입력하세요.");
//			name=scan.nextLine();
//			System.out.println("전공을 입력하세요.");
//			major=scan.nextLine();
//			System.out.println("학년을 입력하세요.");
//			grade=scan.nextInt();
//			scan.nextLine();
//			System.out.println("전화번호를 입력하세요.");
//			tel=scan.nextLine();
//			info.add(new Stu_info(name,major,grade,tel));
//		}
//		for(int i=0;i<info.size();i++) {
//			Stu_info s=(Stu_info)info.get(i);
//			System.out.println(s);
//		}

	}

}
