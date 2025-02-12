package com.hlc.cliente_uno_a_muchos_pedido.entidad;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import com.github.javafaker.Number;
import com.github.javafaker.Pokemon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Table(name="productos")
@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotBlank
	private String nombre;
	
	@NotBlank
	@NotNull
	private String descripcion;
	
	@NotBlank
	@NotNull
	private float peso; 
	
	@NotBlank
	@NotNull
	private int stock;
	
	@ManyToMany
	@JoinTable(
		    name = "producto_pedido",
		    joinColumns = @JoinColumn(name="producto_id"),
		    inverseJoinColumns = @JoinColumn(name="pedido_id"))
	private List<Pedido> pedidos;

	public Producto() {}

	public Producto(Long id, @NotNull @NotBlank String nombre, @NotBlank @NotNull String descripcion,
			@NotBlank @NotNull float peso, @NotBlank @NotNull int stock, List<Pedido> pedidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
		this.stock = stock;
		this.pedidos = pedidos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
