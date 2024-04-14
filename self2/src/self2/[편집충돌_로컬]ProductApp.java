package self2;

public class ProductApp{

    public static void main(String[] args) {
        //[1]
        Product[] cart = new Product[10];
        cart[0] = new Bike(123000, "MTB", 25);
        cart[3] = new Bike(99000,"삼천리", 15);
    
        cart[1] = new Electronics(35000, "USB");
        cart[5] = new Electronics(527000, "스마트TV");
        cart[7] = new Electronics(2250000, "lg냉장고");
        
        
        //[2]
        Electronics tv = null;
        
        if(cart[5] instanceof Electronics){
        tv = (Electronics)cart[5];
        tv.setKwh(0.9);
        double num = tv.power(0.9);
        System.out.println(num);}
        
       

        //[4]
        for(Product p : cart){
            if(p !=null && p.price >=100000)
            System.out.println(p);
        }


        for (Product p : cart) {
            if(p instanceof Bike& p !=null){
                Bike bike = (Bike) p;
                System.out.println(bike.ride());
            }
        }
        
    
        //[5]
        System.out.println(cart[3].sell(20));
        //[6]

        System.out.println(cart[5].sell("사운드바"));
    }


   }
