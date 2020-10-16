package static形参;

import java.util.HashMap;
import java.util.Map;


public class TestMethod {

	/**
	 * 判断几个问题
	 * 1 传入对象，改变形参时，实参是否改变
	 * 2 静态方法与非静态方法是否会影响参数的改变
	 * 3 返回值是否会影响参数的改变
	 * @param teacher
	 * @param student
	 * @return
	 */
	public static Map method1(Teacher teacher, Student student){
		Map result = new HashMap();
		teacher.setName("method1Teacher");
		student.setName("method1Student");
		result.put("1", teacher);
		return result;
	}
	
	/**
	 * 判断问题
	 * 4 通过getTeacher()获取teacher对象是否会影响参数变化
	 * @param teacher
	 * @param student
	 * @param teacher2
	 * @return
	 */
	public  Map method2(Teacher teacher, Student student,Teacher teacher2){
		Map result = new HashMap();
		teacher.setName("method2Teacher");
		teacher2.setName("method2Teacher1");
		student.setName("method2Student");
		result.put("1", teacher);
		return result;
	}
}
