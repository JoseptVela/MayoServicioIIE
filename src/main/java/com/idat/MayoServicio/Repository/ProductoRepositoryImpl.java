package com.idat.MayoServicio.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.MayoServicio.Model.Productos;

@Repository
public class ProductoRepositoryImpl implements ProductoRepository{
	
	public List<Productos> listar = new ArrayList<Productos>();

	@Override
	public void guardarProducto(Productos producto) {
		listar.add(producto);
	}

	@Override
	public void actualizarProducto(Productos producto) {
		Productos p = obtenerProductoId(producto.getIdProducto());
		listar.remove(p);
		listar.add(producto);
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
		if (listar!=null) 
		{
			for(Productos productos : listar) 
			{
			 if(productos.getIdProducto()==id) 
			 {
				return productos; 
			 }	
			}
		}
		return null;
		
		//return listar.stream().filter(p -> p.getIdProductos() == id ).findFirst().orElse(null);
		
	}
	

}
