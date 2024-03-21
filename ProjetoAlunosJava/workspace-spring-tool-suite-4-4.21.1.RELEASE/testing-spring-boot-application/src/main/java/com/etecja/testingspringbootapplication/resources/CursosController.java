package com.etecja.testingspringbootapplication.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.etecja.testingspringbootapplication.entidades.Cursos;





public class CursosController {
	
	@GetMapping("/cursos")
	public String findAll (Model model) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyy");
		Cursos c = new Cursos(1, "Desenvolvimento de Sistemas", "S", sf.parse("21/03/2024"), null);
		model.addAttribute("cursos", c);
		return "cursos";
	}
	

}
