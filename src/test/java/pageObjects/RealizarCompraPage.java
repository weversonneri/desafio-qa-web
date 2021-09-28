package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class RealizarCompraPage {

	// p class="alert alert-success" text Your order on My Store is complete.

	@FindBy(xpath = "//a[@title='Women']")
	public WebElement abaWomen;

	@FindBy(xpath = "//ul[@class=\"submenu-container clearfix first-in-line-xs\"]//a[@title='T-shirts']")
	public WebElement menuTshirts;

	//// div[@class='product-container']
	@FindBy(xpath = "//h5//a[@title='Faded Short Sleeve T-shirts']")
	public WebElement produto;

	@FindBy(name = "Submit")
	public WebElement botaoAdicionarCarrinho;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	public WebElement botaoProcederCheckout;

	@FindBy(xpath = "//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")
	public WebElement botaoProcederCheckout2;

	@FindBy(name = "processAddress")
	public WebElement botaoProcederEndereco;

	@FindBy(name = "email")
	public WebElement campoEmail;

	@FindBy(name = "passwd")
	public WebElement campoSenha;

	@FindBy(name = "SubmitLogin")
	public WebElement botaoEntrar;

	@FindBy(name = "cgv")
	public WebElement checkboxTos;

	@FindBy(name = "processCarrier")
	public WebElement botaoProcederFrete;

	@FindBy(className = "cheque")
	public WebElement pagamento;

	@FindBy(xpath = "//span[text()='I confirm my order']")
	public WebElement botaoConfirmarPedido;
	
	@FindBy(xpath = "//*[text()='Your order on My Store is complete.']")
	public WebElement validarPedido;
	
	

	public void acessarAbaProdutos() {
		Actions action = new Actions(driver);

		action.moveToElement(abaWomen).build().perform();
		action.moveToElement(menuTshirts).click().build().perform();

	}

	public void selecionarProduto() {
		produto.click();
	}

	public void adicionarAoCarrinho() {
		selecionarProduto();
		botaoAdicionarCarrinho.click();
	}

	public void procederCheckout() {
		botaoProcederCheckout.click();
		botaoProcederCheckout2.click();
	}

	public void interagirCampoEmail(String email) {
		campoEmail.sendKeys(email);
	}

	public void interagirCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}

	public void realizarLogin(String email, String senha) throws Exception {
		interagirCampoEmail(email);
		interagirCampoSenha(senha);
		botaoEntrar.click();

		Thread.sleep(1000);
	}

	public void procederEndereco() {
		botaoProcederEndereco.click();
	}

	public void marcarTos() {
		checkboxTos.click();
	}

	public void procederFrete() {
		marcarTos();
		botaoProcederFrete.click();
	}

	public void selecionarMetodoPagamento() {
		pagamento.click();
	}

	public void confirmarPedido() {
		botaoConfirmarPedido.click();
	}
	
	public void validarPedido(String validacao) throws Exception {
		System.out.println("VALIDAÇÃO DE COMPRA: " + validacao);
		assertEquals(validarPedido.getText(), validacao);
		Thread.sleep(1000);
	}

}
