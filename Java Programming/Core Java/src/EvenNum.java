public class EvenNum {
    public static void main(String[] args) {
//        String input = args[0];
//        System.out.println("the length of the string is : " + input.length());
//        System.out.println(args[0] + " to upper case is : " + input.toUpperCase());
//        boolean isPalindrome = true;
//        int i = 0;
//        int j = input.length() - 1;
//        while (i < j){
//            if (input.charAt(i) != input.charAt(j)){
//                isPalindrome = false;
//                break;
//            }
//            i++;
//            j--;
//        }
//        if (isPalindrome){
//            System.out.println("the input is palindrome.");
//        }else {
//            System.out.println("the input is not a palindrome.");
//        }


        // String Builder forms

        String input = args[0];
        System.out.println("the length of the String is : " + input.length());

        StringBuilder sb = new StringBuilder(input.toUpperCase());
        System.out.println(input + "to upper case is : " + sb);

        sb.reverse();
        String reverseStr = sb.toString();
        boolean isPalindrome = input.equalsIgnoreCase(reverseStr);
        if (isPalindrome){
            System.out.println("the input is palindrome");
        }else {
            System.out.println("the string is not a palindrome");
        }
    }
}
