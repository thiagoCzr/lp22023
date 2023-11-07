/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.classes;

import projetovendas.interfaces.IPesquisar;



/**
 *
 * @author aluno
 */
public class Fornecedor extends Pessoa {
    private boolean  status;


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "status=" + status + '}';
    }
    
    
    
    
}
