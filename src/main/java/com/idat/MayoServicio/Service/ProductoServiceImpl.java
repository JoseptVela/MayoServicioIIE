package com.idat.MayoServicio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicio.Model.Productos;
import com.idat.MayoServicio.Repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository repository;

	@Override
	public void guardarProducto(Productos producto) {
		repository.guardarProducto(producto);
	}

	@Override
	public void actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
