<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./resources/css/bootstrap.css">
    <link rel="stylesheet" href="./root.css">
    <link rel="stylesheet" href="./pages/Login/login.css">
    <title>Página de Login</title>
</head>
<body>
<div class="login-container">
    <div class="login-form">
        <div class="login-header">
            <h2>Login</h2>
            <p class="text-muted">Digite suas credenciais para acessar</p>
        </div>

        <form>
            <div class="form-floating">
                <input type="email" class="form-control" id="email" placeholder="nome@exemplo.com" required>
                <label for="email">Email</label>
            </div>

            <div class="form-floating">
                <input type="password" class="form-control" id="senha" placeholder="Senha" required>
                <label for="senha">Senha</label>
            </div>

            <div class="form-check mb-3">
                <input class="form-check-input" type="checkbox" id="lembrar">
                <label class="form-check-label" for="lembrar">
                    Lembrar de mim
                </label>
            </div>

            <button class="btn btn-primary w-100 mb-3" type="submit">Entrar</button>

            <div class="text-center">
                <a href="#" class="text-decoration-none">Esqueceu sua senha?</a>
                <hr>
                <p class="mb-0">Não tem uma conta? <a href="register" class="text-decoration-none">Registre-se</a></p>
            </div>
        </form>
    </div>
</div>
</body>
</html>
