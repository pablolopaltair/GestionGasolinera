/**
 * 
 */
package impl;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dal.*;

/**
 * @author Pablo
 *
 */
@Service
public class Consultas {
	
	@Autowired
	private RepostajeGasolineraImpl psi;
	
	//CONSULTAS DEL PAGO DEL REPOSTAJE
	
	@Transactional
	public void insertarRepostaje(RepostajeGasolinera repostajeGasolinera) {
		psi.insertarRepostaje(repostajeGasolinera);
	}
	
	@Transactional
	public void insertarListaRepostajes(Collection<RepostajeGasolinera> repostajeGasolinera){
		for (RepostajeGasolinera pagosRepostaje : repostajeGasolinera) {
			psi.insertarRepostaje(pagosRepostaje);
		}
	}
	
	@Transactional
	public List<RepostajeGasolinera> busquedaRepostaje() {
		return psi.busquedaRepostaje();
	}
	
	

}
