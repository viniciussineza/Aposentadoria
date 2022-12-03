public class ValidarAposentadoria {

    public static String validacao(int idade, int tempoTrabalho) { return (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25))? "requer aposentadoria" : "não requer aposentadoria"; }
}
