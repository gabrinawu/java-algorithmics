package operator;

public class BitOperator10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /* binary calculation, other number system shall be convert to binary then join the bit calculation
       * &按位与 
       * |按位或
       * ~按位非
       * ^按位异或
       * >>右移
       * <<左移
       * >>>无符号右移
       * */
	   int a=5;//00000000 00000000 00000000 00000101
	   int b=8;//00000000 00000000 00000000 00001000
	   
	   //与：两位皆为1，则为1，否则为0
	   System.out.println(a&b);//结果为00000000 00000000 00000000 00000000
	   //或：只要有一个1，则为1，否则为0
	   System.out.println(a|b);//结果为00000000 00000000 00000000 00001101
	   //非：如果为1，则为0；如果为0，则为1 
	   System.out.println(~a);//结果为 11111111 11111111 11111111 11111010 *非直接现实 转为补码显示
	   //异或：相同则为0，否则为1
	   System.out.println(a^b); //00000000 00000000 00000000 00001101
	   //左移：将二进制的所有位都向左移指定的位数，移出位不管，末尾补0
	   System.out.println(a<<2);//00000000 00000000 00000000 00010100
	   //右移：将二进制的所有位都向右移指定的位数，移出位不管，开头补符号位
	   System.out.println(a>>2);//00000000 00000000 00000000 00000001
	   //无符号右移：将二进制所有位都向右移指定位数，开头补0
	   
	}

}
