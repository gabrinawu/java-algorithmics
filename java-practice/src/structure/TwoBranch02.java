package structure;

import java.util.Scanner;

public class TwoBranch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入你的年龄：");
		int age = input.nextInt();
		if(age>=18) {
			System.out.println("成年");
		}else {
			System.out.println("未成年");
		}
		
		
		System.out.println("请输入第一个整数:");
		int a = input.nextInt();
		System.out.print("请输入第二个整数:");
		int b = input.nextInt();
		if(a%b==0||a+b>100) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

}
