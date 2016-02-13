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
	
	//JA FAZ PARTE DA CLASSE POIS ESTENDEU GENERIC DAO
//	@Override
//	public void excluir(Usuario obj) {
//		// TODO Auto-generated method stub
//		super.excluir(obj);
//	}
//	
//	@Override
//	public void salvar(Usuario obj) {
//		// TODO Auto-generated method stub
//		super.salvar(obj);
//	}
}
