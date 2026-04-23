import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite o nome do usuário : ");
        String user = sc.nextLine();
        System.out.println(" Digite a senha : ");
        String senha = sc.nextLine();

        if (user.equals("admin") && senha.equals("fiap2026")){
            System.out.println(" Credenciais corretas, Bem vindo ");

        }
        else if (user.equals("admin") && !senha.equals("fiap2026")) {
            System.out.println(" Senha incorreta ");}

        else if (!user.equals("admin")){
            System.out.println(" Usuário não encontrado ");
        }




    }
}
