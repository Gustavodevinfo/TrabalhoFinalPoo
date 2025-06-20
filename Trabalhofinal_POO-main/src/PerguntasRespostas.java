import java.util.List;

public class PerguntasRespostas {
    private String pergunta;
    private List<String> alternativas;
    private String alternativaCorreta;

    public PerguntasRespostas(String pergunta, List<String> alternativas, 
                            String alternativaCorreta) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
    }

    // Getters
    public String getPergunta() { return pergunta; }
    public List<String> getAlternativas() { return alternativas; }
    public String getAlternativaCorreta() { return alternativaCorreta; }
}