
public class Demo {
	private int getTable (int num) {
		int number=num;
		for(int i=1;i<=10;i++) {
			int table=number*i;
			System.out.println(table);
		}
		return number;
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.getTable(8);
	}

}
