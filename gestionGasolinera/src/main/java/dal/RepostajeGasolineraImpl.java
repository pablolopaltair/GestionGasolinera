/**
 * 
 */
package dal;

import java.util.List;
import javax.persistence.*;

import org.springframework.stereotype.Component;



/**
 * @author Pablo
 *
 */

@Component
public class RepostajeGasolineraImpl {
	@PersistenceContext
	private EntityManager em;
	
	public void insertarRepostaje(RepostajeGasolinera repostajeGasolinera) {
		em.persist(repostajeGasolinera);
		em.clear();
		em.close();
	}

	public List<RepostajeGasolinera> busquedaRepostaje() {
		return em.createQuery("SELECT repostaje FROM PagosRepostaje repostaje").getResultList();
	}

}
