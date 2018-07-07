/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import br.edu.ifsuldeminas.model.Cliente;
import br.edu.ifsuldeminas.view.ViewRegister;

/**
 *
 * @author Marcos
 */
public class ControllerCustomerList {

    public int searchForNameDelete(String name, LinkedList<Cliente> customers) {
        for (int i = 0; i < customers.size(); i++) {
            if (name.equals(customers.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
    public ArrayList<Integer> searchForName(String name, LinkedList<Cliente> customers) {
        ArrayList<Integer> itens = new ArrayList<Integer>();
        for (int i = 0; i < customers.size(); i++) {
            if (name.equals(customers.get(i).getName())) {
                itens.add(i);
            }
        }
        return itens;
    }
}
