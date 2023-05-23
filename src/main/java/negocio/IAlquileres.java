package negocio;

import java.time.LocalDate;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import dominio.Alquiler;
import dominio.Autobus;
import dominio.Cliente;
import dominio.Vehiculo;

public interface IAlquileres {

	List<Alquiler> get();

	List<Alquiler> get(Cliente cliente);

	List<Alquiler> get(Autobus turismo);

	void insertar(Alquiler alquiler) throws OperationNotSupportedException;

	Alquiler buscar(Alquiler alquiler);

	void borrar(Alquiler alquiler) throws OperationNotSupportedException;

	void devolver(Cliente cliente, LocalDate fechaDevolucion) throws OperationNotSupportedException;

	void devolver(Vehiculo vehiculo, LocalDate fechaDevolucion) throws OperationNotSupportedException;

	void comenzar();

	void terminar();

	List<Alquiler> get(Vehiculo vehiculo);

}