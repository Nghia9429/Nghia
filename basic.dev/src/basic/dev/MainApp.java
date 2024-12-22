package basic.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//11.1. Viết chương trình tính tổng các số từ 1 đến 100
		int i = 1;
		int tong = 0;
		while (i <= 100) {
			tong += i;
			i++;
		}
		System.out.print("tong=" + tong);

	}

}
