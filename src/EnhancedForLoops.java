
public class EnhancedForLoops {
	public static void main(String[] args) {
		// Create an array with an initializer list
		int[] arr = { 1, 2, 3, 4 };

		// Print the array with a for-each loop
		for (int item : arr) {
			System.out.print(item + " ");
		}
		System.out.println();

		// Create an array with an initializer list
		String[] words = { "cat", "sat", "splat" };

		// Print the words that start with s
		for (String s : words) {
			if (s.charAt(0) == 's') {
				System.out.print(s + " ");
			}
		}

		System.out.println();

		Point[] points = { new Point(1, 2), new Point(3, 4), new Point(4, 5) };

		// Display words longer than 5 letters
		for (Point p : points) {
			p.x++;
			p = new Point(0, 0);
		}

		for (Point p : points) {
			System.out.println("(" + p.x + ", " + p.y + ")");
		}
	}

}
