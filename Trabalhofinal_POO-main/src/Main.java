import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nomeJogador = scanner.nextLine();
        
        Jogador jogador = new Jogador();
        jogador.setNome(nomeJogador);
        
        Milhao jogo = new Milhao(jogador);
        jogo.jogar();
        jogo.resultado();
        
        scanner.close();
    }
}