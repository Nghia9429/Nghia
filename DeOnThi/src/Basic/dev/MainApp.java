package Basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int chieuDai;
		int chieuRong;

		System.out.println("chieu Dai =");
		chieuDai = sc.nextInt();
		System.out.println("chieu Rong =1");
		chieuRong = sc.nextInt();

		int dienTich = chieuDai * chieuRong;
		int chuVi = (chieuDai + chieuRong) * 2;
		System.out.println("Dien tich:" + chieuDai);
		System.out.println("Chu Vi:" + chieuRong);
	}

}
