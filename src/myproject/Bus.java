
package myproject;

public class Bus extends Brands{
    private double price,cc;

    public Bus(String name, String modle, String serialNumber,double price, double cc) {
        super(name,modle,serialNumber);
        this.price = price;
        this.cc = cc;
    }

    public double getPrice() {
        return price;
    }

    public double getCc() {
        return cc;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPrice=" + price + "\nCC=" + cc;
    }
    public String text()
    {
     
    try{
    if(cc<1000 || cc>5000)
    {
         throw new Exception(cc+" CC is not allow for this country");
    }
    else if(cc>=4001 && cc<=5000)
        //45%
            return("Your tax will be "+price*.45+" BDT \nTotal cost with text "+(price+(price*.45))+" BDT");
            
    else if(cc>=2500 && cc<=4000)
        //25%
            return("Your tax will be "+price*.25+" BDT \nTotal cost with text "+(price+(price*.25))+" BDT");
          
    else 
        //20%
            return("Your tax will be "+price*.2+" BDT \nTotal cost with text "+(price+(price*.2))+" BDT");
    
    } catch (Exception e)
    {
        return(cc+" CC Bus is not allow for this country");
        
    }          
    }
}

