package day5.classEx;

public class Fruit {
	private String name;
	private int price;
	private int count;
	
	// 필드 아래에서 우클릭 -> source -> generate getter and setter.
	
	Fruit(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public void setPrice(int price) {
		//검증
		if(price < 100) {
			System.out.println("가격을 다시 확인해주세요.");
			return;
		} 
		//정상로직
		this.price = price;
	}
	public int getPrice() {
		return price;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
