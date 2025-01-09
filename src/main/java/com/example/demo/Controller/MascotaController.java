package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Mascota;
import com.example.demo.service.MarcotaService;


@RestController
@RequestMapping("/api/v1")
public class MascotaController {


    @Autowired
	private MarcotaService servicio;
	//Metodo GET para listarproductos	
	@GetMapping ("/mascota")
	public List<Mascota> listarProducto ()
	{
		return servicio.listarMascota();
	}

	
	//Metodo POST para guardar productos
	@PostMapping ("/mascota")
	public Mascota guardarMascota(@RequestBody Mascota producto)
	{
		 servicio.guardarMascota(producto);
		 return producto;
	}




	//Metodo PUT para actualizar productos
	@PutMapping ("/mascota/{id}")
	public Mascota actualizarProducto(@RequestBody Mascota producto, @PathVariable Integer id)
	{
		Mascota productoExistente = servicio.obtenerMascotaPorId(id);
		servicio.guardarMascota(producto);		
		return productoExistente;
	}


	//Metodo DELETE para borrar productos
	@DeleteMapping ("/mascota/{id}")
	public void eliminarMascota (@PathVariable Integer id)
	{
		servicio.eliminarMascota(id);		
	}
}
