
public class B_arrays_in_method {
	public static void main(String[]args) {
		int array1[] = {3,4,5,6,7};
		change(array1);
		
		for (int y:array1) {
			System.out.println(y);
		}	
	}
	
	public static void change(int x[]) {
		for (int counter=0; counter < x.length; counter++) {
			x[counter] += 5;
		}
	}
}
