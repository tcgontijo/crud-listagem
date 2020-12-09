package com.gontijo.cruddisciplinas.controle;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gontijo.cruddisciplinas.dao.DisciplinaDAO;
import com.gontijo.cruddisciplinas.dominio.Disciplina;

@Controller
public class Controlador {


	@GetMapping("/disciplinas")
	public String disciplinasTabela(Model modelo) throws SQLException {
		DisciplinaDAO dao = new DisciplinaDAO();
		List<Disciplina> lista = dao.listagem();
		modelo.addAttribute("lista", lista);
		return "disciplina";
	}
	
}
