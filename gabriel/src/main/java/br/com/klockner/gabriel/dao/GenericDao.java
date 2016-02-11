/**
 * 
 */
package br.com.klockner.gabriel.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author Gabriel Klockner
 */
@Transactional
public abstract class GenericDao<T> {
	
	public abstract Class<T> getPersistentClass();
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	@Transactional
	public void salvar(T obj) {
		entityManager.merge(obj);
	}
	
	@Transactional
	public void excluir(T obj) {
		obj = entityManager.merge(obj);
		entityManager.remove(obj);
	}
	
	public String getNomeTabela() {
		return getPersistentClass().getSimpleName();
	}
	
	@SuppressWarnings("unchecked")
	public T consultarPorId(Integer id) {
		try {
			return (T) entityManager.createQuery("select t from " + getNomeTabela() + " t where t.id =:id").getResultList();
		} catch(NoResultException e) {
			return null;
		}
	}
}
