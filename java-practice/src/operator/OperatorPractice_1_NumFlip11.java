package operator;

/*
 * 将数字反转后输出，如将78352反转，输出25387
 * */

public class OperatorPractice_1_NumFlip11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=78352;
		int a = num % 10;
		int b = num / 10 % 10;
		int c = num / 100 % 10;
		int d = num / 1000 % 10;
		int e = num / 10000;
        System.out.println(""+a+b+c+d+e);
	}

}
