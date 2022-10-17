
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Gabriel Aron
 */
public class V_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("fazer um botao de escolha de sim ou nao para acessar a loja"
//                + "mostrar os itens na loja com seus valores e ´poderes´ de dano defesa etc"
//                + "mostrar oq o jogador comprou e qual a historia do item e oq ele faz e tlas"
//                + "criar opcao de sair da loja "
//                + "a cada fase o jogador ganhara 10 nars podendo comprar os itens a cada 2 fases]"
//                + " item : pedra da salvação, permite q o jogador engane a morte e volte com 1/20 de vida ");
//        criar uma "barra devida 20/20 e cada tanto de dano vai pertdendo ex 15/20 chego a 0/20 cabo "
        System.out.println("Deseja entrar na loja de itens?[s/n]");
        String escolha = sc.nextLine();

        if (escolha.equals('s') || escolha.equals("S")) {
            int loja = 1;
            do {
                System.out.println("1 - Espada de sanguede ");
                System.out.println("2 - item b");
                System.out.println("3 - item c");
                System.out.println("4 - item d");
                System.out.println("5 - item d");
                System.out.println("SAIR");
                System.out.println("Deseja adquirir alguma de minhas reliquias?\nEstes são alguns dos itens "
                        + "mais inestimaveis deste reino, cada um contém sua habilidade, magia ou buff de poder.");
                switch (loja) {
                    case 1:
                        System.out.println("Você adquiriu a espada de sangue de Demônio");
                        break;
                    case 2:
                        System.out.println("B");
                        break;
                    case 3:
                        System.out.println("C");
                        break;
                    case 4:
                        System.out.println("D");
                        break;
                    case 5:
                        System.out.println("E");
                        break;
                    case 6:
                        System.out.println("saida");
                    default:
                        System.out.println("Volte Sempre");
                        break;
                        
                }
            } while (loja != 6);
        } else if (escolha.equals("n") || escolha.equals("N")) {
            System.out.println("Não");
        } else {
            System.out.println("Opção inválida");
        }

    }
}
