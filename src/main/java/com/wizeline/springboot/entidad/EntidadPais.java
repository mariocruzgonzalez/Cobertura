/*
 * Copyright (c) 2022 Wizeline
 * All rights reserved.
 */

package com.wizeline.springboot.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author orlando.rincon@wizeline.com
 */
@Entity(name = "paises")
public class EntidadPais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    @Column(nullable = false)
    private Integer poblacion;

    // Added for tests only
    public EntidadPais () {
    }

    public EntidadPais (Long id, String nombre, Integer poblacion) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String obtenerNombre () {
        return this.nombre;
    }

    public Integer obtenerPoblacion () {
        return this.poblacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntidadPais that = (EntidadPais) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(nombre, that.nombre)) return false;
        return Objects.equals(poblacion, that.poblacion);
    }

}
