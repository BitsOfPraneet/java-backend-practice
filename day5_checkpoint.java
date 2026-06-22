class Product
{
    private String name;
    private double price;
    private int stock;

    Product(String name,double price,int stock)
    {
        this.name=name;
        this.price=price;
        this.stock=stock;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public int getStock()
    {
        return stock;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }

    public void setStock(int stock)
    {
        if(stock<0) System.out.println("Stock cannot be negative!");
        else this.stock=stock;
    }
}
class PhysicalProduct extends Product
{
    private double shippingWeight;
    PhysicalProduct(String name,double price,int stock,double shippingWeight)
    {
        super(name,price,stock);
        this.shippingWeight=shippingWeight;
    }
}

class DigitalProduct extends Product
{
    private String downloadLink;
    DigitalProduct(String name,double price,int stock,String downloadLink)
    {
        super(name,price,stock);
        this.downloadLink=downloadLink;
    }
}
abstract class PaymentMethod
{
    void authenticate() 
    { 
        System.out.println("Authenticating payment..."); 
    }
    abstract void pay(double amount);
}

class CreditCard extends PaymentMethod
{
        @Override
        void pay(double amount)
        {
            System.out.println("Processing credit card payment of $"+amount);
        }
}

class PayPal extends PaymentMethod
{
        @Override
        void pay(double amount)
        {
            System.out.println("Redirecting to PayPal for $"+amount);
        }
}

public class day5_checkpoint
{
    public static void main(String[] args)
    {
        Product[] cart = new Product[2];
        cart[0] = new PhysicalProduct("Wheat Flour",189.90,20,12);
        cart[1] = new DigitalProduct("Playstation E-gift card",50.99,20,"https://playstation.org/Aezakw3fwgwgffg3fdwf32r/card");
        StringBuilder sb = new StringBuilder();
        int t_price=0;
        System.out.println("-- ORDER RECEIPT --");
        for(int i=0;i<cart.length;i++)
        {
            t_price+=cart[i].getPrice();
            System.out.println("Item : "+cart[i].getName()+" | Price: $"+cart[i].getPrice());
        }
        System.out.println("Total Due: $"+t_price);
        System.out.println("-------------------");
        PaymentMethod p= new PayPal();
        p.authenticate();
        p.pay(t_price);
    }      
}