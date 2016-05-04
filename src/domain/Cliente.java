/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import excecao.ClienteInvalidoException;

/**
 *
 * @author hiarl
 */
public abstract class Cliente {
    private long idCliente;
    private String nome;
    private String endereco;
    private String telefone;
    private String login;
    private String senha;

    public Cliente() {
    }

    public Cliente(long idCliente, String nome, String endereco, String telefone, String login, String senha) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
    }

    /**
     * @return the idCliente
     */
    public long getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public abstract boolean validarCliente() throws ClienteInvalidoException;

    
}
