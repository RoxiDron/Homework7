public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int downPayment = 0;
        int deposit = 15_000;
        int month = 0;
        while (downPayment < 2_459_000) {
            downPayment = downPayment + deposit + (deposit / 100);
            month = month + 1;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + downPayment + "   рублей ");

        }

        System.out.println("Task 2");

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


        System.out.println("Task 3");

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

        System.out.println("Task 4");

        int initialAmount = 15_000;
        int targetAmount = 12_000_000;
        int currentAmount = initialAmount;
        int months = 0;
        while (currentAmount < targetAmount) {
            currentAmount *= 1.07;
            months++;
            System.out.println(" Василию потребуется " + months + " месяцев: " + " чтобы накопить " + currentAmount + " рублей ");
        }

        System.out.println("Task 5");

        int initialAmountOfMoney = 15_000;
        int MonthInARow = 0;
        while (initialAmountOfMoney < 12_000_000) {
            initialAmountOfMoney *= 1.07;
            MonthInARow++;
            if (MonthInARow % 6 == 0) {
                System.out.println(" Василию потребуется " + MonthInARow + " месяцев: " + " чтобы накопить " + initialAmountOfMoney + " рублей ");
            }
        }

        System.out.println("Task 6");

        int initialAmountOf = 15_000;
        int monthSix = 0;
        int monthsSix = 12 * 9;
        while (monthSix < monthsSix) {
            initialAmountOf *= 1.07;
            monthSix++;
            if (monthSix % 6 == 0) {
                System.out.println(" Василию потребуется " + monthSix + " месяцев: " + " чтобы накопить " + initialAmountOf + " рублей ");
            }
        }

        System.out.println("Task 7");

        int friday = 5;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчёт ");
        }

        System.out.println("Task 8");

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