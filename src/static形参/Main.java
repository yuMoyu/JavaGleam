package static�β�;

public class Main {
	private Teacher teacher1;
	public static void main(String[] args) {
		Main main = new Main();
		main.test();
		//����4������Ӱ��
		System.out.println("getTeacher"+main.teacher1.toString());
	}
	public void test(){
		Teacher teacher = new Teacher("����ʦ","Ů");
		Student student = new Student("ѧ��",11);
		TestMethod.method1(teacher, student);
		//����1����ı�
		//����3������ֵ����Ӱ��
		teacher.toString();
		student.toString();
		TestMethod testMethod = new TestMethod();
		teacher1 = new Teacher("gett","nan");
		testMethod.method2(teacher, student,this.getTeacher1());
		//����2 static��Ӱ��
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

