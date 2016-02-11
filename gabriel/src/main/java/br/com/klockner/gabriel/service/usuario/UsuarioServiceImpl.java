/**
 * 
 */
package br.com.klockner.gabriel.service.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.klockner.gabriel.dao.usuario.UsuarioDao;
import br.com.klockner.gabriel.model.usuario.Usuario;

/**
 * @author Gabriel Klockner
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public void salvar(Usuario usuario) {
		// Implementar lógica de negócio
		usuarioDao.salvar(usuario);
	}
	
	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
}
