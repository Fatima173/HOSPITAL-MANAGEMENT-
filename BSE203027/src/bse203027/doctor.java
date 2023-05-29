/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bse203027;

/**
 *
 * @author dell
 */
public class doctor {
      private int doctorid;
    private String Name;
    private String fathername;
    private String address;
private String information;
    public doctor(int doctorid,String Name,String fathername,String address,String information) {
        this.doctorid=doctorid;
        this.Name=Name;
        this.address=address;
        this.fathername=fathername;
        this.information=information;
        
    }

    public int getDoctorid() {
        return doctorid;
    }

    public String getName() {
        return Name;
    }

    public String getFathername() {
        return fathername;
    }

    public String getAddress() {
        return address;
    }

    public String getInformation() {
        return information;
    }

    public void setdoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    

}
