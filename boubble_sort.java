import java.util.*;

public class boubble_sort {
    public static void main(String[] args) {
        int i, j, size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of aray");
        size = sc.nextInt();
        int a[] = new int[size];
        for (int k = 0; k < a.length; k++) {
            System.out.println("Enter elements in arry: " + k);
            a[k] = sc.nextInt();
        }
        for (i = 0; i < size; i++) {
            for (j = 0; j < size - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < size; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }
}
