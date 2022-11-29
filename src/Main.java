public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int amountAuto = 33445678;
        System.out.println("Значение переменной a с типом int равно " + amountAuto);
        byte bananasWeight = 120;
        System.out.println("Значение переменной b с типом byte равно " + bananasWeight);
        short c = 12122;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 9568239129L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 135.45f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 23.4556577555;
        System.out.println("Значение переменной f с типом double равно " + f);

        System.out.println("Задача 2 (без вывода в консоль)");
        double a = 27.12;
        long b = 987678965549L;
        byte l = 2;
        short k = 786;
        boolean question = false;
        float w = 569f;
        int water = -159;
        short z = 27897;
        char y = 67;

        System.out.println("Задача 3");
        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short papers = 480;
        int resultPapers = papers / (firstTeacher + secondTeacher + thirdTeacher);
        System.out.println("На каждого ученика рассчитано " + resultPapers + " листов бумаги");

        System.out.println("Задача 4");
        int bottleOneMin = 16 / 2;
        int resultBottles;
        resultBottles = bottleOneMin * 20;
        System.out.println("За 20 минут машина произвела бутылок " + resultBottles + " штук");
        resultBottles = bottleOneMin * 1440;
        System.out.println("За сутки машина произвела бутылок " + resultBottles + " штук");
        resultBottles = bottleOneMin * 4320;
        System.out.println("За 3 дня машина произвела бутылок " + resultBottles + " штук");
        resultBottles = bottleOneMin * 43800;
        System.out.println("За месяц машина произвела бутылок " + resultBottles + " штук");

        System.out.println("Задача 5");
        short jars = 120;
        byte white = 2;
        byte brown = 4;
        int classes = jars / (white + brown);
        int whiteTotal = classes * white;
        int brownTotal = classes * brown;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteTotal + " банок белой краски и " + brownTotal + " банок коричневой краски");

        System.out.println("Задача 6");
        int bananas = 80 * 5;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int eggs = 70 * 4;
        float resultWeight = bananas + milk + iceCream + eggs;
        float resultWeightGrams = resultWeight / 1000;
        System.out.println(resultWeightGrams);

        System.out.println("Задача 7");
        int discardWeight = 7 * 1000;
        int daysFirst =  discardWeight / 250;
        int daysSecond = discardWeight / 500;
        int daysAverage = (daysFirst + daysSecond) / 2;
        System.out.println(daysFirst);
        System.out.println(daysSecond);
        System.out.println(daysAverage);

        System.out.println("Задача 8");
        int mashaBefore = 67760;
        int denisBefore = 83690;
        int kristinaBefore = 76230;
        float mashaAfter = mashaBefore * 1.1f;
        float denisAfter = denisBefore * 1.1f;
        float kristinaAfter = kristinaBefore * 1.1f;
        float mashaYear = (mashaAfter * 12) - (mashaBefore * 12);
        float denisYear = (denisAfter * 12) - (denisBefore * 12);
        float kristinaYear = (kristinaAfter * 12) - (kristinaBefore * 12);
        System.out.println("Маша теперь получает " + mashaAfter + " рублей. Годовой доход вырос на " + mashaYear + " рублей");
        System.out.println("Денис теперь получает " + denisAfter + " рублей. Годовой доход вырос на " + denisYear + " рублей");
        System.out.println("Кристина теперь получает " + kristinaAfter + " рублей. Годовой доход вырос на " + kristinaYear + " рублей");
    }
}