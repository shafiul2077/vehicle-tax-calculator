package myproject;


public class Bike extends Brands{
    private double price,cc;

    public Bike(String name, String modle, String serialNumber,double price, double cc) {
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
    if(cc<0 || cc>165)
    {
         throw new Exception(cc+" CC is not allow for this country");
    }
    else if(cc>=126 && cc<=165)
        //25%
            return("Your tax will be "+price*.25+" BDT \nTotal cost with tax "+(price+(price*.25))+" BDT");
            
    else if(cc>=100 && cc<=125)
        //20%
            return("Your tax will be "+price*.2+" BDT \nTotal cost with tax "+(price+(price*.20))+" BDT");
          
    else 
        //15%
            return("Your tax will be "+price*.15+" BDT \nTotal cost with tax "+(price+(price*.25))+" BDT");
    
    } catch (Exception e)
    {
        return(cc+" CC Bike is not allow for this country");
        
    }
          
    }
    
}