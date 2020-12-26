package operator;
import java.util.Scanner;

public class OperatorPractice_2_GradeComparisonDifference11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("请输入tom的成绩：");
		int tom = input.nextInt();
		System.out.print("请输入jack的成绩：");
		int jack = input.nextInt();
		
		String result=(tom - jack > 0 ? "tom比jack高:" + (tom - jack)+"分":"jack比tom高："+(jack-tom)+"分");
		System.out.print(result);
	}

}
