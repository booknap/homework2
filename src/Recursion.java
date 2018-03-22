import java.util.ArrayList;
import java.util.List;

/**
 * Recursion test class.
 * 
 * @author Napasai Sutthichutipong
 *
 */
public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique
	 * the list will contain {a, b, c, b, c}. Only consecutive duplicates are
	 * removed. Objects are compared using their own equals method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<String> unique(List<String> list) {
		if (list.size() <= 1)
			return list;
		if (list.get(0).equals(list.get(1))) {
			list.remove(0);
			unique(list);
		} else {
			unique(list.subList(1, list.size()));
		}
		return list;
	}

	/**
	 * Calculate fibonacci number.
	 * 
	 * @param n
	 * @return helper
	 */
	public static long fibonacci(int n) {
		return helper(n, 0, 1);
	}

	/**
	 * Helper method to calculate fibonacci number.
	 * 
	 * @param count
	 * @param result
	 * @param sum
	 * @return fibonacci number
	 */
	public static long helper(int count, int result, int sum) {
		if (count <= 0)
			return result;
		return helper(count - 1, sum, sum + result);
	}

	/**
	 * Run the program.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(unique(list));
		System.out.println("Fibonacci number " + fibonacci(14));
	}

}
