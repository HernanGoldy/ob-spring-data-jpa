package com.example;

/*
En los modelos Entidad-Relación (ER) de las Bases de Datos (DB), a las «TABLAS» se las conoce como «ENTIDADES».
Para indicarle a Spring que una clase va a ser una entidad y que se guardará en una DB se le agregan una serie de «notaciones».
Ej:
@Entity -> Le indica a Spring que una clase va a ser una entidad.
@Id -> Le indica a Spring que una clase va a ser una Primary Key (PK).
@GeneratedValue -> Le indica a Spring que el ID será Auto incremental (AI).
*/

import jakarta.persistence.*;

@Entity
public class Coche {

    // atributos encapsulados (características)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String manufactura;
    private String modelo;
    private Integer anio;

    // constructores
    public Coche() {
    }

    public Coche(Long id, String manufacturer, String model, Integer year) {
        this.id = id;
        this.manufactura = manufacturer;
        this.modelo = model;
        this.anio = year;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufactura;
    }

    public void setManufacturer(String manufacturer) {
        this.manufactura = manufacturer;
    }

    public String getModel() {
        return modelo;
    }

    public void setModel(String model) {
        this.modelo = model;
    }

    public Integer getYear() {
        return anio;
    }

    public void setYear(Integer year) {
        this.anio = year;
    }


    // toString
    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacturer='" + manufactura + '\'' +
                ", model='" + modelo + '\'' +
                ", year=" + anio +
                '}';
    }
}
