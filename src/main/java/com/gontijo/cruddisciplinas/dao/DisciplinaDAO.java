package com.gontijo.cruddisciplinas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gontijo.cruddisciplinas.dominio.Disciplina;

public class DisciplinaDAO {

	public List<Disciplina> listagem() throws SQLException {
		List<Disciplina> lista = new ArrayList<Disciplina>();
		Connection conexao = FabricaDeConexao.getConnection();
		String sql = "select * from disciplina";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet resultado = stmt.executeQuery();
		while (resultado.next()) {
			Integer id = resultado.getInt("id");
			Integer periodo = resultado.getInt("periodo");
			String nome = resultado.getString("nome");
			String professor = resultado.getString("professor");
			String codigo = resultado.getString("codigo_sala_classroom");
			Disciplina d = new Disciplina(id, periodo, nome, professor, codigo);
			lista.add(d);
		}
		resultado.close();
		stmt.close();
		conexao.close();
		return lista;
	}




}


