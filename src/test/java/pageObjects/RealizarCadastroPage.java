package pageObjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RealizarCadastroPage {

	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	public WebElement paginaAutenticar;

	@FindBy(name = "email_create")
	public WebElement campoEmail;

	@FindBy(xpath = "//button[@name='SubmitCreate']")
	public WebElement botaoCriarConta;

	@FindBy(name = "customer_firstname")
	public WebElement campoPrimeiroNome;

	@FindBy(name = "customer_lastname")
	public WebElement campoSobrenome;

	@FindBy(name = "passwd")
	public WebElement campoSenha;

	@FindBy(name = "address1")
	public WebElement campoEndereco;

	@FindBy(name = "city")
	public WebElement campoCidade;

	@FindBy(name = "postcode")
	public WebElement campoCadigoPostal;

	@FindBy(name = "id_state")
	public WebElement dropdownEstado;

	@FindBy(name = "postcode")
	public WebElement campoCodigoPostal;

	@FindBy(name = "id_country")
	public WebElement dropdownPais;

	@FindBy(name = "phone")
	public WebElement campoTelefone;

	@FindBy(name = "submitAccount")
	public WebElement botaoFinalizarCadastro;

	public void acionarBotaoSalvar() {
		paginaAutenticar.click();
	}

	public void interagirCampoEmail(String email) {	
		Random aleatorio = new Random();
		int incremento = aleatorio.nextInt(9999) + 1;
		
		campoEmail.sendKeys(incremento + email);
	}

	public void criarConta() {
		botaoCriarConta.click();
	}

	public void interagirCampoPrimeiroNome(String nome) {
		campoPrimeiroNome.sendKeys(nome);
	}

	public void interagirCampoSobrenome(String sobrenome) {
		campoSobrenome.sendKeys(sobrenome);
	}

	public void interagirCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}

	public void interagirCampoEndereco(String endereco) {
		campoEndereco.sendKeys(endereco);
	}

	public void interagirCampoCidade(String cidade) {
		campoCidade.sendKeys(cidade);
	}

	public void interagirDropdownEstado(String estado) {
		Select selectObject = new Select(dropdownEstado);
		selectObject.selectByVisibleText(estado);

	}

	public void interagirCampoCep(String codigo) {
		campoCodigoPostal.sendKeys(codigo);
	}

	public void interagirDropdownPais(String pais) {
		Select selectObject = new Select(dropdownPais);
		selectObject.selectByVisibleText(pais);
	}

	public void interagirCampoTelefone(String telefone) {
		campoTelefone.sendKeys(telefone);

	}

	public void finalizarCadastro() {
		botaoFinalizarCadastro.click();
	}

	public void validarCadastro(List<String> validacoes) throws Exception {
		for (String info : validacoes) {

			assertTrue(driver.findElement(By.xpath("//*[text()='" + info + "']")).isDisplayed());
			System.out.println("VALIDAÇÃO: cadastro realizado - " + info);
		}

		Thread.sleep(3000);
	}

}
