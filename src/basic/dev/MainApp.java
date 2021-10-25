package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen a: ");
		int a = sc.nextInt();
		System.out.println(a);
		//tong
		System.out.println("Nhap vao so nguyen b: ");
		int b = sc.nextInt();
		System.out.println(b);
		int tong = a + b;
		System.out.println("tong = " + tong);
		//hieu
		int hieu = a - b;
		System.out.println("hieu = " + hieu);
		//tich
		int tich = a * b;
		System.out.println("tich = " + tich);		
	    // thuong
		int thuong = a / b;
		System.out.println("thuong = " + thuong);
		//gan c
		boolean c = a > b;
		System.out.println("a lon hon b:"+ c);
		c = a < b;
		System.out.println(" a nho hon b:" + c);
		 c = a <= b;
		 System.out.println("a nho hon hoac bang b: " + c);
		c = a >= b;
		System.out.println("a lon hon hoac bang b :" + c);
      
	}

}
