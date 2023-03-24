import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isPalindrome(str));
        scanner.close();
    }

    //check whether the number is palindrome or not
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() - 1; j > 0; j--) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public class BalanceChecker {
        public static List<Integer> isBalanced(String[] expressions, List<Integer> maxReplacements) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < expressions.length; i++) {
                String s = expressions[i];
                Stack<Character> stack = new Stack<>();
                int replacements = 0;
                for (char c : s.toCharArray()) {
                    if (c == '<') {
                        stack.push(c);
                    } else if (c == '>') {
                        if (!stack.isEmpty()) {
                            stack.pop();
                        } else if (replacements < maxReplacements.get(i)) {
                            replacements++;
                        } else {
                            result.set(i, 0);
                            break;
                        }
                    }
                }
                if (stack.isEmpty() || replacements < maxReplacements.get(i)) {
                    result.set(i, 1);
                } else {
                    result.set(i, 0);
                }
            }
            return result;
        }
    }
}

//        int i  = 0;
//        int j  = str.length()-1;
//        while (i < j){
//            if (str.charAt(i) != str.charAt(j))
//                return false;
//                i++;
//                j--;
//        }
//            return true;
//        }
