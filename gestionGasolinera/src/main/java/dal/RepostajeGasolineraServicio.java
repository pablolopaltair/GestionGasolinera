package dal;

import java.util.List;

public interface RepostajeGasolineraServicio {
	
	public void insertarRepostaje(RepostajeGasolinera repostajeGasolinera);
	public List<RepostajeGasolinera> busquedaRepostaje();

}
