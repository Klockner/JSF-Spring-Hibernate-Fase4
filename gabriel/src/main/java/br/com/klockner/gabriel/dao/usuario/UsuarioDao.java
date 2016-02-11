/**
 * 
 */
package br.com.klockner.gabriel.dao.usuario;

import org.springframework.stereotype.Component;

import br.com.klockner.gabriel.dao.GenericDao;
import br.com.klockner.gabriel.model.usuario.Usuario;

/**
 * @author Gabriel Klockner
 */
@Component
public class UsuarioDao extends GenericDao<Usuario> {

	@Override
	public void salvar(Usuario obj) {
		super.salvar(obj);
	}
	
	@Override
	public void excluir(Usuario obj) {
		super.excluir(obj);
	}
	
	@Override
	public Class<Usuario> getPersistentClass() {
		return Usuario.class;
	}

}
