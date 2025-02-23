public class Main {
    public static void main(String[] args) {
        //Задание 1
        int downPayment = 0;
        int deposit = 15_000;
        int month = 0;
        while (downPayment < 2_459_000) {
            downPayment = downPayment + deposit + (deposit / 100);
            month = month + 1;
            {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + downPayment + "   рублей ");
            }
        }

        //Задание 2
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i = i + 1;
        }
        {
            System.out.print("\n");
        }

        for (int a = 10; a > 0; a = a - 1) {
            System.out.print(a + " ");
        }


        //Задание 3
        int popuLation = 12_000_000;
        int birthRate = 17;
        int morTality = 8;
        int year = 1;
        for (; year < 10; year++) {
            birthRate = 17 * popuLation / 1000;
            morTality = 8 * popuLation / 1000;
            popuLation = popuLation + birthRate - morTality;
            System.out.println("Год " + year + " , численность населения составляет " + popuLation);
        }

        //Задание 4
        int initialAmount = 15_000;
        int targetAmount = 12_000_000;
        int currentAmount = initialAmount;
        int months = 0;
        while (currentAmount < targetAmount) {
            currentAmount *= 1.07;
            months++;
            System.out.println(" Василию потребуется " + months + " месяцев: " + " чтобы накопить " + currentAmount + " рублей ");
        }

        //Задание 5
        int initialAmount1 = 15_000;
        int months1 = 0;
        while (initialAmount1 < 12_000_000) {
            initialAmount1 *= 1.07;
            months1++;
            if (months1 % 6 == 0) {
                System.out.println(" Василию потребуется " + months1 + " месяцев: " + " чтобы накопить " + initialAmount1 + " рублей ");
            }
        }

        // Задание 6
        int initialAmount2 = 15_000;
        int months2 = 0;
        int months3 = 12 * 9;
        while (months2 < months3) {
            initialAmount2 *= 1.07;
            months2++;
            if (months2 % 6 == 0) {
                System.out.println(" Василию потребуется " + months2 + " месяцев: " + " чтобы накопить " + initialAmount2 + " рублей ");
            }
        }

        // Задание 7
        int friday = 5;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчёт ");
        }

        // Задание 8
        int period = 79;
        int firstStart = 0;
        int currentYear = 2025;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year2 = firstStart; year2 < end; year2 += period) {
            if (year2 > start) {
                System.out.println(year2);
            }
        }

    }
}