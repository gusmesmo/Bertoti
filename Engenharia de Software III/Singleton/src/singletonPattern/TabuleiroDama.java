package singletonPattern;

public class TabuleiroDama {
	static private TabuleiroDama instance = null;
	
	private TabuleiroDama() {
	}
	static TabuleiroDama getInstance () 
	{
		if (instance == null) 
			instance = new TabuleiroDama();
			return instance;
		
	}
	
	public static void main(String[] args) {
		TabuleiroDama tabuleiro1 = TabuleiroDama.getInstance();
		TabuleiroDama tabuleiro2 = TabuleiroDama.getInstance();
		System.out.println(tabuleiro1);
		System.out.println(tabuleiro2);
		//Singleton permite a criação de uma única instance
		//ou seja tem que imprimir o mesmo valor de
		//tabuleiro1 e tabuleiro2
	}
}

