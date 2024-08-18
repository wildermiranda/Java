import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        byte age;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        name = sc.next();

        System.out.print("Digite sua idade: ");
        age = sc.nextByte();

        System.out.println();

        System.out.println("Seu nome é " + name + " e você tem " + age + " anos de idade! 📮");

        sc.close(); */




        /*
        int idade = 25;
        String nome = "John";
        double salario = 1_600.45;
        System.out.printf("Nome: %s%nIdade: %d%nSalário: %f%n📮 %n", nome, idade, salario); */




        /*
        String ayrton = "O medo me fascina.";
        System.out.printf("%S%n", ayrton); */




        /*
        System.out.printf("%b%n", null);
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 5.3);
        System.out.printf("%b%n", "random text"); */




        /*
        // Define o local padrão como Estados Unidos (formatação de números e datas).
        // Locale.setDefault(Locale.US);

        double pi = 3.14159265358979323846;

        System.out.println(pi);
        System.out.printf("%f%n", pi);

        // Define o número de casas decimais. %n representa uma nova linha.
        System.out.printf("%.2f%n", pi);
        System.out.printf("%.4f%n", pi); */




        /*
        Date date = new Date();

        System.out.printf("%tT%n", date);
        System.out.printf("%tH hours, %tM minutes e %tS seconds%n", date, date, date);
        System.out.printf("%1$tA, %1$tB %1$tY%n", date);
        System.out.printf("%1$tB %1$td, %1$tY%n", date); */




        /*
        String product1 = "Computer";
        String product2 = "Office Desk";
        double price1 = 2_100.0;
        double price2 = 650.50;

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double measure = 53.234567;


        System.out.printf("Products:%n%s, which price is $%.2f%n%s, which price is $%.2f%n", product1, price1, product2, price2);

        System.out.println("-");

        System.out.printf("Record: %d years old, code: %d and gender: %s%n", age, code, gender);

        System.out.println("-");

        System.out.printf("Measue with eight decimal places: %.8f%nRouded (three decimal places): %.3f%n", measure, measure); */








        // AREA OF A TRAPEZOID.

        /*
        double height, shortBase, longBase, area;

        height = 5;
        shortBase = 6;
        longBase = 8;

        area = (shortBase + longBase) / 2.0 * height;

        System.out.println(area); */




        // Casting

        /*
        int w, y;
        double result;

        w = 5;
        y = 2;

        result = (double) w / y;

        System.out.println(result); */


        /*
        double w;
        int y;

        w = 5.0;
        y = (int) w;

        System.out.println(y); */








        // Scanner

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = sc.nextLine(); // 'Josep'

        System.out.print("Digite sua idade: ");
        byte age = sc.nextByte(); // 53

        System.out.print("Digite sua altura (em metros): ");
        double height = sc.nextDouble(); // 1.80

        System.out.print("|    Nome           |");
        System.out.print("    Idade    |");
        System.out.println("    Altura    |");
        System.out.print("|-------------------|");
        System.out.print("-------------|");
        System.out.println("--------------|");
        System.out.print("| " + name + "             |");
        System.out.print(" " + age + "          |");
        System.out.println(" " + height + "          |");

        sc.close(); // Boa prática para evitar vazamento de recursos.
    }
}
