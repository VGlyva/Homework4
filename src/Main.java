public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age +", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 7;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
        if (temperature >=5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 60;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + " ,то ему пора спать");
        }
        else if (age >=2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад");
        }
        else if (age >=7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
        }
        else if (age >18 && age <24) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в университет");
        }
        else if (age >24 && age <=60) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        else if (age >60) {
            System.out.println("Если возраст человека равен " + age + ", то ему можно отдохнуть");
        }
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5");
        int childAge = 4;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на атракционе");
        }
        else if (childAge >=5 && childAge <14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься в сопровождении взрослого");
        }

        else if (childAge >=14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься без сопровождения взрослого");
        }
        System.out.println();
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int placeInTheCar = 60;
        if (placeInTheCar <= 60) {
            System.out.println("Если у вас " + placeInTheCar + " место, вы можете ехать сидя");
        }
        else if (placeInTheCar >60 && placeInTheCar <=102) {
            System.out.println("Если у вас " + placeInTheCar + " место, все занято, вы можете ехать стоя");
        }
        else if (placeInTheCar >102) {
            System.out.println("Если у вас " + placeInTheCar + " место, вагон уже полностью забит");
        }
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 85;
        int two = 85;
        int three = 84;
        if (one >= two && one >= three) {
            System.out.println(one);
        }
        else if (two >= three) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
    }
}