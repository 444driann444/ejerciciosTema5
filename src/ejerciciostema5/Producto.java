package ejerciciostema5;

public class Producto {
	
	private String nombre;
	private float precio;
	private int ventas;
	
	public Producto(String nombre, float precio, int ventas) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.ventas = ventas;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getVentas() {
		return ventas;
	}
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	@Override
	public String toString() {
		return "\n\tProducto [nombre=" + nombre + ", precio=" + precio + ", ventas=" + ventas + "]";
	}
	
	
	
	
	
}
