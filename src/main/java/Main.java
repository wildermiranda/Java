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

        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = sc.nextLine(); // 'Josep Guardiola Sala'

        System.out.print("Digite sua idade: ");
        byte age = sc.nextByte(); // 53

        System.out.print("Digite sua altura (em metros): ");
        double height = sc.nextDouble(); // 1.80

        System.out.print("|    Nome              |");
            //            'Josep Guardiola Sala'
        System.out.print("    Idade    |");
        System.out.println("    Altura    |");
        System.out.print("|----------------------|");
        System.out.print("-------------|");
        System.out.println("--------------|");
        System.out.print("| " + name + " |");
        System.out.print(" " + age + "          |");
        System.out.println(" " + height + "          |");

        sc.close(); // Boa prática para evitar vazamento de recursos. */








        /*
        Scanner sc = new Scanner(System.in);

        char w;

        System.out.print("Enter a character: ");
        w = sc.next().charAt(0);

        System.out.println("-");

        System.out.println("Character: " + w);

        sc.close();*/




        /*
        Scanner sc = new Scanner(System.in);

        String product;
        int code;
        double price;

        // System.out.print("Digite o nome do produto: ");
        product = sc.next(); // Lâmpada

        // System.out.print("Digite o código do pruduto: ");
        code = sc.nextInt(); // 4589

        // System.out.print("Digite o preço do produto: ");
        price = sc.nextDouble(); // 25.00

        System.out.println("-");

        System.out.printf("%s | %d | %f%n", product, code, price);

        sc.close();*/




        /*
        Scanner sc = new Scanner(System.in);

        int w;
        String x, y, z;

        w = sc.nextInt();  // Lê o número
        sc.nextLine();      // Consome a quebra de linha pendente

        x = sc.nextLine();  // Lê a primeira string
        y = sc.nextLine();  // Lê a segunda string
        z = sc.nextLine();  // Lê a terceira string

        System.out.println();
        System.out.println("Number: " + w);
        System.out.println("-");
        System.out.printf("Strings: %s, %s, %s%n", x, y, z);

        sc.close();*/








        /*
        // Funções matemáticas

        double w = 3.0;
        double x = 4.0;
        double y = -5.0;

        double l, m, n;

        l = Math.sqrt(w);
        m = Math.sqrt(x);
        n = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + w + " = " + l);
        System.out.println("Raiz quadrada de " + x + " = " + m);
        System.out.println("Raiz quadrada de 25 = " + n);

        System.out.println("-");

        l = Math.pow(w, x);
        m = Math.pow(w, 2.0);
        n = Math.pow(5.0, 2.0);
        System.out.println(w + " elevado a " + x + " = " + l);
        System.out.println(w + " elevado ao quadrado = " + m);
        System.out.println("5 elevado ao quadrado = " + n);

        System.out.println("-");

        l = Math.abs(x);
        m = Math.abs(y);

        System.out.println("Valor absoluto de " + x + " = " + l);
        System.out.println("Valor absoluto de " + y + " = " + m); */




        // Fórmula de bhaskara

        /*
        double delta, raiz1, raiz2;
        double a, b, c;

        a = 4.0;
        b = 2.0;
        c = -6.0;

        delta = Math.pow(b, 2.0) - 4 * a * c;

        raiz1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        raiz2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println("Delta: " + delta);
        System.out.println("-");
        System.out.println("Raiz 1: " + raiz1);
        System.out.println("Raiz 2: " + raiz2); */

        // Mais informações: java.lang.Math








        // Exercícios sobre Estrutura Sequencial (entrada, processamento, saída)

        // Exercício 1

        /*Scanner sc = new Scanner(System.in);

        int number1, number2;

        System.out.println();

        System.out.print("Digite um número: ");
        number1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        number2 = sc.nextInt();

        int add = number1 + number2;


        System.out.println("-");

        System.out.println("Soma dos números: " + add);

        sc.close();*/


        // Exercício 2

        /*Scanner sc = new Scanner(System.in);

        double area, raio;
        double pi = 3.14159;

        System.out.println();

        System.out.print("Digite o valor do raio de um círculo: ");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2.0);

        System.out.println("-");

        System.out.printf("Área: %.4f%n", area);

        sc.close();*/


        // Exercício 3

        /*Scanner sc = new Scanner(System.in);

        int A, B, C, D, productDifference;

        System.out.println();

        System.out.print("A: ");
        A = sc.nextInt();

        System.out.print("B: ");
        B = sc.nextInt();

        System.out.print("C: ");
        C = sc.nextInt();

        System.out.print("D: ");
        D = sc.nextInt();

        productDifference = A * B - C * D;

        System.out.println("-");

        System.out.println("Diferença dos produtos: " + productDifference);

        sc.close();*/


        // Exercício 4

        /*Scanner sc = new Scanner(System.in);

        int code, horasTrabalhadas;
        double valorHora, salary;

        System.out.println();

        System.out.print("Digite o número do funcionário: ");
        code = sc.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor que recebe por hora: ");
        valorHora = sc.nextDouble();

        salary = horasTrabalhadas * valorHora;

        System.out.println("-");

        System.out.println("Nº Funcionário: " + code);
        System.out.printf("Salário: U$ %.2f%n", salary);

        sc.close();*/


        // Exercício 5

        /*Scanner sc = new Scanner(System.in);

        int code1, code2, quantity1, quantity2;
        double unitValue1, unitValue2, total;

        code1 = sc.nextInt();
        quantity1 = sc.nextInt();
        unitValue1 = sc.nextDouble();

        code2 = sc.nextInt();
        quantity2 = sc.nextInt();
        unitValue2 = sc.nextDouble();

        total = quantity1 * unitValue1 + quantity2 * unitValue2;

        System.out.println("-");

        System.out.printf("Valor a pagar: R$ %.2f%n", total);

        sc.close();*/


        // Exercício 6

        /*Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        double pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = pi * Math.pow(C, 2.0);
        trapezio = (A + B) * C / 2.0;
        quadrado = Math.pow(B, 2.0);
        retangulo = A * B;

        System.out.println("-");

        System.out.printf("Triângulo: %.3f%n", triangulo);
        System.out.printf("Círculo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);

        sc.close();*/







        //
    }
}
