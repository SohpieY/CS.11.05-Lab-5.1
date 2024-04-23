public class ArrayUtility {

    public static void print(int[] array) {

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]+", ");
        }
        System.out.println();
    }

    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        double sum = sum(array);
        double length = array.length;
        double average = (double)1.0*sum/length;
        int avg2 = (int)(average * 100);
        return (double)avg2/100;
    }

    public static int minimum(int[] array) {
        int minValue = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }

        return minValue;
    }

    public static int maximum(int[] array) {
        int maxValue = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static void reverseTwo(int[] array) {
        int length = array.length;
        int mid = length / 2;

        for (int i = 0; i < mid; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }

    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i = 0; i < array.length; i++){
            int check = array[i];
            if(check == num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(int i = 0; i < array.length; i++){
            String check = array[i];
            if(check.equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i = 0; i < array.length; i++){
           array[i] = array[i] * 2;
        }

    }

    public static void multiplyByN(int[] array, int n) {
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] * n;
        }

    }

    public static String toString(int[] array) {
        String result = "";
        for(int i = 0; i < array.length; i++){
            if(i!=0){
                result += ", ";
            }
            result += array[i];
        }
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i]+array[j] == num && i!=j){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        if(array.length <= 1){
            return;
        }
        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;

    }

    public static void shiftLeft(int[] array) {
        if(array.length <= 1){
            return;
        }
        int firstElement = array[0];
        for(int i = 1; i<array.length; i++){
            array[i-1] = array[i];
        }
        array[array.length-1] = firstElement;

    }

    public static void shiftRightNTimes(int[] array, int n) {
        if (array.length <= 1 || n <= 0) {
            return; // No need to shift if the array has 0 or 1 element, or if n is non-positive
        }

        int shiftCount = n % array.length; // Calculate the effective shift count considering the array length

        for (int i = 0; i < shiftCount; i++) {
            int lastElement = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastElement;
        }

    }

    public static void shiftLeftNTimes(int[] array, int n) {
        if (array.length <= 1 || n <= 0) {
            return;
        }

        int shiftCount = n % array.length;
        for (int i = 0; i < shiftCount; i++) {
            int firstElement = array[0];
            for (int j = 1; j < array.length; j++) {
                array[j - 1] = array[j];
            }
            array[array.length - 1] = firstElement;
        }

    }


}
