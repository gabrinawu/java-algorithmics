package structure;

import java.util.Scanner;

public class HandleUserInputError08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("请输入一个整数：");
		//如果用户输入一个非整数，就会出现数据类型不匹配错误
		if(input.hasNextInt()) {//判断下一个用户输入是不是整数，如果是返回true,如果不是返回false
			int num = input.nextInt();
			if(num%2==0) {
				System.out.println("偶数");
			}else {
				System.out.println("奇数");
			}
		}else {
			System.out.println("输入无效!");
		}
		
	//	System.out.println(num); num是if的局部变量
		int b=8;
		if(true) {
			int a=5;
			System.out.println(a);
		}
	//	System.out.println(a); a是if的局部变量，只能在if中使用
	}

}
