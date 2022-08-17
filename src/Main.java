public class Main {
    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        System.out.print("Сумма трат за месяц составила ");
        int sumSpending = 0;
        for (int spending: generateRandomArray() ) {
            sumSpending += spending;
        }
        
    }
}