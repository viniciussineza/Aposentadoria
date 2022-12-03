import java.time.Year;

public class CalculoTempo {

    private static int anoAtual = Year.now().getValue();
    public static int calculoIdade (int anoNascimento) { return anoAtual - anoNascimento; }

    public static int calculoTempoTrabalho (int anoEntradaEmpresa) { return anoAtual - anoEntradaEmpresa; }
}
