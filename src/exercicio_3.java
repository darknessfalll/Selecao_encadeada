import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Qual seu turno? ");
        String turno = sc.nextLine();

        if (turno.equals("manha")){
            System.out.println(" Seu turno é das 7:00 até o 12:00 ");

        }
        else if (turno.equals("tarde")){
            System.out.println(" Seu horário é das 13h00 às 18h00 ");
        }
        else if (turno.equals("noite")){
            System.out.println(" Seu horário é das 19h00 às 23h00 ");
        }
        else {
            System.out.println("Turno inválido seu arrombadjonix");
        }








    }
}
