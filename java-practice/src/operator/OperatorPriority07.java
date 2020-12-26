package operator;

public class OperatorPriority07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*operator priority
 * 1.()
 * 2. ++ -- !
 * 3./*%
 * 4.+-
 * 5.>  <  >=   <=
 * 6.==  !=  
 * 7.&& ||
 * 8.= += -= *= /= %=
 * */
		int a=2;
		int b=4;
		System.out.println(5+2*3>=7+a++);
		System.out.println((5+2>4)&&(8>3)||(3<2));
		System.out.println(((3+2)* --a -17 % 2 < 15) || (b !=a*3));
		
	}

}
