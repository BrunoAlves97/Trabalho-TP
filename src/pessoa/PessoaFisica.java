/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author BRUNO
 */
public class PessoaFisica extends Pessoa {
    public void Dados(String nome,String email,String cpf){  //atributos, sobrescrevendo as declarações  de atributos para as que vão ser utilizadas na classe pessoa fisica.
        this.nome = nome;
        this.email = email;
        this.doc = cpf;
    }
    
    //declaração métodos
    
    public String RetornarNome(){
        return this.nome;
    }
    
    public String RetornarEmail(){
        return this.email;
    }
    
    public String RetornarCPF(){
        return this.doc;
    }
    
    
      
}
