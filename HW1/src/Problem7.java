public class Problem7 {
    public static void main(String[] args) {
		int[] arr1 = {7,5,2004,5,326,8};
		int[] arr2 = {7,5,200,5,326,8};

		boolean length = false;
		if(arr1.length == arr2.length)
			length = true;

		boolean value = true;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i])
				value = false;

		}
		if(length && value)
			System.out.println("The two arrays are equal.");
		else
			System.out.println("The two arrays are not equal.");


		}
}
