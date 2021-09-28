$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CadastrarUsuario.feature");
formatter.feature({
  "name": "Cadastrar usuario",
  "description": "\tEu como um cliente\n\tQuero criar uma conta no site\n\tPara que eu possa realizar a compra de um ou mais itens",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@CadastrarUsuario"
    }
  ]
});
formatter.scenario({
  "name": "Realizar cadastro",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CadastrarUsuario"
    },
    {
      "name": "@cadastro"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar a pagina de autenticacao",
  "keyword": "Quando "
});
formatter.match({
  "location": "RealizarCadastroSteps.euAcionarAPaginaDeAutenticacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o email \"testewebw@mail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCadastroSteps.informarOEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao Create an account",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCadastroSteps.acionarOBotaoCreateAnAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o primeiro nome \"Weverson\"",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCadastroSteps.informarOPrimeiroNome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o sobrenome \"Santos\"",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCadastroSteps.informarOSobrenome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"teste12345\"",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCadastroSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o endereco \"1400 Constitution Ave. NW, Washington, DC 20560\"",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCadastroSteps.informarOEndereco(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a cidade \"Washington, D.C.\"",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCadastroSteps.informarACidade(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o estado \"District of Columbia\"",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCadastroSteps.informarOEstado(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a codigo postal \"00000\"",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCadastroSteps.informarACodigoPostal(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o pais \"United States\"",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCadastroSteps.informarOPais(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o telefone \"4052-7492\"",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCadastroSteps.informarOTelefone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao de finalizar cadastro",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCadastroSteps.acionarOBotaoDeFinalizarCadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema finaliza o cadastro e apresenta na tela as informacoes:",
  "rows": [
    {
      "cells": [
        "Order history and details"
      ]
    },
    {
      "cells": [
        "My credit slips"
      ]
    },
    {
      "cells": [
        "My addresses"
      ]
    },
    {
      "cells": [
        "My personal information"
      ]
    },
    {
      "cells": [
        "My wishlists"
      ]
    }
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "RealizarCadastroSteps.oSistemaCadastraOUsuario(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/RealizarCompra.feature");
formatter.feature({
  "name": "Realizar compra",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@RealizarCompra"
    }
  ]
});
formatter.scenario({
  "name": "Comprar item",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@RealizarCompra"
    },
    {
      "name": "@comprar"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu acessar a pagina de produtos",
  "keyword": "Quando "
});
formatter.match({
  "location": "RealizarCompraSteps.euAcessarAPaginaDeProdutos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adicionar o produto ao carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCompraSteps.adicionarOProdutoAoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "proceder para o checkout",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCompraSteps.procederParaOCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "realizar login com email \"koxaga6866@soulsuns.com\" e senha \"teste12345\"",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCompraSteps.realizarLoginComEmailESenha(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirmar o endereco",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCompraSteps.confirmarOEndereco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "concordar com os Termos de servico",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCompraSteps.concordarComOsTermosDeServico()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar o metodo de pagamento",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCompraSteps.selecionarOMetodoDePagamento()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirmar o pedido",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarCompraSteps.confirmarOPedido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema finaliza a compra e apresenta na tela as informacoes:",
  "rows": [
    {
      "cells": [
        "Your order on My Store is complete."
      ]
    }
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "RealizarCompraSteps.oSistemaFinalizaACompraEApresentaNaTelaAsInformacoes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});