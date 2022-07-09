package com.brandon.springtutorial;

import org.springframework.stereotype.Repository;

@Repository
public class RepoAlumno {
    private String nombre;
    public RepoAlumno() {
    }

    public String getNombre() {
        return "hhhhhhh";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
