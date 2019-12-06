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
public class PessoaJuridica extends Pessoa {
    public void Dados(String razaoSocial,String emailPJ,String cnpj){ //sobrescrevendo atributos para utilização em obj pessoa juridica.
    this.nome = razaoSocial;
    this.email = emailPJ;
    this.doc = cnpj;
    }

    //metodos PJ
    
    public String RetornarRazaoSocial(){
        return this.nome;
    }
    
    public String RetornarEmail(){
        return this.email;
    }
    
    public String RetornarCnpj(){
        return this.doc;
    }
}
