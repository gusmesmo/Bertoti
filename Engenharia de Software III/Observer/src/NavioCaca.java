import java.util.Observable;

public abstract class NavioCaca implements Observer, Navio {
	public void norte() {
		System.out.println("Vá para o norte.");
	}
	
	public void sul() {
		System.out.println("Vá para o sul.");
	}
	
	public void leste() {
		System.out.println("Vá para o leste.");
	}
	
	public void oeste() {
		System.out.println("Vá para o oeste.");
	}
	
	public void update(Observable o, Object o1) {
		NavioInimigo navioinimigo;
		NavioInimigo NavioInimigo = (navioinimigo), o;
		String acao = String.valueOf(o1);
		
		if(acao.equals("norte")) {
			this.norte();
		}
		else if (acao.equals("sul")) {
			this.sul();
		}
		else if (acao.equals("leste")) {
			this.leste();
		}else if (acao.equals("oeste")) {
			this.oeste();
		}
	}
	
}
