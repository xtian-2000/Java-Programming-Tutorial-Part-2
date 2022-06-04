
public class D_table_for_multiarrays {
	public static void main(String[]args) {
		int array1[][] = {{1,2,3,4,5}, {6,7,8,9,10}};
		int array2[][] = {{10,20,30,40,50}, {60}, {70,80,90}};
		
		System.out.println("This are the elements of the first array: ");
		display(array1);
		System.out.println("This are the elements of the second array: ");
		display(array2);
	}
	public static void display(int x[][]) {
		for (int row=0;row<x.length;row++) {
			for(int column=0;column < x[row].length;column++) {
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}
}
