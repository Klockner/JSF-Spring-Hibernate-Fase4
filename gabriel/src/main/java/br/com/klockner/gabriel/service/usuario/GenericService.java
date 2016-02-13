/**
 * 
 */
package br.com.klockner.gabriel.service.usuario;

import java.util.Collection;

import br.com.klockner.gabriel.dao.GenericDao;

/**
 * @author Gabriel Klockner
 */
public abstract class GenericService<T> {
	
	public abstract GenericDao<T> getDAO();
	
	public void salvar(T obj) {
		getDAO().salvar(obj);
	}
	
	public void excluir(T obj) {
		getDAO().excluir(obj);
	}
	
	public void excluirObjetos(Collection<T> objs) {
		for (T t : objs) {
			getDAO().excluir(t);
		}
	}
}
