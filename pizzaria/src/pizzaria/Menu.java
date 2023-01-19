package pizzaria;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] mostraMenu = {"Cadastrar Pedido", "Listar Todos os Pedidos",
                "Buscar Pedido por Número", "Atualizar Pizza do Pedido", "Status do Pedido",
                "Cancelar Pedido", "Sair"};

        int opcao = 0;

        while (true) {

            System.out.println("*".repeat(40) + "\n");
            System.out.printf("%-12s%s", "", "SABOR DO RALF");
            System.out.println("\n\n" + "*".repeat(40) + "\n");

            for (int i = 0; i < mostraMenu.length; i++){
                System.out.printf("%7d - %s \n", (i + 1), mostraMenu[i]);
            }
            

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1 - Cadastrar Pedido");
                    break;
                case 2:
                    System.out.println("2 - Listar Todos os Pedidos");
                    break;
                case 3:
                    System.out.println("3 - Buscar Pedido por ID");
                    break;
                case 4:
                    System.out.println("4 - Atualizar Pizza do Pedido");
                    break;
                case 5:
                    System.out.println("5 - Status do Pedido");
                    break;
                case 6:
                    System.out.println("6 - Cancelar Pedido");
                    break;
                case 7:
                    System.out.println("7 - Sair");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

            if (opcao == 9) {
                leia.close();
                System.exit(0);
            }
        }

    }
}
