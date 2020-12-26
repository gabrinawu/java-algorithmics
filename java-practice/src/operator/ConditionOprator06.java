package operator;

public class ConditionOprator06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*条件？表达式1：表达式2  条件为TRUE，执行表达式1，条件为FALSE，执行表达式2*/
		int a=5;
		int b=9;
		System.out.println(a*2>b?"yes":"no");
		System.out.println(a*2<b?"yes":"no");
		int c=a>b?a:b;
		System.out.println(c);
	}

}
