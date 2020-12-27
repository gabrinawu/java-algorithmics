package structure;

public class NestIfStructure04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int today=7;
		String weather="晴天";
		if(today>=6) {
			if(weather=="晴天") {
				System.out.println("今天休息，去户外玩。");
			}else {
			System.out.println("今天休息，去室内游乐场玩");
		   }
		}
		else {
				System.out.print("今天不是工作日。");
			}
	}

}
