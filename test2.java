public class test2 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 1, 0, 0 };
        System.out.println(test(arr));
    }

    public static boolean test(int[] arr) {
        if (arr.length % 2 != 0)
            return false;
        int start = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == start)
                count++;
            else
                break;
        }
        return start == 1 ? testFunc(arr, count, 1, 0) : testFunc(arr, count, 0, 1);
    }

    private static boolean testFunc(int[] arr, int count, int j, int i) {
        int k = 0;
        while (k < arr.length) {
            for (int z = 0; z < count; z++, k++) {
                if (k == arr.length || arr[k] != j)
                    return false;
            }
            if (k == arr.length)
                return false;
            for (int chutiyap = 0; chutiyap < count; chutiyap++, k++) {
                if (k == arr.length || arr[k] != i)
                    return false;
            }
        }
        return true;
    }
}
