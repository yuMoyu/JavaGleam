package 接口实例化;

public class Cat {
	private String food;
	
	public Cat(){}
	public Cat(Animal animal) {
	
	}
	public void foods(String food) {
		System.out.println("猫咪爱吃"+food);
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
}
