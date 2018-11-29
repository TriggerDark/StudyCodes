package Test;

enum Season{
	Spring,Summer,Autumn,Winter
}

enum WeekDay{
	Sunday,Monday,Thuesday,Wednesday,Thursday,Friday,Saturday
}
public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season x=Season.Autumn;
		x=Season.Spring;
		WeekDay w=WeekDay.Friday;
		Season[] son=Season.values();
		for(Season element:son){
			System.out.println(element);
		}
		WeekDay[] wd = WeekDay.values();
		for(WeekDay elements:wd){
			System.out.println(elements);
		}
	}
}
