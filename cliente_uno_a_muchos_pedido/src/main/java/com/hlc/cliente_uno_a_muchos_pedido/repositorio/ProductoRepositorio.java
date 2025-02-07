package com.hlc.cliente_uno_a_muchos_pedido.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hlc.cliente_uno_a_muchos_pedido.entidad.Producto;
import com.hlc.cliente_uno_a_muchos_pedido.entidad.Pedido;


public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

	List<Producto> findByPedidos(List<Pedido> pedidos);
}
