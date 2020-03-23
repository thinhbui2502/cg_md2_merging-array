import java.util.Scanner;

public class MergingArray {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        int[] array3 = new int[array1.length + array2.length];
//Tạo phần tử cho array1 và array2
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter elements for array1: ");
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter elements for array2: ");
            array2[i] = sc.nextInt();
        }
//Lấy phần tử của array1 để gán vào array3
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0, j = array1.length; i < array2.length; i++, j++) {
            array3[j] = array2[i];
        }
//In phần tử của mảng array3
        System.out.print("The elements in array3: ");
        for (int value : array3) {
            System.out.print(value + "\t");
        }
    }
}
