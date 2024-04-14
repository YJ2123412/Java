
public abstract class Product {
    protected int price;
    
    //[1]
    protected String prdName;

    //[2]
    public abstract String sell(Object o);

    @Override
    public String toString() {
        return "Product [price=" + price + ", prdName=" + prdName + "]";
    } 




}
