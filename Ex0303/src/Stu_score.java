
public class Stu_score{
	//�й�,�̸�(�й��� ������ �ڵ����� ����),  ����, ����, �հ�, ���, ���
   int hak_num;
   String name;
   int kor;
   int eng;
   int total;
   float avg;
   int rank;
   
   Stu_score(){
	   
   }
   Stu_score(int hak_num, String name, int kor, int eng){
	   this.hak_num=hak_num;
	   this.name=name;
	   this.kor=kor;
	   this.eng=eng;
   }
   void cal() {
	   total=kor+eng;
	   avg=(int)((total/2f)*10)/10f;
   }
   
   public String toString() {
	   return hak_num+"\t"+name+"\t"+kor+"\t"+eng+"\t"+total+"\t"+avg+"\t"+rank;
   }
	
}
