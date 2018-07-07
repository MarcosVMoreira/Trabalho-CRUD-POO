/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.controller;

/**
 *
 * @author Marcos
 */
public class ControllerEdit {

    public void saveEdit(int i, String name, String adress, String district, String city, String state, String cep, String gender, String cellphoneNumber, String telephoneNumber,
            String email, String birthday, String registerDate) {
        ControllerCliente.customers.get(i).setName(name);
        ControllerCliente.customers.get(i).setAdress(adress);
        ControllerCliente.customers.get(i).setDistrict(district);
        ControllerCliente.customers.get(i).setCity(city);
        ControllerCliente.customers.get(i).setState(state);
        ControllerCliente.customers.get(i).setCep(cep);
        ControllerCliente.customers.get(i).setGender(gender);
        ControllerCliente.customers.get(i).setCellphoneNumber(cellphoneNumber);
        ControllerCliente.customers.get(i).setTelephoneNumber(telephoneNumber);
        ControllerCliente.customers.get(i).setEmail(email);
        ControllerCliente.customers.get(i).setBirthday(birthday);
        ControllerCliente.customers.get(i).setRegisterDate(registerDate);

    }

}
