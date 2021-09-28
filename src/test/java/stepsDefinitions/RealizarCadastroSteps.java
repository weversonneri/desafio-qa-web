package stepsDefinitions;

import static utils.Utils.Na;

import java.util.List;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.RealizarCadastroPage;

public class RealizarCadastroSteps {

	@Quando("eu acionar a pagina de autenticacao")
	public void euAcionarAPaginaDeAutenticacao() {
		Na(RealizarCadastroPage.class).acionarBotaoSalvar();
	}

	@E("informar o email {string}")
	public void informarOEmail(String email) {
		Na(RealizarCadastroPage.class).interagirCampoEmail(email);
	}

	@E("acionar o botao Create an account")
	public void acionarOBotaoCreateAnAccount() {
		Na(RealizarCadastroPage.class).criarConta();
	}

	@E("informar o primeiro nome {string}")
	public void informarOPrimeiroNome(String nome) {
		Na(RealizarCadastroPage.class).interagirCampoPrimeiroNome(nome);
	}

	@E("informar o sobrenome {string}")
	public void informarOSobrenome(String sobrenome) {
		Na(RealizarCadastroPage.class).interagirCampoSobrenome(sobrenome);
	}

	@E("informar a senha {string}")
	public void informarASenha(String senha) {
		Na(RealizarCadastroPage.class).interagirCampoSenha(senha);
	}

	@E("informar o endereco {string}")
	public void informarOEndereco(String endereco) {
		Na(RealizarCadastroPage.class).interagirCampoEndereco(endereco);
	}

	@E("informar a cidade {string}")
	public void informarACidade(String cidade) {
		Na(RealizarCadastroPage.class).interagirCampoCidade(cidade);
	}

	@E("informar o estado {string}")
	public void informarOEstado(String estado) {
		Na(RealizarCadastroPage.class).interagirDropdownEstado(estado);
	}

	@E("informar a codigo postal {string}")
	public void informarACodigoPostal(String codigo) {
		Na(RealizarCadastroPage.class).interagirCampoCep(codigo);
	}

	@E("informar o pais {string}")
	public void informarOPais(String pais) {
		Na(RealizarCadastroPage.class).interagirDropdownPais(pais);
	}

	@E("informar o telefone {string}")
	public void informarOTelefone(String telefone) {
		Na(RealizarCadastroPage.class).interagirCampoTelefone(telefone);
	}

	@E("acionar o botao de finalizar cadastro")
	public void acionarOBotaoDeFinalizarCadastro() {
		Na(RealizarCadastroPage.class).finalizarCadastro();
	}

	@Entao("o sistema finaliza o cadastro e apresenta na tela as informacoes:")
	public void oSistemaCadastraOUsuario(List<String> dados) throws Exception {
		Na(RealizarCadastroPage.class).validarCadastro(dados);
	}


}
