import java.util.ArrayList;  // Adicione esta linha
import java.util.Collections;
import java.util.List;

public class GerenciadorDePerguntas {
    private List<PerguntasRespostas> perguntas;
    
    public GerenciadorDePerguntas() {
        this.perguntas = BancoDePerguntas.carregarPerguntas();
    }

    public List<PerguntasRespostas> getPerguntas() {
        Collections.shuffle(perguntas);
        return perguntas;
    }

    public List<String> getAlternativasEmbaralhadas(PerguntasRespostas p) {
        List<String> alternativas = new ArrayList<>(p.getAlternativas());  // Agora funcionará
        Collections.shuffle(alternativas);
        return alternativas;
    }
}