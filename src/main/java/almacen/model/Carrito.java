package almacen.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Carrito {
	
	@EmbeddedId
	private Long id;
	@Column
	private Producto producto;
	@Column
	private Cliente cliente;
	@Column
	private Timestamp fecha;
	@Column
	private Integer cantidad;
	@Column
	private float precio;
	
	public Carrito() {
		super();
	}

	public Carrito(Producto producto, Cliente cliente, Timestamp fecha, Integer cantidad, float precio) {
		super();
		this.producto = producto;
		this.cliente = cliente;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	
}
