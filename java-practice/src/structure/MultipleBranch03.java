package structure;

import java.util.Scanner;

public class MultipleBranch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入您的考试成绩：");
		int score = input.nextInt();
		
		//条件由严格到宽松进行判断
		if(score==100) {
			System.out.println("完美");
		}else if(score>=90) {
			System.out.println("优秀");
		}else if(score>=70) {
			System.out.println("良好");
		}else if(score>=60) {
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
	}

}
