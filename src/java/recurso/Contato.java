/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author caioc
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Contato {
    private String nome;
    private String email;
    
    public Contato() {}
    
    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
