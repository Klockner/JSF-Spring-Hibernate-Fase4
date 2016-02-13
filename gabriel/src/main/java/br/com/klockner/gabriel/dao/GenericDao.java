/**
 * 
 */
package br.com.klockner.gabriel.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import br.com.klockner.gabriel.util.HibernateUtil;

/**
 * @author Gabriel Klockner
 */
@Transactional
public abstract class GenericDao<T> {
	
//	public abstract Class<T> getPersistentClass();
	
	@Transactional
	public void salvar(T obj) {
		executarTransacao("salvar", obj);
	}
	
	public void executarTransacao(String tipoTransacao, T obj) {
		Session sessao = null;
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			sessao.beginTransaction();
			switch (tipoTransacao) {
				case "salvar":
					sessao.save(obj);
					break;
				case "excluir":
					sessao.delete(obj);
					break;
				default:
					System.out.println("Tipo de transação não existe.");
			}
			sessao.getTransaction().commit();
		} catch (HibernateException e) {
			System.out.println("Nao foi possivel inserir o contato. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de inserção. Mensagem: " + e.getMessage());
			}
		}
	}
	
	@Transactional
	public void excluir(T obj) {
//		obj = (T) getSessionFactory().getCurrentSession().merge(obj);
//		getSessionFactory().getCurrentSession().delete(obj);
	}
	
//	public String getNomeTabela() {
//		return getPersistentClass().getSimpleName();
//	}
	
//	@SuppressWarnings("unchecked")
//	public T consultarPorId(Integer id) {
//		try {
//			return (T) entityManager.createQuery("select t from " + getNomeTabela() + " t where t.id =:id").getResultList();
//		} catch(NoResultException e) {
//			return null;
//		}
//	}
}
