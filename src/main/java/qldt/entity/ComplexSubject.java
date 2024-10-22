/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qldt.entity;

/**
 *
 * @author Manh
 */
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "complexSubject")
@XmlAccessorType(XmlAccessType.FIELD)
public class ComplexSubject implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String birthDate;
    private String address;
    private String permanentAddress;
    private String relatives;
    private String subjectType;

    public ComplexSubject() {
    }

    public ComplexSubject(int id, String name, String birthDate, String address, String permanentAddress, String relatives, String subjectType) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.permanentAddress = permanentAddress;
        this.relatives = relatives;
        this.subjectType = subjectType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getRelatives() {
        return relatives;
    }

    public void setRelatives(String relatives) {
        this.relatives = relatives;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }
}

