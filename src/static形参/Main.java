package static形参;

public class Main {
	private Teacher teacher1;
	public static void main(String[] args) {
		Main main = new Main();
		main.test();
		//问题4：不会影响
		System.out.println("getTeacher"+main.teacher1.toString());
	}
	public void test(){
		Teacher teacher = new Teacher("李老师","女");
		Student student = new Student("学生",11);
		TestMethod.method1(teacher, student);
		//问题1：会改变
		//问题3：返回值不会影响
		teacher.toString();
		student.toString();
		TestMethod testMethod = new TestMethod();
		teacher1 = new Teacher("gett","nan");
		testMethod.method2(teacher, student,this.getTeacher1());
		//问题2 static不影响
		teacher.toString();
		student.toString();
	}
	public Teacher getTeacher1() {
		return teacher1;
	}
	public void setTeacher1(Teacher teacher1) {
		this.teacher1 = teacher1;
	}
	
}

