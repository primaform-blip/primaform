import java.util.Scanner; //Импортируем класс Scanner

public class Main {

//    класс System  обеспечивает взаимодействие с консолью
//    объект out   осуществляет интерактивный вывод через консоль
//    метод println обеспечивающий вывод значения на консоль и перевод курсора консоли на другую строку.
//    метод print   Выводит текст на консоль без перевода строки.
//    метод printf("формат", аргументы) Используется для форматированного вывода
//     %d — для вывода в консоль целочисленных значений;
//     %x — для 16-ричных чисел;
//     %f — выводятся числа с плавающей точкой;
//     %e — для чисел в экспоненциальной форме (1.3e+01);
//     %c — вывод в консоль одиночного символа;
//     %s — вывод в консоль строковых значений.

//    System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height)


//    Для класса Scanner предусмотрены методы:
//      next() — для считывания введённой строки до первого пробела;
//  nextLine() — для всей введённой строки;
//   nextInt() — считывает введённое число int;
//   nextDouble() — для double;
//   nextBoolean() — для boolean;
//   nextByte() — для byte;
//   nextFloat() — для float;
//   nextShort() — для shor




    public static void main(String[] args) {


/*        Упражнение 1




        Scanner sc = new Scanner(System.in); //Создаем объект Scanner


        System.out.print("Введите первое число: ");

        int num1;
        num1 = sc.nextInt();
        System.out.print("Введите втрое число: ");
        int num2;
        num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.print("Два числа равны");
        } else if (num1 > num2) {
            System.out.print("Первое число больше второго");
        } else if (num1 < num2) {
            System.out.print("Первое число меньше второго");


//                System.out.println("Привет, " + name + "! Вам " + age + " лет.");
//        System.out.printf("Имя: %s  Возраст: %d  Вес: %.2f \n", name, age, height);
//        scanner.close(); // Закрываем сканер


       }
*/
      /*        Упражнение 2

        Scanner sc = new Scanner(System.in); //Создаем объект Scanner


        System.out.print("Введите число: ");

        int num1;
        num1 = sc.nextInt();


      if (num1 <= 9 & num1 > 5) {
            System.out.print("Число больше 5 и меньше 10");
        } else
       {
            System.out.print("Неизвестное число");

          }
  */

/*        Упражнение 3

        Scanner sc = new Scanner(System.in); //Создаем объект Scanner


        System.out.print("Введите сумму вклада: ");

        double num1;
        num1 = sc.nextDouble();

        if (num1 < 100) {
            num1 = num1 + num1 * 0.05;
            System.out.printf(" сумму вклада с начисленными процентами %.2f \n", num1);
        } else if (num1 > 200) {
            num1 = num1 + num1 * 0.1;
            System.out.printf(" сумму вклада с начисленными процентами %.2f \n", num1);
        } else if (num1 > 100 & num1 < 200) {
            num1 = num1 + num1 * 0.7;
            System.out.printf(" сумму вклада с начисленными процентами %.2f \n", num1);

        }


*/

/*               Упражнение 4





        Scanner sc = new Scanner(System.in); //Создаем объект Scanner


        System.out.print("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение: ");

        int num3;
        num3 = sc.nextInt();


        switch(num3)
        {
            case 1 :
                System.out.println("Сложение");

                break;
            case 2 :
                System.out.println("Вычитание");

                break;
            case 3 :
                System.out.println("Умножение");

            default :
                System.out.println("операция неопределена");
        }




/*

        Упражнение 5


        Scanner sc = new Scanner(System.in); //Создаем объект Scanner


        System.out.print("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение: ");

        int num3;
        num3 = sc.nextInt();

        System.out.print("Введите первое число: ");
        int num1;
        num1 = sc.nextInt();
        System.out.print("Введите втрое число: ");
        int num2;
        num2 = sc.nextInt();


        switch(num3)
        {
            case 1 :
                System.out.println("Сложение");
                num1=num1+num2;
                break;
            case 2 :
                System.out.println("Вычитание");
                num1=num1-num2;
                break;
            case 3 :
                System.out.println("Умножение");
                num1=num1*num2;
                break;
            default :
                System.out.println("операция неопределена");
        }
        System.out.println("Результат операции" + num1);

*/
/*        Вопрос 1
        int num1 = 10000000;
        int a=14;
        int b=8;
        for (int i = 1; i < 11; i++){

            num1= num1+1000*(a+1000)-1000*(b+1000);


        }

        System.out.println("численность населения будет через 10 лет" + num1);




               Вопрос 2
        int num1 = 10000000;
        int a=14;
        int b=8;
        for (int i = 1; i < 11; i++){

            num1= num1+1000*(a+1000)-1000*(b+1000);
            a=--a;
            b=--b;
            if (a == 7)
                break;
            if (b == 6)
                break;

        }

        System.out.println("численность населения будет через 10 лет" + num1);
        */

        Scanner sc = new Scanner(System.in); //Создаем объект Scanner


        System.out.print("Ввидите сумму вклада: ");

        float p = 0.07f;
        float sum;
        sum = sc.nextFloat();

        System.out.print("Ввидите срок вклада: ");
        int num1;
        num1 = sc.nextInt();


        for (int i = 1; i <=num1; i++) {

            sum = sum + sum*p;


        }
        System.out.println("Сумма вклада с учетом начисления процентов за каждый месяц составит :" + sum);
    }

}


