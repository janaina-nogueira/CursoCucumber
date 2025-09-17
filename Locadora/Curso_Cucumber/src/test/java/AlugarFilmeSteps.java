import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AlugarFilmeSteps {
	
	private Filme filme;
	private AluguelService aluguel;
	private NotaAluguel nota;
	private String erro, tipoAluguel;
	
	@Dado("um filme com estoque de {int} unidades")
	public void um_filme_com_estoque_de_unidades(Integer int1) {
	   filme = new Filme();
	   filme.setEstoque(int1);
	}

	@Dado("que o preço de aluguel seja R$ {int}")
	public void que_o_preço_de_aluguel_seja_r$(Integer int1) {
		filme.setAluguel(int1);
	}

	@Quando("alugar")
	public void alugar() {
		try {
			nota = aluguel.alugar(filme, tipoAluguel);
		}catch(RuntimeException e){
			erro = e.getMessage();
		}
	   
	}

	@Então("o preço do aluguel será R$ {int}")
	public void o_preço_do_aluguel_será_r$(Integer int1) {
	    Assert.assertEquals(int1, nota.getPreco());
	}

	@Então("a data de entrega será no dia seguinte")
	public void a_data_de_entrega_será_no_dia_seguinte() {
	   Calendar cal = Calendar.getInstance();
	   cal.add(Calendar.DAY_OF_MONTH, 1);
	   
	   Date dataRetorno = nota.getDataEntrega();
	   Calendar calRetorno = Calendar.getInstance();
	   calRetorno.setTime(dataRetorno);
	   
	   Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
	   Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
	   Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));
	}

	@Então("o estoque do filme será {int} unidade")
	public void o_estoque_do_filme_será_unidade(Integer int1) {
	    Assert.assertEquals(int1, filme.getEstoque());
	}

	@Então("não será possível por falta de estoque")
	public void não_será_possível_por_falta_de_estoque() {
	    Assert.assertEquals("Filme sem estoque",erro);
	}

	@Dado("que o tipo de aluguel seja extendido")
	public void que_o_tipo_de_aluguel_seja_extendido() {
	    tipoAluguel = "extendido";
	}

	@Então("a data de entrega será em {int} dias")
	public void a_data_de_entrega_será_em_dias(Integer int1) {
	    Date dataEsperada = DateUtils.obterDataDiferencaDias(3);
	    Date dataReal = nota.getDataEntrega();
	    
	    Assert.assertEquals(dataEsperada, dataReal);
	}

	@Então("a pontuação recebida será de {int} pontos")
	public void a_pontuação_recebida_será_de_pontos(Integer int1) {
		Assert.assertEquals(int1, nota.getPontuacao());
	}

	
	
	
}
