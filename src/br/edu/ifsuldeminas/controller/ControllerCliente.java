/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.controller;

import java.util.LinkedList;
import br.edu.ifsuldeminas.model.Cliente;

/**
 *
 * @author Marcos
 */
public class ControllerCliente {

    public static LinkedList<Cliente> customers = new LinkedList();

    public void saveCustomer(String name, String adress, String district, String city, String state, String cep, String gender, String cellphoneNumber, String telephoneNumber,
            String email, String birthday, String registerDate) {
        Cliente modelRegister = new Cliente(customers.size(), name, adress, district, city, state, cep, gender, cellphoneNumber, telephoneNumber, email, birthday, registerDate);
        customers.add(modelRegister);
    }

    public int getId() {
        return customers.size();
    }

}
