package org.certificatic.tarjetaDigital.repository;

import java.util.ArrayList;
import java.util.List;

import org.certificatic.tarjetaDigital.model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository{

	private static List<Tarjeta> tarjetasDigitales 
				= new ArrayList <Tarjeta >();
	 
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		System.out.println(":::::CREAR TARJETA :::::::");
		tarjetasDigitales.add(tarjeta);
		return tarjeta; 
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		System.out.println(":::::OBTENER TARJETAS :::::::");
		return tarjetasDigitales;
	}

}
