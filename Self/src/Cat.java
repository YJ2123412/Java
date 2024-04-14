package object.day8;

public class Cat extends Animal {
	public static final String TYPE ="고양이";
	
	public Cat() {
	}                       //super() 는 자식클래스 생성자에서 기본 호출됨. 생략가능

	public Cat(String color) {
		this.color=color; 
	}

	public Cat(String name, String color) {
        super(name, color);                 
	}
	
	
	@Override
	public void sound() {
		System.out.println(this.color +" 고양이는 야옹하고 소리를 냅니다. ");

	}
        
    @Override
	public String toString() {
		return TYPE+" [color=" + color + ", name=" + name + "]";
	}
    }
    

