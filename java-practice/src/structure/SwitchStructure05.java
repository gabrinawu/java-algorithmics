package structure;

public class SwitchStructure05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int today = 3;
		switch(today) {
		case 1:
			System.out.println("今天吃包子");
	//		break;//break结束switch
		case 2:
			System.out.println("今天吃油条");
		case 3:
		case 4:
			System.out.println("今天吃馄饨");		
		case 5:
			System.out.println("今天吃饺子");
			break;//没有break;一旦匹配会不再判断case，一直向下执行（case里面的语句），直到遇到第一个break;
		default:
			System.out.println("默认的。");
	        //default不需要break;
		}
		
		System.out.println("switch之后的代码");
	}
}
