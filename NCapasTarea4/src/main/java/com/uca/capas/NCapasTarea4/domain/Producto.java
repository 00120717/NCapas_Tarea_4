package com.uca.capas.NCapasTarea4.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Producto {
	
	@Size(min = 12,max = 12, message = "Codigo de Producto universal tiene que ser 12 digitos exactos")
	String codigo;
	@Size(min=1,max=100,message = "El campo Nombre del producto debe tener de 1 a 100 caracteres ")
	String nombreProducto;
	@Size(min=1,max=100,message = "El campo Marca debe tener de 1 a 100 caracteres")
	String marca;
	@Size(min=1,max=500,message = "El campo Descripcion debe tener de 1 a 500 caracteres")
	String descripcion;
	String existencia;
	@Pattern(regexp = "^([0-2][0-9]|3[0-1])(\\/)(0[1-9]|1[0-2])(\\/)(\\d{4})$",message = "El campo fecha debe ser en formato dd/mm/yyyy")
	String fechaIngreso;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getExistencia() {
		return existencia;
	}
	public void setExistencia(String existencia) {
		this.existencia = existencia;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
}
