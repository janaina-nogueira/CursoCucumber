import java.util.Date;

public class NotaAluguel {
 
	private int preco, pontuacao;
	private Date dataEntrega;
	
	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date time) {
		dataEntrega = time;
		
	}

	public int getPontuacao() {
		
		return pontuacao;
	}
	public void setPontuacao(int ponto) {
		this.pontuacao = ponto;
	}
}
