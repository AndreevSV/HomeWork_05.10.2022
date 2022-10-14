

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task2_1();
        task2_2();
        task2_3();
        task2_4();
        task3_1();
        task3_2();
    }

    public static void task1() {
        double accumulation = 15000;
        double total = 15000;
        int month = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = accumulation + total;
            month++;

        } System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
    }


    public static void task2() {
        int i = 0;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        float population = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            float birthIncrease = population * 17 / 1000;
            float deathDecrease = population * 8 / 1000;
            population = population + birthIncrease - deathDecrease;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task2_1() {
        double accumulation = 15_000;
        double percentage =  7.0 / 100;
        int i = 0;
        while (accumulation < 12_000_000) {
            i++;
            accumulation = accumulation + accumulation * percentage;

            System.out.println("Через " + i + " месяцев сумма вклада составит " + accumulation + " рублей");
        }

    }

    public static void task2_2() {
        double accumulation = 15_000;
        double percentage = 7.0 / 100;
        int i = 0;
        while (accumulation < 12_000_000) {
            i++;
            accumulation = accumulation + accumulation * percentage;
            if (i % 6 == 0) {
                System.out.println("Через " + i + " месяцев сумма вклада составит " + accumulation + " рублей");
            }
        }

    }

    public static void task2_3() {
        double accumulation = 15_000;
        double percentage =  7.0 / 100;
        int i = 0;
        while (i  < 9 * 12) {
            i++;
            accumulation = accumulation + accumulation * percentage;
            if (i % 6 == 0) {
                System.out.println("Через " + i + " месяцев сумма вклада составит " + accumulation + " рублей");
            }
        }

    }

    public static void task2_4() {

        for (int friday = 7; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
            }
    }

    public static void task3_1() {
        int date = 0;
        int startDate = 2022 - 200; // Начало наблюдения
        int endDate = 2022 + 100; // Конец наблюдения
        for (; date <= endDate; date +=  79) {
            if (date > startDate) {
                System.out.println(date);
            }
        }
    }

    public static void task3_2() {
        for (int number = 1; number <= 10; number +=1) {
            int multiplication = 2;
            System.out.println(multiplication + " * " + number + " = " + multiplication * number);
            }
        }

}