package br.usjt.hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.hellospringboot.model.Temperatura;
import br.usjt.hellospringboot.repository.TemperaturasRepository;
import br.usjt.hellospringboot.service.TemperaturasService;

@Controller
public class TemperaturaController {
	//@Autowired
	//private TemperaturasRepository temperaturasRepo;
	
	@Autowired
	private TemperaturasService service;


	@GetMapping("/temperaturas")
	public ModelAndView listarTemperaturas() {
		
		ModelAndView mv = new ModelAndView("lista_temperaturas");
		mv.addObject(new Temperatura());
		List<Temperatura> temperaturas = service.listarTodos();
		mv.addObject("temperaturas", temperaturas);
		
		return mv;
	}
	
	
}
