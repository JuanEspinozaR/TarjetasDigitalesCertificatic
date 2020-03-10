package org.certificatic.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetaDigital.model.Tarjeta;

@WebService
public interface TarjetaService {
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
