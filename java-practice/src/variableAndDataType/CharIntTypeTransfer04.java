package variableAndDataType;

public class CharIntTypeTransfer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//auto transfer char to int, can?
		int x = 'x';//int and char are different type but can,
		//int is 4 byte, char is 2 byte.char is store in binary
		//code(number) in low level computer mechanism
		System.out.println(x);//it outputs ascii code of 'x'
		
//		//auto transfer int to char,can?cannot
//		int yint = 120;
//		char y = yint;
//		System.out.println(y); //int size 4 byte, char size 2 byte
		
		//force transfer int to char?can
		int zint = 120;
		char z = (char)zint;//要对整型变量zint进行强制转换然后才能赋值给char型变量z
		System.out.println(z);
		
		char o = 98;
		System.out.println(o);
		//整数和整型是不同的，98是整数，是数字，长度不是4个字节;int是整型
		//所以上面的char y=yint不行，因为yint是整型变量，是4个字节
		//存储长度大于char字符类型变量
		//下面这个o被输出为b
		
	}

}
