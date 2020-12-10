package com.gontijo.cruddisciplinas.controle;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gontijo.cruddisciplinas.dao.DisciplinaDAO;
import com.gontijo.cruddisciplinas.dominio.Disciplina;

@Controller
public class Controlador {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	
	
	@GetMapping("/disciplinas")
	public String disciplinasTabela(Model modelo) throws SQLException {
		DisciplinaDAO dao = new DisciplinaDAO();
		List<Disciplina> lista = dao.listagem();
		modelo.addAttribute("lista", lista);
		return "disciplina";
	}
	
	@GetMapping("/cadastra-disciplina")
	public String mostraForm(Model modelo) {
		modelo.addAttribute("disciplina", new Disciplina());
		return "form-disciplina";
	}
	
	@PostMapping("/cadastra-disciplina")
	public String processaForm(Disciplina disciplina) throws SQLException {
		DisciplinaDAO dao = new DisciplinaDAO();
		dao.inserir(disciplina);
		return "redirect:/disciplinas";
	}
	
}
