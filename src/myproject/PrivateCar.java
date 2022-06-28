
package myproject;

public class PrivateCar extends Brands{


    private double price,cc;

    public PrivateCar(String name, String modle, String serialNumber,double price, double cc) {
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
    if(cc<600 || cc>5000)
    {
         throw new Exception(cc+" CC is not allow for this country");
    }
    else if(cc>=4001 && cc<=5000)
        //500%
            return("Your tax will be "+price*5+" BDT \nTotal cost with text "+(price+(price*5))+" BDT");
            
    else if(cc>=3001 && cc<=4000)
        //400%
            return("Your tax will be "+price*4+" BDT \nTotal cost with text "+(price+(price*4))+" BDT");
    else if(cc>=2001 && cc<=3000)
        //300%
            return("Your tax will be "+price*3+" BDT \nTotal cost with text "+(price+(price*3))+" BDT");
    else if(cc>=1500 && cc<=2000)
        //200%
            return("Your tax will be "+price*2+" BDT \nTotal cost with text "+(price+(price*2))+" BDT");         
    else 
        //100%
            return("Your tax will be "+price*.1+" BDT \nTotal cost with text "+(price+(price*.1))+" BDT");
    
    } catch (Exception e)
    {
        return(cc+" CC Private Car is not allow for this country");
        
    }          
    }
}
    

