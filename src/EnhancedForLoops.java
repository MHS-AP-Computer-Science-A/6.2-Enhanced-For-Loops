
public class EnhancedForLoops {
	public static void main(String[] args) {
		//Create an array with an initializer list
		int[] arr = {1, 2, 3, 4};
				
		//Print the array with a traditional for-loop
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		//Print the array with a for-each loop
		for(int item : arr){
			System.out.print(item + " ");
		}
		System.out.println();
		
		
		//Create an array by specifying the size
		//and fill an array by accessing indexes
		String[] words = new String[4];  
		words[0] = "Hello";
		words[1] = "Goodbye";
		words[2] = "Avocado";
		words[3] = "Taco";

		//Display words longer than 5 letters
		for(String w : words) {
			if(w.length() > 5) {
				System.out.println(w);
			}
		}
	}
		
}
