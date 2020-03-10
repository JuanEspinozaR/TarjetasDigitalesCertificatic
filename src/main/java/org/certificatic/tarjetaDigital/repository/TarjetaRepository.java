package org.certificatic.tarjetaDigital.repository;

import java.util.List;

import org.certificatic.tarjetaDigital.model.Tarjeta;

public interface TarjetaRepository {
	/**
	 * Metodo para crear una nueva tarjeta
	 * @param tarjeta
	 * @return tarjetaCreada
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	/**
	 * Metodo para obtener todas las tarjetas
	 * @return
	 */
	List<Tarjeta> obtenerTodas();
}
