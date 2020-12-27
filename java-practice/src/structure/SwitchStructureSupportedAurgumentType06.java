package structure;

public class SwitchStructureSupportedAurgumentType06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Switch表达式支持字符，字符串，整数类型(小数，布尔不行)的表达式
 */
		//表达式为字符
		char sex='雌';
		switch(sex) {
		case '男':
			System.out.println(sex);
		    break;
		case '女':
			System.out.println(sex);
		    break;
		default:
			System.out.println(sex);
		    break;
		}
	
		
		//表达式为字符串
		String gender = "female";
		switch(gender) {
		case "male":
			System.out.println("男的");
			break;
		case "female":
			System.out.println("女的");
			break;
		default:
			System.out.println("其他");
		}
		//表达式为整型（文件05）
	}

}
