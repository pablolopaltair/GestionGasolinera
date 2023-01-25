/**
 * 
 */
package dto;




import dal.RepostajeGasolinera;
/**
 * @author Pablo
 *
 */
public class ADaoServicioImpl implements ADaoServicio {
	
	@Override
	public RepostajeGasolinera RepostajeGasolineraNormalDTODAO (RepostajeGasolineraDTO repostajeGasolineraDTO) {
		
		RepostajeGasolinera repostajeGasolinera = new RepostajeGasolinera();
		if(repostajeGasolineraDTO != null) {
	
			repostajeGasolinera.setImporte_repostaje(repostajeGasolineraDTO.getImporte_repostaje());
			repostajeGasolinera.setFch_repostaje(repostajeGasolineraDTO.getFch_repostaje());
			repostajeGasolinera.setDni_repostaje(repostajeGasolineraDTO.getDni_repostaje());
			repostajeGasolinera.setMatricula_repostaje(repostajeGasolineraDTO.getMatricula_repostaje());
			
		}
		return repostajeGasolinera;
		
	}

}
