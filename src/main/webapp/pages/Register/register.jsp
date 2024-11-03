<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./resources/css/bootstrap.css">
  <link rel="stylesheet" href="./root.css">
  <link rel="stylesheet" href="./pages/Register/register.css">
  <title>Página de Registro</title>

</head>
<body>
<div class="register-container">
  <div class="register-form">
    <div class="register-header">
      <h2>Criar Conta</h2>
      <p class="text-muted">Preencha os dados para se registrar</p>
    </div>

    <form method="post" action="register">
      <div class="row">
        <div class="col-md-6">
          <div class="form-floating">
            <input type="text" class="form-control" name="nome" id="nome" placeholder="Nome" required>
            <label for="nome">Nome</label>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-floating">
            <input type="text" class="form-control" name="sobrenome" id="sobrenome" placeholder="Sobrenome" required>
            <label for="sobrenome">Sobrenome</label>
          </div>
        </div>
      </div>

      <div class="form-floating">
        <input type="email" class="form-control" name="email" id="email" placeholder="nome@exemplo.com" required>
        <label for="email">Email</label>
      </div>

      <div class="form-floating">
        <input type="tel" class="form-control" name="telefone" id="telefone" placeholder="Telefone" required>
        <label for="telefone">Telefone</label>
      </div>

      <div class="form-floating">
        <input type="number" class="form-control" name="cpf" id="cpf" placeholder="Telefone" required>
        <label for="cpf">CPF</label>
      </div>

      <div class="row">
        <div class="col-md-6">
          <div class="form-floating">
            <input type="password" class="form-control" name="senha" id="senha" placeholder="Senha" required>
            <label for="senha">Senha</label>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-floating">
            <input type="password" class="form-control" id="confirmar-senha" placeholder="Confirmar Senha" required>
            <label for="confirmar-senha">Confirmar Senha</label>
          </div>
        </div>
      </div>

      <div class="form-check mb-3">
        <input class="form-check-input" type="checkbox" id="termos" required>
        <label class="form-check-label" for="termos">
          Concordo com os <a href="#" class="text-decoration-none">termos de uso</a> e <a href="#" class="text-decoration-none">política de privacidade</a>
        </label>
      </div>

      <button class="btn btn-primary w-100 mb-3" type="submit">Criar Conta</button>

      <div class="text-center">
        <p class="mb-0">Já tem uma conta? <a href="login" class="text-decoration-none">Faça login</a></p>
      </div>
    </form>
  </div>
</div>

</body>
</html>
