/**
 * 
 */
package br.com.klockner.gabriel.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * @author Gabriel Klockner
 */

@ManagedBean
public class RecuperarSenhaController {
	private String email;
	
	//TODO INTEGRAR COM BD
	public String recuperarSenha() {
		if (email != null) {
			FacesContext.getCurrentInstance().addMessage(null, 
					new FacesMessage(FacesMessage.SEVERITY_WARN, 
							"Solicitação de troca de senha realizada com sucesso. Verifique seu email.", null));
			return "";
		}
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_WARN, "Email não cadastrado.", null));
		return "";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
