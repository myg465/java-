
public class Student {
    static int count;
    private int hak_num;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private float avg;
    private int rank;
	{
		hak_num=++count;
	}
	
	
	Student(String name, int kor, int eng, int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		sum=kor+eng+math;
		avg=(int)(sum/3.0*10)/10f;
	}
	
	
	public int getHak_num() {
		return hak_num;
	}


	public int getRank() {
		return rank;
	}


	public String getName() {
		return name;
	}
	public int getSum() {
		return sum;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String toString(){
		return hak_num+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+
				"\t"+sum+"\t"+avg+"\t"+rank;
	}
	
	
}
