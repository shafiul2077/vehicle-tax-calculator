
package myproject;


public class Brands {
     private String name,modle,serialNumber;

    public Brands(String name, String modle, String serialNumber) {
        this.name = name;
        this.modle = modle;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getModle() {
        return modle;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Brand name="+name+"\nModle=" + modle + "\nSerialNumber=" + serialNumber;
    }
     
     
    
}
