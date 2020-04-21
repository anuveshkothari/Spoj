package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ONP_TransformTheExpression {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			StringBuffer transformed_string = new StringBuffer("");

			// String str = br.readLine();
			char[] arr = br.readLine().toCharArray();

			Stack<Character> stack = new Stack();

			for (char pointer : arr) {
				if (pointer == '+' || pointer == '-' || pointer == '/' || pointer == '^' || pointer == '*') {
					stack.push(pointer);
				} else if (Character.isAlphabetic(pointer)) {
					transformed_string.append(pointer);
				} else if (pointer == ')') {
					transformed_string.append(stack.pop());
				}
			}
			System.out.println(transformed_string);
		}

	}

}
