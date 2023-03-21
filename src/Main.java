public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        System.out.println(sum);

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[1];
            if (val > maxSum) {
                maxSum = val;
            }
        }
            System.out.println("Максимальная сумма трат за день составила " + maxSum);

        int minSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val < minSum) {
                minSum = val;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum);

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        sum = sum / arr.length;
        System.out.println(sum);

        }
        public static void task4(){
            char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            int i = 0;
            for (i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }

    }

