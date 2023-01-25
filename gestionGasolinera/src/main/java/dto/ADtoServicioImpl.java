/**
 * 
 */
package dto;

import java.util.Calendar;


import org.springframework.stereotype.*;

import dal.RepostajeGasolinera;

/**
 * @author Pablo
 *
 */
@Service
public class ADtoServicioImpl implements ADtoServicio{

	@Override
	public RepostajeGasolineraDTO ARepostajeGasolineraDTONormal(Calendar fch_repostaje, int importe_repostaje) {

		RepostajeGasolineraDTO DTO = new RepostajeGasolineraDTO (importe_repostaje, fch_repostaje);
		return DTO;
	}

	@Override
	public RepostajeGasolineraDTO ARepostajeGasolineraDTOFactura(Calendar fch_repostaje, int importe_repostaje,
			String dni_repostaje, String matricula_repostaje) {
		// TODO Auto-generated method stub
		
		RepostajeGasolineraDTO DTO = new RepostajeGasolineraDTO (importe_repostaje, fch_repostaje);
		return null;
	}
	
	

}
