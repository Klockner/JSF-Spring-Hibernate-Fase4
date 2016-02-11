/**
 * 
 */
package br.com.klockner.gabriel.controller;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Gabriel Klockner
 */
@ManagedBean
@RequestScoped
public class LoginController {
	private static final String EMAIL_ADMIN = "admin";
	private static final String SENHA_ADMIN = "admin";
	
	private String email;
	private String senha;
	
	public String logar() {
		if (EMAIL_ADMIN.equals(email)&& SENHA_ADMIN.equals(senha)) {
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
			Map<String, Object> sessionMap = externalContext.getSessionMap();
			sessionMap.put("email", email);
			return "welcome.xhtml?faces-redirect=true";
		}
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_WARN, "Login incorreto",
						"Email ou senha inválido"));
		return "";
	}
	
	//TODO ARRUMAR DEPOIS COM NOME DO USUARIO
	public String getUserName() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		return (String) sessionMap.get("email");
	}
	
	public String sair() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "login.xhtml?faces-redirect=true";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
