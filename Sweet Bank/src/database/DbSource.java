/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author Karaarslan
 */
public class DbSource extends DbConnection{
    
    protected int user_ID = 0;
    protected String name_Surname;
    protected String id_Number;
    protected String phone_Number;
    protected String custom_No;
    
    protected double balance;
    protected double electricty_bill;
    protected double gas_bill;
    protected double water_bill;

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public void setName_Surname(String name_Surname) {
        this.name_Surname = name_Surname;
    }

    public void setId_Number(String id_Number) {
        this.id_Number = id_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public void setCustom_No(String custom_No) {
        this.custom_No = custom_No;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setElectricty_bill(double electricty_bill) {
        this.electricty_bill = electricty_bill;
    }

    public void setGas_bill(double gas_bill) {
        this.gas_bill = gas_bill;
    }

    public void setWater_bill(double water_bill) {
        this.water_bill = water_bill;
    }

    public void setInternet_bill(double internet_bill) {
        this.internet_bill = internet_bill;
    }
    protected double internet_bill;

    public int getUser_ID() {
        return user_ID;
    }

    public String getName_Surname() {
        return name_Surname;
    }

    public String getId_Number() {
        return id_Number;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public String getCustom_No() {
        return custom_No;
    }

    public double getBalance() {
        return balance;
    }

    public double getElectricty_bill() {
        return electricty_bill;
    }

    public double getGas_bill() {
        return gas_bill;
    }

    public double getWater_bill() {
        return water_bill;
    }

    public double getInternet_bill() {
        return internet_bill;
    }
    
    
    
    
}
