package basic;

public class NumberType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num1 = 5;
		short num2 = 26;
		int num3 = 12;
		long num4 = 666l;//666类型转换发生，666L也表示long类型
		System.out.println(num4);
		
		float weight = 100.5f;//100.5默认是DOUBLE，会报错
		double height = 188;//188f发生类型转换
		System.out.println(height);
		
		char sex = '男';
		System.out.println(sex);
		
		boolean isOK = true;
		System.out.println(isOK);
		
		String name="拉斐尔";
		System.out.println(name);
	}

}
