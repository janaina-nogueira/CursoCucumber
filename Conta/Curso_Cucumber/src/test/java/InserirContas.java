import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class InserirContas {
	
	private WebDriver driver;
	
	@Dado("que estou acessando a aplicação")
	public void que_estou_acessando_a_aplicação() {
		driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/");
	}

	@Quando("informo o usuário {string}")
	public void informo_o_usuário(String string) {
	   driver.findElement(By.id("email")).sendKeys(string);
	}

	@Quando("a senha {string}")
	public void a_senha(String string) {
		driver.findElement(By.id("senha")).sendKeys(string);
	}

	@Quando("seleciono entrar")
	public void seleciono_entrar() {
		driver.findElement(By.tagName("button")).click();
	}

	@Então("visualizo a página inicial")
	public void visualizo_a_página_inicial() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-succes']")).getText();
		Assert.assertEquals("Bem vindo, jana!",texto);
	}

	@Quando("seleciono Contas")
	public void seleciono_contas() {
		driver.findElement(By.linkText("Contas")).click();
	}

	@Quando("seleciono Adicionar")
	public void seleciono_adicionar() {
		driver.findElement(By.linkText("Adicionar")).click();
	}

	@Quando("informo a conta {string}")
	public void informo_a_conta(String string) {
		driver.findElement(By.id("senha")).sendKeys(string);
	}

	@Quando("seleciono Salvar")
	public void seleciono_salvar() {
		driver.findElement(By.tagName("button")).click();
	}

	@Então("a conta é inserida com sucesso")
	public void a_conta_é_inserida_com_sucesso() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-succes']")).getText();
		Assert.assertEquals("Conta adicionada com sucesso!",texto);
	}

	@Então("sou notificar que o nome da conta é obrigatório")
	public void sou_notificar_que_o_nome_da_conta_é_obrigatório() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Informe o nome da conta",texto);
	}

	@Então("sou notificado que já existe uma conta com esse nome")
	public void sou_notificado_que_já_existe_uma_conta_com_esse_nome() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Já existe uma conta com esse nome!",texto);
	}


}
