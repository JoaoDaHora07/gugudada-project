package com.big.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Client {
    private String name;
    private String email;
    private String cpf;
    private String phone;
    private LocalDate dateOfBirth;

    public Client(String cpf, LocalDate dateOfBirth, String email, String name, String phone) throws ParseException {
        this.cpf = cpf;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public static String convertDateToString(Date dateOfBirth){
        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy", Locale.ENGLISH);
        


        return sdf.format(dateOfBirth);
        

    }

    public static Date convertStringToDate(String dateOfBirth) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy", Locale.ENGLISH);

        return sdf.parse(dateOfBirth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{");
        sb.append("name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", cpf=").append(cpf);
        sb.append(", phone=").append(phone);
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append('}');
        return sb.toString();
    }






    
}
