package variableAndDataType;

public class TypeTransfer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//自动类型转换
		int a=3;
		long b=a;
		double c=a;
		double d=a+2.5;
		System.out.println(c);
		System.out.println(d);
		//强制类型转换
		double e=12.6; //double 8 bytes, int 4 bytes
		int f=(int)e;//int f=e cannot do, cause size e is larger than size f
		System.out.println(f);//loss of precision
		System.out.println(e);
		
		String g="welcome";
		//int h = (int)g; cannot do,cause it is not the same type
		

	}

}