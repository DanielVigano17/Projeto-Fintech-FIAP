package br.com.fintech.fintechfiap.model;

public class Usuario {
    private int cdUsuario;
    private String nome;
    private String senha;
    private String email;
    private String cpf;
    private float saldo;

    // Construtor padrão
    public Usuario() {}

    // Construtor com parâmetros
    public Usuario(int cdUsuario, String nome, String senha, String email, String cpf, float saldo) {
        this.cdUsuario = cdUsuario;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    // Getters e Setters
    public int getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(int cdUsuario) {
        this.cdUsuario = cdUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Método para exibir informações do usuário (opcional)
    @Override
    public String toString() {
        return "Usuario{" +
                "cdUsuario=" + cdUsuario +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

