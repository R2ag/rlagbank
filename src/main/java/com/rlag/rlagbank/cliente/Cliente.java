package main.java.com.rlag.rlagbank.cliente;

import main.java.com.rlag.rlagbank.banco.Conta;

import java.util.Date;

public class Cliente {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Endereco enderecoCliente;
    private Conta contaCliente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(Endereco enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }



}
