package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
			p1.nome = "Ana Maria";
			p1.cpf = "999.888.666-77";
			p1.altura = 1.63;
			p1.peso = 75.490;
			p1.telefone = "(11)96523-8888";
			p1.dataNascimento = LocalDate.of(2003, 8, 16);
		
		Paciente p2 = new Paciente();
		    p2.nome = "Roger Ribeiro";
			p2.cpf = "999.888.222-22";
			p2.altura = 1.63;
			p2.peso = 45.200;
			p2.telefone = "(11)948437615";
			p2.dataNascimento = LocalDate.of(2008, 4, 5);
			
			p1.mostrarDados();
			p2.mostrarDados();
					
					
	}

}
