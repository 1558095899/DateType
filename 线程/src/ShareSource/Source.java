package ShareSource;

public class Source {
	private String name;
	private String age;
	public void save(String name,String age){
		this.name=name;
		this.age=age;
	}
	public void get(){
		System.out.println(this.name+"  "+this.age);
	}   
	
}
