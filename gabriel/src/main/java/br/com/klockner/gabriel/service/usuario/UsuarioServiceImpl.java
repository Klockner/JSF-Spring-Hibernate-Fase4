/**
 * 
 */
package br.com.klockner.gabriel.service.usuario;

import org.springframework.stereotype.Service;

import br.com.klockner.gabriel.model.usuario.Usuario;

/**
 * @author Gabriel Klockner
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Override
	public void salvar(Usuario usuario) {
		//TODO salvar usuario no banco
		
	}

	//TODO só testando, apagar depois
	@Override
	public String printMsg() {
		return "Classe Usuario funcionando corretamente";
	}

}
