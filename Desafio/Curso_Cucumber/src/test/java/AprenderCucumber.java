import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber{
	@Dado("que criei o arquivo corretamente")
	public void que_criei_o_arquivo_corretamente() {
	
	}

	@Quando("executá-lo")
	public void executá_lo() {
	    
	}

	@Então("a especificação deve finalizar com sucesso")
	public void a_especificação_deve_finalizar_com_sucesso() {
	
	}
	
	private int contador = 0;
	@Dado("que o valor do contador é {int}")
	public void que_o_valor_do_contador_é(Integer int1) {
	   contador = int1;
	}

	@Quando("eu incrementar em {int}")
	public void eu_incrementar_em(Integer int1) {
		contador = contador + int1;
	}

	@Então("o valor do contador será {int}")
	public void o_valor_do_contador_será(Integer int1) {
	 System.out.println(int1);
	 System.out.println(contador);
	 //Assert.assertEquals(int1,contador);
	}
	
	@Dado("que o ticket é AF345")
	public void que_o_ticket_é_af345() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("que o valor da passagem é R$ {double}")
	public void que_o_valor_da_passagem_é_r$(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("que o nome do passageiro é {string}")
	public void que_o_nome_do_passageiro_é(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("que o telefone do passageiro é {int}-{int}")
	public void que_o_telefone_do_passageiro_é(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Quando("criar os steps")
	public void criar_os_steps() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Então("o teste vai funcionar")
	public void o_teste_vai_funcionar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}