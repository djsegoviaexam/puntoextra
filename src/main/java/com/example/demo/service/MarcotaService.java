package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mascota;
import com.example.demo.repository.MascotaRepository;

@Service
public class MarcotaService {


    @Autowired
	private MascotaRepository repositorio;
	
	public List<Mascota> listarMascota()
	{
		return repositorio.findAll();
	}
	
	public void guardarMascota(Mascota producto)
	{
		repositorio.save(producto);
	}
	
	public void eliminarMascota (Integer id)
	{
		repositorio.deleteById(id);
		
	}


    public Mascota obtenerMascotaPorId (Integer id)
	{
		
		return repositorio.findById(id).get();
		
	}
	

}
