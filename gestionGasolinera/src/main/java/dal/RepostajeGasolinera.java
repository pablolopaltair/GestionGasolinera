package dal;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "dlk_repostajeGasolinera", schema = "dlk_gestionGasolinera")
public class RepostajeGasolinera {

	// ATRIBUTOS DE LA TABLA REPOSTAJES
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_repostaje", unique = true, nullable = false)
	private Integer id_repostaje;
	
	@Column(name = "importe_repostaje", nullable = false)
	private Integer importe_repostaje;
	
	@Column(name = "dni_repostaje", nullable = true)
	private String dni_repostaje;
	
	@Column(name = "matricula_repostaje", nullable = true)
	private String matricula_repostaje;
	
	@Column(name = "fch_repostaje", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fch_repostaje;

	
	
	// GETTERS Y SETTERS
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

	@Override
	public String toString() {
		return "Datos del repostaje introducido: ID: [" + id_repostaje + "]   IMPORTE: [" + importe_repostaje
				+ "]    DNI: [" + dni_repostaje + "]    MATRICULA: [" + matricula_repostaje
				+ "]    FECHA: [" + fch_repostaje + "]";
	}


	

	// TOSTRING

	

}
