/**
 * 
 */
package br.com.klockner.gabriel.service.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.klockner.gabriel.dao.GenericDao;
import br.com.klockner.gabriel.dao.usuario.UsuarioDao;
import br.com.klockner.gabriel.model.usuario.Usuario;

/**
 * @author Gabriel Klockner
 */
@Service
public class UsuarioService extends GenericService<Usuario>{
	
	@Autowired
	protected UsuarioDao usuarioDao;

	//ERRO AQUI COM ESSE USUARIODAO /\
	public void salvar(Usuario usuario) {
		usuarioDao.salvar(usuario);
	}
	
	@Override
	public void excluir(Usuario obj) {
		super.excluir(obj);
	}
	
	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	//Método pra passar o objeto dao
	@Override
	public GenericDao<Usuario> getDAO() {
		return usuarioDao;
	}

}
