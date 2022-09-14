public class Main {
    public static void main(String[] args) {

        int [] payments = new int[30] ;

        payments [0] = 150_000;
        payments [1] = 150_500;
        payments [2] = 120_050;
        payments [3] = 160_800;
        payments [4] = 170_600;
        payments [5] = 120_050;
        payments [6] = 130_500;
        payments [7] = 151_500;
        payments [8] = 168_800;
        payments [9] = 146_700;
        payments [10] = 129_400;
        payments [11] = 146_200;
        payments [12] = 171_500;
        payments [13] = 175_300;
        payments [14] = 154_200;
        payments [15] = 176_820;
        payments [16] = 148_200;
        payments [17] = 127_570;
        payments [18] = 141_400;
        payments [19] = 176_400;
        payments [20] = 151_990;
        payments [21] = 190_900;
        payments [22] = 180_200;
        payments [23] = 146_500;
        payments [24] = 129_500;
        payments [25] = 145_300;
        payments [26] = 172_000;
        payments [27] = 128_500;
        payments [28] = 110_500;
        payments [29] = 172_500;


        //Задание-1.
        System.out.println("Задание-1.");

        int sum = 0;

        for (int payment : payments) {
            sum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Задание-2.
        System.out.println("Задание-2.");

        int maxPayments = -1;
        int minPayments = 1_000_000;

        for (int i = 0; i < payments.length; i++) {
            if (payments[i] < minPayments) {
                minPayments = payments[i];
            }
        }
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > maxPayments) {
                maxPayments = payments[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayments + " рублей. Максимальная сумма трат за день составила " + maxPayments + " рублей.");

        //Задание-3.
        System.out.println("Задание-3.");

        float midlPayments = 0f;

        for (int i : payments) {
            midlPayments += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + midlPayments/payments.length + " рублей");

        //Задание-4.
        System.out.println("Задание-4.");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}