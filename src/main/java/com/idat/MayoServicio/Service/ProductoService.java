package com.idat.MayoServicio.Service;

import java.util.List;

import com.idat.MayoServicio.Model.Productos;

public interface ProductoService {
	
void guardarProducto(Productos producto);
	
	void actualizarProducto(Productos producto);
	
	void eliminarProducto(Integer id);

	List<Productos> listarProductos(); 
	
	Productos obtenerProductoId(Integer id);

}
