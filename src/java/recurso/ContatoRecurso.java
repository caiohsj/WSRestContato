/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurso;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author caioc
 */
@Path("ws")
public class ContatoRecurso {

    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public Contato retornaContato() {
        Contato contato = new Contato("Caio", "caio@gmail.com");
        return contato;
    }
    
    @POST
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public String insereContato(Contato contato) {
        return "<status>Adicionado com sucesso</status>";
    }
}
