#language: pt 
#encoding: UTF-8

@CadastrarUsuario
Funcionalidade: Cadastrar usuario

	Eu como um cliente
	Quero criar uma conta no site
	Para que eu possa realizar a compra de um ou mais itens

	@cadastro
	Cenario: Realizar cadastro
		Quando eu acionar a pagina de autenticacao
		E informar o email "testewebw@mail.com"
		E acionar o botao Create an account
		E informar o primeiro nome "Weverson"
		E informar o sobrenome "Santos"
		E informar a senha "teste12345"
		E informar o endereco "1400 Constitution Ave. NW, Washington, DC 20560"
		E informar a cidade "Washington, D.C."
		E informar o estado "District of Columbia"
		E informar a codigo postal "00000"
		E informar o pais "United States"
		E informar o telefone "4052-7492"
		E acionar o botao de finalizar cadastro
		Entao o sistema finaliza o cadastro e apresenta na tela as informacoes:
			|Order history and details								|
			|My credit slips													|
			|My addresses															|
			|My personal information									|
			|My wishlists															|
			
			
			
			