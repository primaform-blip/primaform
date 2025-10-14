import java.util.Scanner; //Импортируем класс Scanner
public class Main {


    public static void main(String[] args) {


        //       System.out.println ("Hello word!");
        //       System.out.println ("Hello tehnograd!");


        Scanner scanner = new Scanner(System.in); //Создаем объект Scanner

//        scanner.nextLine(); // Читаем строку
//        scanner.nextInt(); // Читаем целое число

        System.out.print("Как Вас зовут: ");

//      String name = scanner.nextLine(); // Читаем строку

        String name;
        name = scanner.nextLine();

        System.out.print("Сколько Вам лет: ");

        int age;
        age = scanner.nextInt();

        System.out.println("Привет, " + name + "! Вам " + age + " лет.");

        scanner.close(); // Закрываем сканер


    }
}


