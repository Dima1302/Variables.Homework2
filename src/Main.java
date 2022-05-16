public class Main {
    public static void main(String[] args) {
        // Задание 1
        int books = 9;
        byte pencils = 3;
        short notebooks = 4;
        long objectsOnTable = 100L;
        float pencilWeight = 3.6f;
        double booksWeight = 15.5;
        boolean isStudent = books > 3; // проверяем истинно ли условие, если книг больше 3, то это студент
        char plus = 43;

        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double boxersWeight = boxer1 + boxer2;
        System.out.println("Общий вес обоих боксеров " + boxersWeight + " кг");
        double weightDifference = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг");
        // Задание 3
        int banana = 5 * 80;
        int milk = 105 + 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int mixedAll = banana + milk + iceCream + eggs;
        System.out.println("Общий вес завтрака " + mixedAll + " грамм ");
        double weightInKg = mixedAll * 0.001;
        System.out.println("Общий вес завтрака " + weightInKg + " кг ");
        // Задание 4
        int weightNeedToLoose = 7;
        double convertInKg = 0.001;
        double condition1 = 250 * convertInKg;
        double condition2 = 500 * convertInKg;
        double daysCondition1 = weightNeedToLoose / condition1;
        System.out.println("Если каждый день терять по 250 грамм, то уйдет " + daysCondition1 + " дней");
        double daysCondition2 = weightNeedToLoose/ condition2;
        System.out.println("Если каждый день терять по 500 грамм, то уйдет " + daysCondition2 + " дней");
        double averageDays = (daysCondition1 + daysCondition2) / 2;
        System.out.println("Колличество дней в среднем для похудения " + averageDays);
        //Задание 5
        double masha = 67_760;
        double denis = 83_690;
        double kristina = 76_230;
        double promotion = 0.1;
        double mashaAfterPromotion = masha + (masha * promotion);
        double denisAfterPromotion = denis + (denis * promotion);
        double kristinaAfterPromotion = kristina + (kristina * promotion);

        double mashaCurrentYearSalary = masha * 12;
        double denisCurrentYearSalary = denis * 12;
        double kristinaCurrentYearSalary = kristina * 12;
        double mashaYearSalaryPromotion = mashaAfterPromotion * 12;
        double denisYearSalaryPromotion = denisAfterPromotion * 12;
        double kristinaYearSalaryPromotion = kristinaAfterPromotion * 12;

        double mashaDifference = mashaYearSalaryPromotion - mashaCurrentYearSalary;
        double denisDifference = denisYearSalaryPromotion - denisCurrentYearSalary;
        double kristinaDifference = kristinaYearSalaryPromotion - kristinaCurrentYearSalary;

        System.out.println("Маша теперь получает " + mashaAfterPromotion + " руб." + "Годовой доход вырос на " + mashaDifference);
        System.out.println("Денис теперь получает " + denisAfterPromotion + " руб." + "Годовой доход вырос на " + denisDifference);
        System.out.println("Кристина теперь получает " + kristinaAfterPromotion + " руб." +  "Годовой доход вырос на " + kristinaDifference);
    }
}
