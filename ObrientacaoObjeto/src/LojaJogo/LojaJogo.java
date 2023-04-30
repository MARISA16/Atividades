package LojaJogo;

public class LojaJogo {
	
	private int catalogo;
	
	public LojaJogo(int catalogo) {
		
	}
	public int getCatalogo() {
		return catalogo;
	}
	public void setCatalogo(int catalogo) {
		this.catalogo = catalogo;
	}
	
    public void visualizar() {
    	System.out.println("/n/n------------------------");
    	System.out.println("Qual nome do Cliente?:");
    	System.out.println("/n/n------------------------");
    	System.out.println("Que categoria do jogo?:" + this.catalogo);
    	
    }
}
