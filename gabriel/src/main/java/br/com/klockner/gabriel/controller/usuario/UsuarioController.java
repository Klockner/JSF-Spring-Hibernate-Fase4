/**
 * 
 */
package br.com.klockner.gabriel.controller.usuario;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.klockner.gabriel.model.usuario.Usuario;
import br.com.klockner.gabriel.service.usuario.UsuarioService;

/**
* A @SessionScoped: The session scope persists from the time that a session is established
* until session termination.
* A @RequestScoped: The request scope is short-lived. It starts when an HTTP request 
* is submitted and ends after the response is sent back to the client.
* An @ApplicationScoped: The application scope persists for the entire duration of the
* web application. That scope is shared among all requests and all sessions.
* A @ViewScoped: View scope was added in JSF 2.0. A bean in view scope persists while the 
* same JSF page is redisplayed. (The JSF specification uses the term view for a JSF page.) As soon as the user navigates to a different page, the bean goes out of scope.
* 
* @author Gabriel Klockner
*/

@Component("usuarioController")
@Scope("session")
public class UsuarioController {
	private Usuario usuario = new Usuario();
	
	@Autowired
	private UsuarioService usuarioService;

	public void salvar() {
		usuarioService.salvar(usuario);
		//TODO verificar se usuario ja existe no banco e mandar mensagem de erro
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, 
						"Cadastro realizado com sucesso.", null));
	}
	
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
