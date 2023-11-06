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
public class Cidade implements IOperacao {

    private String nome;
    private int codibge;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodibge() {
        return codibge;
    }

    public void setCodibge(int codibge) {
        this.codibge = codibge;
    }

    @Override
    public void cadastrar() {
    }

    @Override
    public boolean alterar() {
        return false;
    }

    @Override
    public boolean excluir() {
        return false;
    }

    @Override
    public void cancelar() {

    }

}
