package static�β�;

public class Teacher {

	private String name;
	private String sex;
	public Teacher(){
		
	}
	public Teacher(String name,String sex) {
		this.name = name;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		System.out.println(name+sex);
		return super.toString();
	}
}
