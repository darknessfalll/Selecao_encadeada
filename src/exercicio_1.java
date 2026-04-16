import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Preço fixo 250,00 alem da taxa das diarias. Quantos dias você ficou hospedado?");
        int dia = sc.nextInt();
        double taxa = sc.nextDouble();

        if( dia > 15){
            taxa = 250 + ( 15.50 * dia);
            System.out.println("O valor foi R$" + taxa + " Qual será a forma de pagamento?");

        }
        else if (dia == 15){
            taxa = 250 + (36 * 15);
            System.out.println("O valor foi R$" + taxa + " Qual será a forma de pagamento?");
        }
        else{
            taxa = 250 + ( 58 * dia);
            System.out.println("O valor foi R$" + taxa + " Qual será a forma de pagamento? ");
        }


    }
}

