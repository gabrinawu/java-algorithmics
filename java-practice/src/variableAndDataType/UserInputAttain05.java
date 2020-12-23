package variableAndDataType;

import java.util.Scanner;
//scanner是外部类，它的位置是java.util.Scanner,将它导入，然后才能用


public class UserInputAttain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	new Scanner(System.in);//1.创建一个Scanner object 
		Scanner input = new Scanner(System.in);//将这个Scanner对象取名为input
	// 使用Scanner获取用户输入的数据
	//	input.next();//拿到用户输入的下一个数据，返回类型为String
		System.out.print("输入名字：");
        String name = input.next();//将获取的数据存储到取名为name的字符型变量中	
        //控制台图标变红，键盘输入name数据
        System.out.println("名字："+name);
        
        System.out.print("输入年龄：");
        int age=input.nextInt();//Scanner方法nextInt()获取用户输入的下一个整型数据，返回类型为int
        System.out.println("年龄："+age);
        
        System.out.print("输入年龄：");
        double height=input.nextDouble();//Scanner方法nextDouble()获取用户输入的下一个双精度浮点型数据，返回类型为double
        System.out.println("年龄："+height);
	}

}
