
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
    
    public static int dados() {

        int dado;

        dado = (int) (Math.random() * 6 + 1);
        System.out.println("O dado sorteou o numero: " + dado);

        return 0;
    }
    
    static void quantidadedeDano(){
        
        int dados = dados();
        if (dados == 1){
            System.out.println("deu1dedano");    
        }
        else if(dados == 2){
            System.out.println("deu2dedano");
        }
        else if(dados == 3){
            System.out.println("deus3dedano");
        }
        else if(dados == 4){
            System.out.println("deus3dedano");
        }    
        else if(dados == 5){
            System.out.println("deus3dedano");
     }
    }

    static void loja() {
        Scanner sc = new Scanner(System.in);

//        System.out.println("fazer um botao de escolha de sim ou nao para acessar a loja"
//                + "mostrar os itens na loja com seus valores e ´poderes´ de dano defesa etc"
//                + "mostrar oq o jogador comprou e qual a historia do item e oq ele faz e tlas"
//                + "criar opcao de sair da loja "
//                + "a cada fase o jogador ganhara 10 nars podendo comprar os itens a cada 2 fases]"
//                + " item : pedra da salvação, permite q o jogador engane a morte e volte com 1/20 de vida ");
//                  criar uma "barra de vida 20/20 e cada tanto de dano vai pertdendo ex 15/20 chego a 0/20 cabo "
//                  fazer um inventario
//                 ver como um item tipo oculos sla oq tiraria uma das alternativas 
//
        System.out.println("Deseja entrar na loja de itens?[s/n]");
        String escolha = sc.nextLine();

        switch (escolha) {
            case "s":
            case "S":
                int loja;
                System.out.println(" *-* Bem vindo ao meu lojinha, me chamar Adam Sandler, a cada vez que passar por aqui meus itens a venda mudarão. *-*  ");
                System.out.println("1 - Espada de sangue de Demônio[25 Nars] ");
                System.out.println("2 - Laminas do Caos [30 Nars]");
                System.out.println("3 - Dados de Letum [Gratuito]");
                System.out.println("4 - Lagrimas do amor perdido de Orfeu [15 Nars] ");
                System.out.println("5 - Anel da 'sorte' de Dólos[40 Nars] ");
                System.out.println("SAIR");
                System.out.println("Deseja adquirir alguma de minhas reliquias?\nEstes são alguns de minhas mais preciosas itens, "
                        + "cada um deter uma habilidade, magia ou buff de poder.");
                do {
                    loja = sc.nextInt();
                    
                    switch (loja) {
                        case 1:
                            System.out.println("Você adquiriu a espada de sangue de Demônio");
                            break;
                        case 2:
                            System.out.println("Você adquiriu as Laminas do Caos ");
                            break;
                        case 3:
                            System.out.println("Você adquiriu os Dados de Letum");
                            break;
                        case 4:
                            System.out.println("Você adquiriu as Lagrimas do amor perdido de Orfeu");
                            break;
                        case 5:
                            System.out.println("Você adquiriu o Anel da 'sorte' de Dólos");
                            break;
                        case 6:
                            System.out.println("saida");
                        default:
                            System.out.println("Volte Sempre");
                            break;
                            
                    }
                } while (loja != 6);
                break;
            case "n":
            case "N":
                System.out.println("Não");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }

    public static void main(String[] args) {
        
        System.out.println("Ola");
        loja();
        dados();
        quantidadedeDano();
    }
}
