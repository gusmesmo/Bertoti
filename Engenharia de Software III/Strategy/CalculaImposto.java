package strategyPattern;

public class CalculaImposto {
	public void Calcula(Orcamento orcamento, Imposto imposto) {
		
		double icms = imposto.calcula(orcamento);
		System.out.println(icms);
		}
}

