package operator;

import java.util.Scanner;

public class SumAndMean02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int int1 = 97;
        int int2 = 2;
        int int3 = int1/int2;
        System.out.println(int3);
        double double1 = int1/int2;//right side of = is calculated first and it is int 48
        //(accurately shall be 48.5,however it is integer divide /)
        //integer 48 is assigned to double, it is auto transfered from int to double cause 4<8
        System.out.println(double1);//so double1 is 48.0
        double double2 = 97.0;
  //      int3 = double2/int2; cannot transfer double to int,cause double 8 byte,int 4 byte
        double1 = double2/int2;//double2/int2 is calculated first and it is double/int so the result is double
        //right side is 48.5 and it is assigned to leftside, it is a double, so match
        //alternatively, if it is int/double, the result it is also a double
        System.out.println(double1);
        
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        System.out.print("input java grade:");
        int java = input.nextInt();
        System.out.print("input oracle grade:");
        int oracle = input.nextInt();
        System.out.print("input html grade:");
        int html = input.nextInt();
        
        double sum = java + oracle + html;//auto convert rightside result(a int) to double
        double average = sum/3; //double/int get a double
        
        System.out.println("Java\t\tOracle\t\tHtml");
        System.out.println(java+"\t\t"+oracle+"\t\t"+html);
        
        System.out.println("sum is:"+sum);
        System.out.println("average is:"+average);
	}

}
