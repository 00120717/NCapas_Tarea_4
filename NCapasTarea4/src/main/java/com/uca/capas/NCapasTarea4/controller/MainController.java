package com.uca.capas.NCapasTarea4.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.NCapasTarea4.domain.Producto;

@Controller
public class MainController {
	
	@RequestMapping("/producto")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto",new Producto());
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/data")
	public ModelAndView procesar(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("index");
		}else {
			mav.addObject("productSaved",producto.getNombreProducto());
			mav.setViewName("resultado");
			return mav;
		}
		return mav;
	}
	
}
