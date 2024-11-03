<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home</title>
    <link rel="stylesheet" href="./resources/css/bootstrap.css">
    <link rel="stylesheet" href="./components/header.css">
    <link rel="stylesheet" href="./root.css">
    <link rel="stylesheet" href="./pages/Home/home.css">
  </head>
  <body>
  <%@include file="../../components/header.jsp"%>

  <div class="container" id="content">

    <div class="row" id="saldo_content">
      <label id="desc_saldo" for="saldo">Seu Saldo Total </label>
      <h1 id="saldo">R$ 1500</h1>
    </div>

    <div class="row gap-3 flex-lg-nowrap" id="cards_group">
      <div class="card_component col-12 col-lg-3 ">
        <div class="title_Card_component">
          <img src="./Img/cifrao.svg" alt="Cifrão imagem">
          <h3>Total despesas</h3>
        </div>
        <span>R$ 1300</span>
      </div>

      <div class="card_component col-12 col-lg-3 ">
        <div class="title_Card_component">
          <img src="./Img/dinheiro_papel.svg" alt="Dinheiro de papel imagem">
          <h3>Total Receita</h3>
        </div>
        <span>R$ 0</span>
      </div>
      <div class="card_component col-12 col-lg-3 ">
        <div class="title_Card_component">
          <img src="Img/dinheiro_papel.svg" alt="Dinheiro papel imagem">
          <h3>A receber</h3>
        </div>
        <span>R$ 1500</span>
      </div>
      <div class="card_component col-12 col-lg-3 ">
        <div class="title_Card_component">
          <img src="Img/investimento.svg" alt="Investimento icone">
          <h3>Total investido</h3>
        </div>
        <span>R$ 800</span>
      </div>
    </div>

    <div class="row gap-3 flex-lg-nowrap" id="list_content">
      <div class="maiores_despesas col-12 col-lg-6">
        <div class="title_list_component">
          <img src="Img/despesas_black.svg" alt="Despesas Icone">
          <h3>Maiores Despesas</h3>
        </div>
        <div class="col-12 item_lista">
          <div class="nome_itens">
            <p>Shoope</p>
            <span>R$ 140</span>
          </div>

          <button>Vizualizar</button>
        </div>

        <div class="col-12 item_lista">
          <div class="nome_itens">
            <p>Shoope</p>
            <span>R$ 140</span>
          </div>

          <button>Vizualizar</button>
        </div>
      </div>

      <div class="maiores_despesas col-12 col-lg-6">
        <div class="title_list_component">
          <img src="Img/maiores_investimentos.svg" alt="Investimento Icon">
          <h3>Maiores Receitas</h3>
        </div>

        <div class="col-12 item_lista">
          <div class="nome_itens">
            <p>Trabalho</p>
            <span>R$ 2800</span>
          </div>

          <button>Vizualizar</button>
        </div>

        <div class="col-12 item_lista">
          <div class="nome_itens">
            <p>Apostas</p>
            <span>R$ 2800</span>
          </div>

          <button>Vizualizar</button>
        </div>
      </div>
    </div>
  </div>
  
  </body>
</html>
