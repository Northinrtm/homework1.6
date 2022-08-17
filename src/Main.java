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
        for (int spending : generateRandomArray()) {
            sumSpending += spending;
        }
        System.out.println(sumSpending + "рублей.");
        System.out.println("\n Задание 2:");
        int minSpending = 200_000;
        int maxSpending = 0;
        for (int spending : generateRandomArray()) {
            if (minSpending > spending) {
                minSpending = spending;
            }
            if (maxSpending < spending) {
                maxSpending = spending;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +
                +minSpending + " рублей. Максимальная сумма трат за день составила" +
                +maxSpending + " рублей");
        System.out.println("\n Задание 3:");
        System.out.println("Средняя сумма трат за месяц составила " +
                +(double) sumSpending / 30.0 + " рублей.");
        System.out.println("\n Задание 4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int a = reverseFullName.length - 1; a >= 0; a--) {
            System.out.print(reverseFullName[a]);
        }
    }
}