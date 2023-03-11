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
            System.out.println(sum);
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxSum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
                System.out.println("Максимальная сумма трат за день составила " + maxSum);
            }
        }
        for (int i = arr.length; i > 0; i--) {
                System.out.println("Минимальная сумма трат за день составила " + maxSum);

            }
        }
        public static void task3(){
            System.out.println("Задача 3");
            int[] arr = generateRandomArray();
            int sum = 0;
            for (int index = 0; index < arr.length; index++) {
                sum = sum + arr[index];
                sum = sum / 30;
                System.out.println(sum);
            }

        }
        public static void task4(){
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            int i = 0;
            reverseFullName[0] = 11;
            reverseFullName[1] = 10;
            reverseFullName[2] = 9;
            reverseFullName[3] = 8;
            reverseFullName[4] = 7;
            reverseFullName[5] = 6;
            reverseFullName[6] = 5;
            reverseFullName[7] = 4;
            reverseFullName[8] = 3;
            reverseFullName[9] = 2;
            reverseFullName[10] = 1;
            for (i = 0; i < reverseFullName.length -1; i++) {
                System.out.print(reverseFullName[i]);
            }
            System.out.print(reverseFullName[i]);
        }
    }
