import java.util.Stack;

public class evaluatePostFix {

	public static void main(String[] args) {
		
		String str = "24+46+*";
		System.out.println(evaluate(str));
	}
	
	public static int evaluate(String str) {
		Stack<Integer> s = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				s.push(str.charAt(i)-48);
			}
			else if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '/' || str.charAt(i) == '*') {
				int val1 = s.pop();
				int val2 = s.pop();
				if(str.charAt(i) == '+') {
					s.push(val2+val1);
				}
				else if(str.charAt(i) == '-') {
					s.push(val2-val1);
				}
				else if(str.charAt(i) == '/') {
					s.push((val2/val1));
				}
				else if(str.charAt(i) == '*') {
					s.push(val2*val1);
				}
			}
		}
		
		return s.pop();
		
	}

}
