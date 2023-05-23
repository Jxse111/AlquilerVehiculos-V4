package ficheros;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import dominio.Autobus;
import dominio.Vehiculo;
import negocio.IVehiculos;

public abstract class Vehiculos implements IVehiculos {

	public Vehiculos() {
		super();
	}

	@Override
	public List<Vehiculo> get() {
		return Vehiculo;
	}

	 public static Singleton getInstance(String Vehiculos) {
	        if (Vehiculos == null) {
	        	Vehiculos = new Singleton(Vehiculos);
	        }
	        return Vehiculos;
	 }
	 private void leerDom(vehiculos.xml Document) {
			
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

	public static Vehiculos getInstancia() {
		// TODO Auto-generated method stub
		return null;
	}

}