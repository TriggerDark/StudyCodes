package Test1;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = '\0';
		for(int i=1; i<=4;i++){
			switch(i){
			case 1:c = 'Äã';
				System.out.print(c);
			case 2:c = 'ºÃ';
				System.out.print(c);
				break;
			case 3:c = '¿á';
				System.out.print(c);
			default:
				System.out.print("!");
			}
		}
	}

}
