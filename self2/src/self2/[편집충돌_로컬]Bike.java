package self2;

public class Bike extends Product{
    
    //[4]
    private int speed;
   
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //[3]
    public Bike(int price, String prdName, int speed) {
        this.price = price;
        this.prdName =prdName;
        this.speed = speed;
    }

    //[5]
    public String ride(){
        return String.format("당신은 이것을 시속 %dkm로 탈 수 있습니다.", speed);
    }

    //[8]
    @Override
    public String sell(Object o) {
        return String.format("[%s] 행사 - %d %% 인하", prdName, o);
    }

    //[10]
    @Override
    public String toString() {
        return "Bike [speed=" + speed + ", price=" + price + ", prdName="+prdName+"]";
    }


}

class Electronics extends Product{
    //[6]
    private double kwh;
    public double getKwh() {
        return kwh;
    }
    public void setKwh(double kwh) {
        this.kwh = kwh;
    }
    //[7]
    public double power(double kwh){
        double sum = (kwh*24);
        return sum;
    }
    //[3]
    public Electronics (int price, String prdName){
        this.prdName=prdName;
        this.price=price;}

    //[9]
    @Override
    public String sell(Object o) {
        return String.format("[%s] 증정 -%s", prdName, o);
    }
  //[10]
	@Override
	public String toString() {
		return "Electronics [price=" + price + ", kwh=" + kwh + ", prdName=" + prdName + "]";
	}

    
    
    
}
