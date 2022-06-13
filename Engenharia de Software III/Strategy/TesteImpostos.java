package strategyPattern;

public class TesteImpostos {
	
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(1000.0);
		
		CalculaImposto calculador = new CalculaImposto();
		
		calculador.Calcula(orcamento, iss);
		calculador.Calcula(orcamento, icms);
	}
}
