package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.ficheros;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Autobus;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Vehiculo;

public class Vehiculos implements IVehiculos {

	public Vehiculos() {
		super();
	}

	@Override
	public List<Vehiculo> get() {
		return Vehiculo;
	}

	@Override
	public int getCantidad() {

		int cantidadElementos = 0;
		for (Autobus Vehiculo : coleccionVehiculo) {

			cantidadElementos++;
		}

		return cantidadElementos;
	}

	@Override
	public void insertar(Vehiculo vehiculo) throws OperationNotSupportedException {

		if (vehiculo == null) {
			throw new NullPointerException("ERROR: No se puede insertar un vehiculo nulo.");
		}

		if (vehiculo.contains(vehiculo)) {
			vehiculo.add(vehiculo);
		} else {
			throw new OperationNotSupportedException("ERROR: Ya existe un vehiculo con esa matrícula.");
		}
	}

	@Override
	public Vehiculo buscar(Vehiculo vehiculo) {

		if (vehiculo == null) {
			throw new NullPointerException("ERROR: No se puede buscar un vehiculo nulo.");
		}

		if (!coleccionvehiculo.contains(vehiculo)) {
			vehiculo = null;
		}
		return vehiculo;

	}

	@Override
	public void borrar(Autobus vehiculo) throws OperationNotSupportedException {

		if (vehiculo == null) {
			throw new NullPointerException("ERROR: No se puede borrar un vehiculo nulo.");
		}

		if (coleccionvehiculo.contains(vehiculo)) {

			coleccionvehiculo.remove(vehiculo);

		} else {
			throw new OperationNotSupportedException("ERROR: No existe ningún vehiculo con esa matrícula.");
		}

	}

}