package com.tw.apistackbase.core;

import javax.persistence.*;

@Entity
public class Profile {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int registeredCapital;
    @Column
    private String certId;

    public int getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(int registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    Profile(){}
}
