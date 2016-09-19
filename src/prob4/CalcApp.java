package prob4;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// Scanner 와 String 클래스의 split 함수를 사용합니다.
		// left_value, Right_value 연산자를 " "로 분류
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print(">>");
			String expression = sc.nextLine();

			if ("quit".equals(expression) == true) {
				break;
			}
			String[] tokens = expression.split(" ");
			int l_value = Integer.parseInt(tokens[0]);
			String operator = tokens[1];
			int r_value = Integer.parseInt(tokens[2]);

			// System.out.println(l_value);
			// System.out.println(operator);
			// System.out.println(r_value);

			if (operator.charAt(0) == '+') {
				new Add(l_value, operator, r_value);
			} else if (operator.charAt(0) == '-') {
				new Sub(l_value, operator, r_value);
			} else if (operator.charAt(0) == '*') {
				new Mul(l_value, operator, r_value);
			} else if (operator.charAt(0) == '/') {
				new Div(l_value, operator, r_value);
			}

		}
		sc.close();
	}
}
