package prob2;

public class Goods {
 private String drink;
 private int price;
 private int count;
 
 public Goods(String drink, int price, int count ){
	 this.drink = drink;
	 this.price = price;
	 this.count = count;
	 
 }
 
public String getdrink() {
	return drink;
}
public void setdrink(String drink) {
	this.drink = drink;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}

public void showInfo() {
	System.out.println( drink+ "(가격 : " + price + ")원이 " + count + "개 입고 되었습니다.");
}
}
