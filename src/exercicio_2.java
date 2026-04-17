import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Atribua os valores respectivamente : n1, n2 & n3");

        double n1 = sc.nextDouble();
        System.out.println(" Valor atribuido foi: "+ n1);

        double n2 = sc.nextDouble();
        System.out.println(" Valor atribuido foi:"+ n2);

        double n3 = sc.nextDouble();
        System.out.println(" Valor atribuido foi: "+ n3);

        double delta = Math.pow(n2, 2) - 4* n1 * n3 ;

        if (delta < 0){
            System.out.println(" Não existem raizes ");
        }
        else{
            double x1, x2;
            x1 = (-n2 + Math.sqrt(delta) ) / 2 * n1;
            x2 = ( -n2 - Math.sqrt(delta) ) / 2 * n1;
            System.out.println(" Suas raizes são: " + x1 + "," +x2 );
        }
        if (delta == 0){
            double x1;
            x1 = (-n2 + Math.sqrt(delta) ) / 2 * n1;

            System.out.println(" Sua raiz é: " + x1);

        }
    }
}
