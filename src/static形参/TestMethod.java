package static�β�;

import java.util.HashMap;
import java.util.Map;


public class TestMethod {

	/**
	 * �жϼ�������
	 * 1 ������󣬸ı��β�ʱ��ʵ���Ƿ�ı�
	 * 2 ��̬������Ǿ�̬�����Ƿ��Ӱ������ĸı�
	 * 3 ����ֵ�Ƿ��Ӱ������ĸı�
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
	 * �ж�����
	 * 4 ͨ��getTeacher()��ȡteacher�����Ƿ��Ӱ������仯
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
