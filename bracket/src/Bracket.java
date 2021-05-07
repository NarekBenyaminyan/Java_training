import java.util.*;

public class Bracket {
 /*   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = scanner.nextLine();
        System.out.println(parsing(s));
    }
    public static boolean parsing(String str) {
        int check = 0;
        for (int i = 0; i < str.length(); i++) {
            String symbol = str.substring(i, i + 1);
            if (symbol.equals("(") || symbol.equals("{") || symbol.equals("[")) {
                check++;
                continue;
            }
            if (symbol.equals(")") || symbol.equals("}") || symbol.equals("]"))
                check--;
        }
        if (check == 0) {
            return true;
        } else {
            return false;
        }
    }*/
 public static void main(String[] args) throws Exception
 {
     Map<Character, Character> brackets = new Hashtable<>();
     brackets.put(']', '[');
     brackets.put('}', '{');
     brackets.put(')', '(');


     Scanner s = new Scanner(System.in);

     System.out.println("Enter a string");

     System.out.format("balanced:  ", isBalanced(s.nextLine(), brackets));
 }
    public static boolean isBalanced(String str, Map<Character, Character> brk)
    {
        Stack<Character> stk = new Stack<>();

        for (char c : str.toCharArray())
        {
            if (brk.containsValue(c))
            {
                stk.push(c);
            }
            else
            {
                if (brk.containsKey(c))
                {
                    if (stk.isEmpty() || !brk.get(c).equals(stk.pop()))
                    {
                        return false;
                    }
                }
            }
        }

        return stk.isEmpty();
    }

}