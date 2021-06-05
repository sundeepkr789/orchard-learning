package lambda.expressions;

interface Sayable {
	public String say();
}

public class LambdaExpressionExample3 {
	public static void main(String[] args) {
		Sayable s = () -> {
			return "Today is good day.";
		};
		System.out.println(s.say());
	}
}