package com.calculo.jsfBeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.calculo.data.Calculo;

@ManagedBean
@SessionScoped
public class ViewCalculoMB {
	private List<Calculo> calculos = new ArrayList<Calculo>();

	public ViewCalculoMB() {

	}

	public void calcular() {
		//Ordernar
		//calcular permutaciones
		// - calcular indice
		//Guardar
	}

	public List<Calculo> getCalculos() {
		return calculos;
	}

	public void setCalculos(List<Calculo> calculos) {
		this.calculos = calculos;
	}

}
