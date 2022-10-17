/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Gabriel Aron
 */
public class V_1 {

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
        do {
            if (escolha.equals('s') || escolha.equals("S")) {
            } else if (escolha.equals("n") || escolha.equals("N")) {
                System.out.println("Não");
            } else {
                System.out.println("Opção inválida");
            }
            while (!escolha.equals('s')){
        }
    