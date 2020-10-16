package 接口实例化;
/**
 * 目的： 1 学习接口实例化--匿名内部类
 *       2 分析接口实例化时的参数来自于哪里
 * @author 墨浅
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
