package operator;

public class Numeric01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		//二元运算符
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a*b);
		
		System.out.println();
		
		//一元运算符
		int c=3;
		c++;
		System.out.println(c);
		c--;
		System.out.println(c);
		++c;
		System.out.println(c);
		--c;
		System.out.println(c);
		//前缀自增自减和后缀自增自减的区别
        //前缀先自增自减再赋值，后缀先赋值再自增自减
		System.out.println();
		
		c = 3;
		int nowc;
		nowc = c++;
		System.out.println(c);
		System.out.println(nowc);
		nowc = ++c;
		System.out.println(c);
		System.out.println(nowc);
		nowc = c--;
		System.out.println(c);
		System.out.println(nowc);
		nowc = --c;
		System.out.println(c);
		System.out.println(nowc);

		
		System.out.println();
		
		
		int i = 3;
		int j = (i++) + (++i);
		// 1. (i++):(i++)=(i)=i=3
		// 2. i++:u(i)=i+1=4,i=4
		// 3. ++i:++i=u(i)=i+1=5,i=5
		// 4. (++i):(u(i))=(5)=5
		// 5. (i++)+(++i)=3+5=8
		// 6. j=8
		System.out.println(j);
		System.out.println(i);
		
		System.out.println();
		
		//字符串与数字相加，结果为拼接字符串
		System.out.println("hello"+33+55);//从左向右，相当于"hello33"+55
		System.out.println("hello"+(33+55));
	
		System.out.println();
		
		//数字拼接为数字字符串
		System.out.println(""+22+88);
	}

}
