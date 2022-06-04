
public class C_multidimensional_array {
	public static void main(String[] args) {
		int array1[][] = {{1,2,3,4,5}, {6,7,8,9,10}};
		int array2[][] = {{10,20,30,40,50}, {60}, {70,80,90}};
		
		System.out.println(array1[0][1] + " " + array1[1][1]);
		System.out.println(array2[0][1] + " " + array2[1][0] + " " + array2[2][1]);
	}
}
