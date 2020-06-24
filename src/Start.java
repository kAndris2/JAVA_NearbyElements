import java.util.ArrayList;

public class Start {
    public static void main (String[] args) {

        for (Integer num : nearby(0,2,2)) {
            System.out.println(num);
        }
    }

    public static int[] nearby(int x, int y, int range) {
        int[][] multi = new int[][]{
                { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
                { 1, 3, 5, 7 },
                { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
        };

        int[] result = new int[0];

        for (int i = 1; i <= range; i++) {
            try {
                result = addX(result.length, result, multi[x][y - i]);
            } catch (ArrayIndexOutOfBoundsException e){ }
            try {
                result = addX(result.length, result, multi[x][y + i]);
            } catch (ArrayIndexOutOfBoundsException e){ }
        }
        return result;
    }

    public static int[] addX(int n, int arr[], int x)
    {
        int i;

        int newarr[] = new int[n + 1];

        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }
}
