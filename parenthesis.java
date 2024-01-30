import java.util.*;

public class parenthesis{
    public static void main(String[] args){
        String s;
        String result;
        Scanner sc = new Scanner(System.in);
        s= sc.nextLine();
        boolean isbalanced = true;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack.push(s.charAt(i));
            else if(s.charAt(i) == ')' ){
                if(!stack.empty() && stack.peek() == '('){
                    stack.pop();
                }
                else {
                    isbalanced =false;
                    break;
                }
            }else if(s.charAt(i) == '[' ){
                if(!stack.empty() && stack.peek() == '['){
                    stack.pop();
                }
                else {
                    isbalanced =false;
                    break;
                }
            }else if(s.charAt(i) == '}' ){
                if(!stack.empty() && stack.peek() == '{'){
                    stack.pop();
                }
                else {
                    isbalanced =false;
                    break;
                }
            }

        }
        result =isbalanced? "It is balanced": "It is not balanced";
        System.out.println(result);
    }

}

