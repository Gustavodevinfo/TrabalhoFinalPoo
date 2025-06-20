import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo implements ManipulaArquivos {
    @Override
    public void gerarRanking(Jogador jogador) {
        String csvfile = "Ranking.csv";
        File file = new File(csvfile);

        boolean arquivoExiste = file.exists();
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(csvfile, true));
            if (!arquivoExiste) {
                writer.println("Nome, Prêmio");
            }
            writer.println(jogador.getNome() + "," + jogador.getPremio());
            writer.close();
            System.out.println("Emissão de ranking completa");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o ranking.");
            e.printStackTrace();
        }
    }
}