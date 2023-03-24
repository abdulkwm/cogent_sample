public class ChkNum {
    int y;
    public ChkNum(){
        y = 11;

    }
    boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void main(String[] args) {
        ChkNum e = new ChkNum();
        if (e.isEven(11))
            System.out.println("number is even");
        else
            System.out.println("number is not even");
        ChkNum a = new ChkNum();
        System.out.println(a.y);
    }
}
