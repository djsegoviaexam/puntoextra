package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mascota {

    @Id
    private Integer id;


    private String nombre;

    private String edad;

    private String raza;
    

	public Mascota(Integer id, String nombre, String edad, String raza) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}


    public Mascota() {
		super();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}




}
