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
        //Задание 6
        /* Объявите целочисленные переменные a = 12, b = 27, c = 44, d = 15, e = 9.
        Вычислите выражение a * (b + (c - d * e)) и присвойте его результат переменной result.
        Инвертируйте результат (значение в переменной result), преобразовав его в вариант с противоположным значением (отрицательное -> положительное, положительное -> отрицательное).
                Выведите (напечатайте) результат в консоль */
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result1 = a * (b + (c - d * e));
        System.out.println(result1);
        int result2 = Math.abs(result1);
        System.out.println("Преобразовали значение " + result1 + " в положительное " + result2 );
        int result3 = result2 * (-1);
        System.out.println("Преобразовали значение " + result2 + " в отрицательное " + result3);
        // Задание 7
        /* Объявите целочисленные переменные a = 5 и b = 7.
        С помощью математических манипуляций добейтесь того, чтобы a = 7 и b = 5.
        Использовать дополнительные переменные или числа запрещено */
        int first = 5;
        int second = 7;
        System.out.println("Значение до обмена = " + first + " и " + second);
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("Значение после обмена = " + first + " и " + second);
        // Задание 8
        /*Объявите переменную a и инициализируйте ее любым трехзначным числом.
Объявите переменную b и, путем математических операций над a получите и присвойте переменной b цифру, которая находится в центре значения из переменной a.
Например, если a = 256, то необходимо с помощью математических действий достать цифру 5 из центра и присвоить переменной b. Если a = 789, то b должна быть инициализирована числом 8, так как эта цифра является вторым из трех (центральным) символом в значении a.
Следует учесть, что алгоритм должен быть универсальным и корректно срабатывать на любых трехзначных числах из a без изменений.
Это значит, что рассчитать в голове сумму, которую необходимо вычесть или прибавить к a для корректного значения в b нельзя, так как при каждом изменении значения в a её нужно пересчитывать.
         */
        int x = 536;
        int y = x / 10 % 10;
        System.out.println(" Достали центральную цифру переменной = " + y);
    }
}