/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.classes;

import projetovendas.interfaces.IOperacao;

/**
 *
 * @author aluno
 */
public class Pessoa implements IOperacao {

    private String nome;
    private String tipoPessoa;
    private String email;
    private int contador;

    protected Endereco endereco;

    @Override
    public void cadastrar() {

    }

    @Override
    public boolean alterar() {
        return true;
    }

    @Override
    public boolean excluir() {
        return true;
    }

    @Override
    public void cancelar() {
    }

    public void salvar() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    

}
