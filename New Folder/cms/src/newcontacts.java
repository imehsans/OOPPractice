import java.io.*;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khurram
 */

public class newcontacts  {
protected  String name;
protected String address;
protected Integer phoneno;

    public newcontacts(String name, String address, Integer phoneno) throws IOException {
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(Integer phoneno) {
        this.phoneno = phoneno;
    }
  @Override
    public String toString(){
        return(name+address+phoneno);
    }
}

