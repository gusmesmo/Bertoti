

public class NavioInimigo extends Observable implements Navio {

	private String acao = "";
	
	public void norte() {
		setAcao("norte");
		System.out.println("Navio inimigo ao norte");
	}
	public void sul() {
		setAcao("sul");
		System.out.println("Navio inimigo ao sul");
	}
	public void leste() {
		setAcao("leste");
		System.out.println("Navio inimigo ao leste");
	}
	public void oeste() {
		setAcao("oeste");
		System.out.println("Navio inimigo ao oeste");
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	
}
