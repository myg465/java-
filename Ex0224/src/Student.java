
public class Student {
	static int count;
    int hak_num;
	String name;
    int kor;//�ڵ��ʱ�ȭ
    int eng;
    int math;
    int total;// int total=kor+eng+math; �̷��� �ص���
    float avg;
    int rank;
    
    {
    	count++;
    	hak_num=count;
    }
    
    Student(){
    	this("test", 50, 50, 50);
    }
    
    
    Student(String name,int kor, int eng, int math){
       this.name=name;
       this.kor=kor;
       this.eng=eng;
       this.math=math;
       this.total=kor+eng+math;
       this.avg=(int)((this.total/3.0)*10)/10f;
    }
    void total() {
    	total=kor+eng+math;
    }
    void avg() {
    	avg=(int)((this.total/3.0)*10)/10f;
    }
    void modify() {
    	total();
    	avg();
    	rank=0;
    }
}
