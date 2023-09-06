import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 8, 22, 16, 6, 13, 11, 5, 4, 32, 3, 7};
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void bubbleSort(int[] list){
        boolean inOrder = false;
        while (!inOrder){
            inOrder = true;
            for (int i = 0; i < list.length-1; i++) {
                if (list[i]>list[i+1]){
                    int t = list[i];
                    list[i] = list[i+1];
                    list[i+1] = t;
                    inOrder = false;
                }
            }
        }
    }
}
