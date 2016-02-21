import java.util.Stack;

public class ReversePolish {

	public static void main(String[] args) {
		String[] str = new String[]{"2","1","*","4","+"};
		System.out.println(evaluateRPN(str));
		
	}
	
	public static int evaluateRPN(String[] token){
		int answer = 0;
		String operators ="+*-/";
		
		Stack<String> stack = new Stack<String>();
		
		for(String s: token){
			if(!operators.contains(s)){
				stack.push(s);
			}
			else
			{
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				int index = operators.indexOf(s);
				switch(index){
				case 0:
					stack.push(String.valueOf(a+b));
					break;
				case 1:
					stack.push(String.valueOf(a*b));
					break;
				case 2:
					stack.push(String.valueOf(a-b));
					break;
				case 3:
					stack.push(String.valueOf(a/b));
					break;
				}
			}
		}
		answer = Integer.valueOf(stack.pop());
		return answer;
	}

}
