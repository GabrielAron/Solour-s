
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Gabriel Aron
 */
public class V_2_2 {

    public static String infosPersonagem() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do seu Personagem ");
        String nome = sc.next();

        System.out.println("Digite a raça que seu personagem ");
        String raca = sc.next();

        System.out.println("Bem vindo " + nome + " você esta no Reino de Solour´s, vejo que pertence a raça " + raca + ","
                + " muito interessante, gostaria de saber algo?");

        return null;

    }

    public static int dados() {

        int dados;

        dados = (int) (Math.random() * 6 + 1);
        System.out.println("O dado sorteou o numero: " + dados);

        return dados;
    }

    public static int quantidadedeDano(int dados) {

        if (dados == 1) {
            System.out.println("Você desfere um ataque de maneira muito lenta com isso o monstro consegue desviar com facilidade");
        } else if (dados == 2) {
            System.out.println("Seu ataque foi fraco causando 20% de dano");
        } else if (dados == 3) {
            System.out.println("Com um ataque de força media voçê causa 50% de dano ao monstro");
        } else if (dados == 4) {
            System.out.println("Com um forte ataque você causa 80% de dano ao monstro");
        } else if (dados == 5) {
            System.out.println("Você desfere um podoreso ataque acertando o monstro em cheio e causando 100% de critico");
        }
        return dados;
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);

        int opção;
        System.out.println("Bem vindo ao Menu!! Escolha a opção que você deseja.");
        System.out.println("1 - Jogar");
        System.out.println("2 - Instruções");
        System.out.println("3 - Créditos");
        System.out.println("4 - Sair");

        do {
            opção = input.nextInt();
            switch (opção) {
                case 1:
                    System.out.println("Bom jogo!");
                    break;
                case 2:
                    System.out.println("Você escolheu instruções.");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Você escolheu Créditos.");
                    System.out.println("Projeto Integrador");
                    System.out.println("Grupo 4 - Turma A\nLeonardo Henrique Rodrigues Moretti\nGuilherme Candido Caldas\nGabriel Aron Leal de Araújo\n"
                            + "Marcelo Augusto Da Cruz Pereira");
                    break;
                case 4:
                    System.out.println("Você saiu do jogo.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Isso não é uma opção.");
            }
        } while (opção != 1);
        System.out.println("Bem vindo ao Reino de Solour´s");
        System.out.println("Você acorda em uma cabana de caçador, não muito bonita, mas te protegeria de tempestades. Tirando seu odor forte, sons de ratos\n"
                + "no assoalho e o barulho do vento passando entre as rachaduras das paredes, era bem aconchegante ficar próximo de uma lareira.");
        System.out.println("    -- Ah, maravilha!! Finalmente você acordou hahaha. Te encontrei caído enquanto caçada com meu velho amigo Bruto ali"
                + " *você se vira e vê um cachorro\n de porte pequeno, não lhe parece o melhor cão de caça, mas uma companhia leal*. Diga-me, quem você é?");
        System.out.println("Escolha seu nome: ");
        String name = input.next();
        System.out.println("Escolha sua raça: "
                + " 1 - Humanos" //fazer uma breve descriçao fisica para cada raça 
                + " 2 - Elfos"
                + " 3 - Anões"
                + " 4 - Minotauros"
                + " 5 - Gnomos ");
        String raça = input.next();
        //Aqui vão ter raças pré-definidas\\
        System.out.println("    -- Olá " + name + "! Que bom que se lembra de seu nome então significa que sua cabeça está bem! Mas ainda não me disse exatamente, quem é você?");
        System.out.println("Escolha sua classe:"
                + " 1 - Bárbaro " // FAZER UMA BREVE DESCRIÇAO DE CADA CLASSE COMO OQUE CARREGA E OQ FAZ 
                + " 2 - Bardo"
                + " 3 - Mago"
                + " 4 - Druida"
                + " 5 - Guerreiro"
                + " 6 - Monge ");
        String classe = input.next();
        //Aqui vão ter classes pré-definidas\\

    }

    // fazer uma arraylist e add cada item quando comprado 
    public static void loja1() {
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
                            //add to Arrylist
                            System.out.println("Você adquiriu a espada de sangue de Demônio");
                            break;
                        case 2:
                            //add to Arrylist
                            System.out.println("Você adquiriu as Laminas do Caos ");
                            break;
                        case 3:
                            //add to Arrylist
                            System.out.println("Você adquiriu os Dados de Letum");
                            break;
                        case 4:
                            //add to Arrylist
                            System.out.println("Você adquiriu as Lagrimas do amor perdido de Orfeu");
                            break;
                        case 5:
                            //add to Arrylist
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
    
    public static void inventario(){
        
    }

    public static void main(String[] args) {
        //https://stackoverflow.com/questions/37627273/inventory-program-in-java link pro invetario.
        //  BEM VINDO A SOLOURS DEADLY FANTASY (COM ASCII ART)
        menu();
        //RESTO DA HISTORIA 
        System.out.println("ABRIU A LOJA");
        loja1();
        //fazer uma opçao e explicar se for digitado inventario apos a loja(ou só abrir o inventario apos a loja e o jogador escolhe o item)
        //antes dos dados seleçao de qual item sera usado para a batalha e definir o dano de cada 1
        int dados = dados();
        quantidadedeDano(dados);
        infosPersonagem();
    }
}
