/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qldt.entity;

/**
 *
 * @author Manh
 */
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "complexSubjects")
@XmlAccessorType(XmlAccessType.FIELD)
public class ComplexSubjectXML {
    @XmlElement(name = "complexSubject") // Specify the element name for each item in the list
    private List<ComplexSubject> complexSubjects;

    public List<ComplexSubject> getComplexSubjects() {
        return complexSubjects;
    }

    public void setComplexSubjects(List<ComplexSubject> complexSubjects) {
        this.complexSubjects = complexSubjects;
    }
}
