import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BancoDePerguntas {
    public static List<PerguntasRespostas> carregarPerguntas() {
        List<PerguntasRespostas> perguntas = new ArrayList<>();

        // Adicionando todas as perguntas
        perguntas.add(new PerguntasRespostas(
            "Qual é a capital do Brasil?",
            Arrays.asList("Brasília", "Rio de Janeiro", "São Paulo", "Belo Horizonte"),
            "Brasília"
        ));

        perguntas.add(new PerguntasRespostas(
            "Quem pintou a Mona Lisa?",
            Arrays.asList("Leonardo da Vinci", "Michelangelo", "Rafael", "Donatello"),
            "Leonardo da Vinci"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é o maior planeta do Sistema Solar?",
            Arrays.asList("Júpiter", "Saturno", "Marte", "Terra"),
            "Júpiter"
        ));

        perguntas.add(new PerguntasRespostas(
            "Em que ano o Brasil foi descoberto?",
            Arrays.asList("1500", "1492", "1808", "1822"),
            "1500"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual o símbolo químico da água?",
            Arrays.asList("H2O", "CO2", "O2", "NaCl"),
            "H2O"
        ));

        perguntas.add(new PerguntasRespostas(
            "Quem escreveu 'Dom Casmurro'?",
            Arrays.asList("Machado de Assis", "José de Alencar", "Camilo Castelo Branco", "Eça de Queirós"),
            "Machado de Assis"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é o idioma oficial da Argentina?",
            Arrays.asList("Espanhol", "Português", "Inglês", "Francês"),
            "Espanhol"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é o resultado da soma 7 + 5?",
            Arrays.asList("12", "10", "13", "11"),
            "12"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual o nome do presidente do Brasil em 2023?",
            Arrays.asList("Lula", "Bolsonaro", "Temer", "Dilma"),
            "Lula"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual o maior animal terrestre?",
            Arrays.asList("Elefante", "Rinoceronte", "Baleia", "Leão"),
            "Elefante"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é o continente onde fica o Egito?",
            Arrays.asList("África", "Ásia", "Europa", "América"),
            "África"
        ));

        perguntas.add(new PerguntasRespostas(
            "Em que esporte Pelé ficou famoso?",
            Arrays.asList("Futebol", "Basquete", "Atletismo", "Tênis"),
            "Futebol"
        ));

        perguntas.add(new PerguntasRespostas(
            "Quem descobriu a gravidade ao observar uma maçã cair?",
            Arrays.asList("Isaac Newton", "Albert Einstein", "Galileu Galilei", "Nikola Tesla"),
            "Isaac Newton"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é o maior oceano do planeta?",
            Arrays.asList("Pacífico", "Atlântico", "Índico", "Ártico"),
            "Pacífico"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é a cor da mistura do azul com o amarelo?",
            Arrays.asList("Verde", "Laranja", "Roxo", "Marrom"),
            "Verde"
        ));

        perguntas.add(new PerguntasRespostas(
            "Quantos estados tem o Brasil incluindo o DF?",
            Arrays.asList("26", "25", "27", "28"),
            "27" // 27 estados (incluindo DF)
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é o país conhecido como 'Terra do Sol Nascente'?",
            Arrays.asList("Japão", "China", "Coreia", "Índia"),
            "Japão"
        ));

        perguntas.add(new PerguntasRespostas(
            "Quem foi o primeiro homem a pisar na Lua?",
            Arrays.asList("Neil Armstrong", "Yuri Gagarin", "Buzz Aldrin", "Michael Collins"),
            "Neil Armstrong"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é a moeda oficial dos Estados Unidos?",
            Arrays.asList("Dólar", "Euro", "Iene", "Libra"),
            "Dólar"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é a fórmula para calcular a área do círculo?",
            Arrays.asList("pir²", "2pir", "pid", "r²pi"),
            "pir²"
        ));

        return perguntas;
    }
}