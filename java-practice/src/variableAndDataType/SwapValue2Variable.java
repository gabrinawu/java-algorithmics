package variableAndDataType;

public class SwapValue2Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a = 3;
         int b = 8;
         //通过第三方变量交换
//         int temp;
//         temp = a;
//         a = b;
//         b = temp;
//         System.out.println("a,b:"+a+","+b);
           
         //不通过第三方变量交换
         a = a + b;//11
         b = a - b;//3
         a = a - b;//8
         System.out.println("a,b:"+a+","+b);
        
         
	}

}
