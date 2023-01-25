/**
 * 
 */
package dto;

import java.util.Calendar;

/**
 * @author Pablo
 *
 */
public interface ADtoServicio {

	public RepostajeGasolineraDTO ARepostajeGasolineraDTONormal (Calendar fch_repostaje, int importe_repostaje);
	public RepostajeGasolineraDTO ARepostajeGasolineraDTOFactura (Calendar fch_actual, int importe_repostaje, 
																  String dni_repostaje, String matricula_repostaje);
}
