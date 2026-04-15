package ejerciciostema5;

import java.util.Calendar;

public class Prestamo {

	private Cliente cliente;
	private int codigoPelicula;
	private Calendar fechaPrestamo;
	private Calendar fechaDevolucion;

	public Prestamo(Cliente cliente, int codigoPelicula, Calendar fechaPrestamo) {
		super();
		this.cliente = cliente;
		this.codigoPelicula = codigoPelicula;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getCodigoPelicula() {
		return codigoPelicula;
	}

	public void setCodigoPelicula(int codigoPelicula) {
		this.codigoPelicula = codigoPelicula;
	}

	public Calendar getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Calendar fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Calendar getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Calendar fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	@Override
	public String toString() {
		return "Prestamo [cliente=" + cliente + ", codigoPelicula=" + codigoPelicula + ", fechaPrestamo="
				+ fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + "]";
	}
}
