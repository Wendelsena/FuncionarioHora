import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int id, horasTrabalhadas;
        double salarioHora;

        System.out.println("Entre com o ID, Horas trabalhadas e Salário Hora:");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        id = sc.nextInt();

        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.print("Salário por Hora: ");
        salarioHora = sc.nextDouble();

        System.out.println("O funcionário de ID " + id + " trabalhou um total de " + horasTrabalhadas + " horas.");
        System.out.printf("Portanto, irá receber: R$ %.2f%n", horasTrabalhadas * salarioHora);

        sc.close();
    }
}

