package static�β�;

public class Student {
	private String name;
	private int age;
	public Student(){}
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		System.out.println(name+age);
		// TODO Auto-generated method stub
		return super.toString();
	}
}
