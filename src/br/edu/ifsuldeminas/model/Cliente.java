/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.model;

/**
 *
 * @author Marcos
 */
public class Cliente {

    private int id;
    private String name;
    private String adress;
    private String district;
    private String city;
    private String state;
    private String cep;
    private String gender;
    private String cellphoneNumber;
    private String telephoneNumber;
    private String email;
    private String birthday;
    private String registerDate;

    public Cliente(int id, String name, String adress, String district, String city, String state, String cep, String gender, String cellphoneNumber, String telephoneNumber,
            String email, String birthday, String registerDate) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.district = district;
        this.city = city;
        this.state = state;
        this.cep = cep;
        this.gender = gender;
        this.cellphoneNumber = cellphoneNumber;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.birthday = birthday;
        this.registerDate = registerDate;
    }
    
    public Cliente(){}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @return the cellphoneNumber
     */
    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    /**
     * @return the telephoneNumber
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @return the registerDate
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @param cellphoneNumber the cellphoneNumber to set
     */
    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    /**
     * @param telephoneNumber the telephoneNumber to set
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @param registerDate the registerDate to set
     */
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }
}
