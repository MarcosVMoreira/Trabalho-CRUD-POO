/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.banco;

import br.edu.ifsuldeminas.model.Cliente;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo Franco
 */
public class BancoDeDados {

	private static List<Cliente> clientes;
	
	static {
            clientes = new ArrayList<Cliente>();
	}
			
	public static List<Cliente> getClientes(){
            return clientes;
	}
	
}
