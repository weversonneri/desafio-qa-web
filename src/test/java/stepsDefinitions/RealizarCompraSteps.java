package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.RealizarCompraPage;

import static utils.Utils.*;

public class RealizarCompraSteps {

	@Quando("eu acessar a pagina de produtos")
	public void euAcessarAPaginaDeProdutos() {
		Na(RealizarCompraPage.class).acessarAbaProdutos();
	}

	@E("adicionar o produto ao carrinho")
	public void adicionarOProdutoAoCarrinho(){
		Na(RealizarCompraPage.class).adicionarAoCarrinho();
	}

	@E("proceder para o checkout")
	public void procederParaOCheckout() throws Exception {
		Na(RealizarCompraPage.class).procederCheckout();
	}
	
	@E("realizar login com email {string} e senha {string}")
	public void realizarLoginComEmailESenha(String email, String senha) throws Exception  {
		Na(RealizarCompraPage.class).realizarLogin(email, senha);
	}

	@E("confirmar o endereco")
	public void confirmarOEndereco() {
		Na(RealizarCompraPage.class).procederEndereco();
	}

	@E("concordar com os Termos de servico")
	public void concordarComOsTermosDeServico() {
		Na(RealizarCompraPage.class).procederFrete();
	}

	@E("selecionar o metodo de pagamento")
	public void selecionarOMetodoDePagamento() {
		Na(RealizarCompraPage.class).selecionarMetodoPagamento();
	}

	@E("confirmar o pedido")
	public void confirmarOPedido() {
		Na(RealizarCompraPage.class).confirmarPedido();
	}

	@Entao("o sistema finaliza a compra e apresenta na tela as informacoes:")
	public void oSistemaFinalizaACompraEApresentaNaTelaAsInformacoes(String string) throws Exception {
		Na(RealizarCompraPage.class).validarPedido(string);
	}

	

}
