package �ӿ�ʵ����;
/**
 * Ŀ�ģ� 1 ѧϰ�ӿ�ʵ����--�����ڲ���
 *       2 �����ӿ�ʵ����ʱ�Ĳ�������������
 * @author īǳ
 */
public class Main {
	public static void main(String[] args) {
		new Animal() {
			@Override
			public void eat(String food) {
				System.out.println("Animal eat " + food);

			}
		}.eat("fish");;
	}

}
