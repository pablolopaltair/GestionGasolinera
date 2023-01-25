/**
 * 
 */
package dto;

import java.util.Calendar;
import org.springframework.stereotype.Component;

/**
 * @author Pablo
 *
 */
@Component
public class RepostajeGasolineraDTO {

	// ATRIBUTOS

	private Integer id_repostaje;
	private Integer importe_repostaje;
	private String dni_repostaje;
	private String matricula_repostaje;
	private Calendar fch_repostaje;

	
	//CONSTRUCTOR
	// TIPO NORMAL
	public RepostajeGasolineraDTO(Integer importe_repostaje, Calendar fch_repostaje) {
		super();
		this.fch_repostaje = fch_repostaje;
		this.importe_repostaje = importe_repostaje;
	}

	// TIPO FACTURA
	public RepostajeGasolineraDTO(Integer importe_repostaje, String dni_repostaje, String matricula_repostaje,
			Calendar fch_repostaje) {
		super();
		this.importe_repostaje = importe_repostaje;
		this.dni_repostaje = dni_repostaje;
		this.matricula_repostaje = matricula_repostaje;
		this.fch_repostaje = fch_repostaje;
	}
	
	
	
	//GETTERS Y SETTERS

	public RepostajeGasolineraDTO() {
		super();
	}

	public Integer getId_repostaje() {
		return id_repostaje;
	}

	public void setId_repostaje(Integer id_repostaje) {
		this.id_repostaje = id_repostaje;
	}

	public Integer getImporte_repostaje() {
		return importe_repostaje;
	}

	public void setImporte_repostaje(Integer importe_repostaje) {
		this.importe_repostaje = importe_repostaje;
	}

	public String getDni_repostaje() {
		return dni_repostaje;
	}

	public void setDni_repostaje(String dni_repostaje) {
		this.dni_repostaje = dni_repostaje;
	}

	public String getMatricula_repostaje() {
		return matricula_repostaje;
	}

	public void setMatricula_repostaje(String matricula_repostaje) {
		this.matricula_repostaje = matricula_repostaje;
	}

	public Calendar getFch_repostaje() {
		return fch_repostaje;
	}

	public void setFch_repostaje(Calendar fch_repostaje) {
		this.fch_repostaje = fch_repostaje;
	}

	
	//TOSTRING
	@Override
	public String toString() {
		return "Datos del repostaje introducido: ID: [" + id_repostaje + "]   IMPORTE: [" + importe_repostaje
				+ "]    DNI: [" + dni_repostaje + "]    MATRICULA: [" + matricula_repostaje
				+ "]    FECHA: [" + fch_repostaje + "]";
	}

	
	
	
	

}
