package br.com.universidade.aplicacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Curso;
import br.com.universidade.modelo.Professor;
import br.com.universidade.modelo.Turma;
import br.com.universidade.modelo.Unidade;
import br.com.universidade.util.Magica;

public class aplicacaoUniversidade {

	public static void main(String[] args) {
		
		Turma turma = new Turma(
				Magica.s("Sigla"),
				Magica.s("Periodo"),
				Magica.s("Sala"),
				new Aluno(
						Magica.i("RM"),
						Magica.s("Fone"),
						Magica.s("Nome"),
						Magica.b("Est� ativo?")
						),
				new Professor(
						Magica.s("Nome"),
						Magica.f("Valor Hora"),
						Magica.s("Forma��o"),
						Magica.s("Area"),
						Magica.s("Email")
						),
				new Curso(
						Magica.s("Descri��o"),
						Magica.i("Carga Horaria"),
						Magica.f("Valor"),
						new Unidade(
								Magica.s("Nome"),
								Magica.s("Bairro"),
								Magica.s("Telefone")
								)
						)
				);

		
		System.out.println(turma.toString());
		
	}

}
