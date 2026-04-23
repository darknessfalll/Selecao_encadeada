import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Fala tua renda bruta aí bro ");
        double salariobroto = sc.nextDouble();
        double salarioLiquido;
        double imposto;
        double aliquota;

        if (salariobroto <= 2.112){
            aliquota = 0 ;
        }
        else if (salariobroto <= 2826.65){
            aliquota = 7.5;
        }
        else if (salariobroto <= 3751.05){
            aliquota = 15;
        } else if (salariobroto <= 4664.68) {
            aliquota = 22.5;
        }
        else if (salariobroto > 4664.68){
            aliquota = 27.5;
        }

        imposto = salariobroto * aliquota /100;

    }
}
