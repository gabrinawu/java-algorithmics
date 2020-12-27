package structure;

import java.util.Scanner;

public class SingleBranch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;
		if(age >= 18) {
			System.out.println("恭喜你");
			System.out.println("你成年了");
		}
		System.out.println("if之后的代码");
		
		if(true)System.out.println("呵呵"); //if成立时要执行的代码只有一行，此时可以省略大括号(不推荐)
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入java成绩：");
		int java = input.nextInt();
		System.out.print("请输入python成绩：");
		int python = input.nextInt();
		if((java>95&&python>95)||(java==100&&python>90)||(python==100&&java>90)) {
			System.out.println("奖励");
		}
	}

}
