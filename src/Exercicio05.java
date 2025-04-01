import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00");
        double valorAula, porcentagem;
        int totalDeAulas;
        double salarioBruto, salarioLiquido, desconto;

        // entrada de dados
        System.out.print("Informe o total de aulas no mês: ");
        totalDeAulas = sc.nextInt();
        System.out.print("Informe o valor da aula: R$ ");
        valorAula = sc.nextDouble();
        System.out.print("Informe a porcentagem de desconto do INSS: ");
        porcentagem = sc.nextDouble();

        // processamento
        salarioBruto = totalDeAulas * valorAula;
        desconto = salarioBruto * porcentagem / 100;
        salarioLiquido = salarioBruto - desconto;

        // saída de dados
        System.out.println("Salário bruto R$ " + df.format(salarioBruto));
        System.out.println("Desconto do INSS R$ " + df.format(desconto));
        System.out.println("Salário líquido R$ " + df.format(salarioLiquido));
    }
}
