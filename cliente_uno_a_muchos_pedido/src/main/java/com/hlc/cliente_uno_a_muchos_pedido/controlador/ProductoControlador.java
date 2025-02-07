package com.hlc.cliente_uno_a_muchos_pedido.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hlc.cliente_uno_a_muchos_pedido.servicio.PedidoServicio;

@Controller
@RequestMapping("/productos")
public class ProductoControlador {

	private ProductoServicio productoServicio;
	
	@Autowired
	private PedidoServicio pedidoServicio;
}
