/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashfaq
 */
public class Address {
  private  String hNo, street, city, state;

    public Address(String hNo, String street, String city, String state) {
        this.hNo = hNo;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String gethNo() {
        return hNo;
    }

    public void sethNo(String hNo) {
        this.hNo = hNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
  @Override
    public String toString(){
  return ("House Number: "+ this.hNo + ", Street No: "+ this.street+ " ,City: "+ this.city+" ,State/Province"+this.state);
  }
    
}
