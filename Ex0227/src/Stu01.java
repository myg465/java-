
final class Stu01 /*extends Object*/{
	 
	
	 private static Stu01 s=new Stu01();
	
	  private int hak_num;
	  private String name;
      private int kor;
	 
      private Stu01() {
    	  
      }
      
      public static Stu01 getInstance() {
    	  if(s==null) {
    		  s=new Stu01();
    	  }
    	  
    	  return s;
      }
      
      public int getHak_num() {
		return hak_num;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public String toString() {
    	  return "�й�:"+hak_num+"/�̸�:"+name+"/��������:"+kor;
      }
      
      
}
