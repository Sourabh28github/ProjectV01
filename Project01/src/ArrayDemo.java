
public class ArrayDemo {
	
	
	
	
	public static void main(String[] args) {
		int a[]= {10,20,40,30,25,26,48,89};
		try {
		for(int i=7;i<=a.length;i--) {
			System.out.println(a[i]);
		}
	
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}

}
}