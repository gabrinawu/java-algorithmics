package structure;

import java.util.Scanner;

public class MaxMin07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("请依次输入三个整数：");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int max, min;
		//先比较a和b
		if(a>b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		if(c>max) {
			max = c;
		}
		if(c<min) {
			min = c;
		}
		System.out.println("最大值:"+max);
		System.out.println("最小值:"+min);
	}

}
