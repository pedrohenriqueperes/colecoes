import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome da Pessoa (ou 'Sair' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);
            if (sexo == 'M') {
                masculino.add(nome);
            } else if (sexo == 'F') {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Tente novamente");
            }

        }
        System.out.println("\nPessoas no grupo masculino: ");
        for(String nome : masculino) {
            System.out.println(nome);
        }
        System.out.println("\nPessoas no grupo feminino");
        for(String nome : feminino) {
            System.out.println(nome);
        }
    }
}