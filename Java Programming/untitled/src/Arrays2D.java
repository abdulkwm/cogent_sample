import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++){
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        for (int j = 0; j < 6; j++) {
            int arrItem = Integer.parseInt(arrRowTempItems[j]);
            arr[i][j] = arrItem;
        }
    }
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2;i++){
            for (int j = 0; j< arr.length - 2; j++){
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > max_sum){
                    max_sum = sum;
                }else {
                    sum = 0;
                }
            }
        }
        System.out.println(max_sum);
        bufferedReader.close();
    }
}
