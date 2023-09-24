import java.util.ArrayList;
import java.util.Scanner;

public class SeparadorDeGrupos {
    public static void main(String[] args) {
        ArrayList<String> grupoMasculino = new ArrayList<>();
        ArrayList<String> grupoFeminino = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
            }
        }

        System.out.println("\nGrupo Masculino:");
        for (String nome : grupoMasculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : grupoFeminino) {
            System.out.println(nome);
        }

        scanner.close();
    }
}