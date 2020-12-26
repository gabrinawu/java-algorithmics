package operator;

public class Binary09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*unsigned binary:只能存储正数
     * signed binary:能储存整数和负数，最高位为符号位，0表示正数，1表示负数
     *     decimal 5 is binary 101 , in memory 4 byte 00000000 00000000 00000000 00000101
     *     decimal -5 in memory 10000000 00000000 00000000 00000101
     *     
     *二进制的原码，补码，反码
     *   原码：原始的二进制的值
     *   反码：正负数不一样
     *       正数的反码和原码是相同的，如5的反码是00000000 00000000 00000000 00000101
     *       负数的反码是 符号位不变，其余各位取反，如-5的反码 1 1111111 11111111 11111111 11111010
     *   补码：正负数不一样
     *       正数的反码和原码是相同的，如5的补码是00000000 00000000 00000000 00000101
     *       负数的补码是 它的反码+1，如-5的补码是1 1111111 11111111 11111111 11111010 + 1 =
     *                                      1 1111111 11111111 11111111 11111011
     *   计算机内部是使用补码来存储和表示值的
     *       
     */
		System.out.println(0b11111111111111111111111111111011);//-5的补码 
		System.out.println(0b00000000000000000000000000000101);//5的补码
		System.out.println(0b101);//5省略0，正常输出
	}

}
