import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente c1 = new Cliente();

        System.out.println("Olá! Você deseja realizar depósito ou saque? \n" +
                "Digite 1 para depósito ou digite 2 para saque.");
        int escolha = sc.nextInt();
        switch (escolha){
            case 1:
                System.out.println("Você quer realizar um depósito.");
                System.out.println("Informe o valor para depósito: ");
                c1.setDepósito(sc.nextDouble());
                System.out.println("Depósito realizado com sucesso!");
                break;
            case 2:
                System.out.println("Informe o valor para saque: ");
                c1.setDepósito(sc.nextDouble());
                System.out.println("Você quer realizar um saque.");
                System.out.println("Depósito realizado com sucesso!");
                break;
        }
    }
}
