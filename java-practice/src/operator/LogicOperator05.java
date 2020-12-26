package operator;

public class LogicOperator05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=true, b=false;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!b);
        System.out.println(5>2 && 8<=6);
        System.out.println(16>(4+2)*3);
		System.out.println(!(5>8));
		System.out.println(a&&b);
		/*逻辑运算是一种短路运算
		 * 对于&& ，如果左边是false，则不再需要执行右边
		 * 对于||,如果左边是TRUE,则不再需要执行右边
		 * */
		System.out.println(false && 5/0>3);//右边并未执行，所以不报错
		System.out.println(true && 5/0>3);//右边并未执行，所以不报错
	}

}
