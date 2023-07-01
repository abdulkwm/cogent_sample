package list;

public class Demo {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,12,32};
        int num = 10;
        boolean flag = false;
        for (int i = 0; i < a.length; i++){
            if (num == a[i]){
                System.out.println("element found at index " + i);
                flag = true;
                break;
            }
        }
        if (flag == false){
            System.out.println("element is not found");
        }
    }
}