#language: pt 
#encoding: UTF-8

@RealizarCompra
Funcionalidade: Realizar compra

	@comprar
	Cenario: Comprar item
		Quando eu acessar a pagina de produtos
		E adicionar o produto ao carrinho
		E proceder para o checkout
		E realizar login com email "koxaga6866@soulsuns.com" e senha "teste12345"
		E confirmar o endereco
		E concordar com os Termos de servico
		E selecionar o metodo de pagamento
		E confirmar o pedido
		Entao o sistema finaliza a compra e apresenta na tela as informacoes:
			|Your order on My Store is complete.								|

			
			
			