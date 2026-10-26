import java.util.Arrays;
public class a {
    public static void main(String[] args) {
        String[] arr = new String[] {          // ["aaa", "bbb", "ccc", "ddd"]
                "aaa", "bbb", "ccc", "ddd"
        };
        arr[0] = "www";
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}