package javacore;

abstract class Vehicles {
	
	public abstract void getType();
    public abstract void getColor();
    public abstract void getBrandName();
}

class Cars extends Vehicles {
    public void getType() {
        System.out.println("Type: Car");
    }
    public void getColor() {
        System.out.println("Color: Red");
    }
    public void getBrandName() {
        System.out.println("Brand: BMW");
    }
}

class Bicycles extends Vehicles {
    public void getType() {
        System.out.println("Type: Bicycle");
    }
    public void getColor() {
        System.out.println("Color: Purple");
    }
    public void getBrandName() {
        System.out.println("Brand: Trek");
    }
}
class Motorbikes extends Vehicles {
    public void getType() {
        System.out.println("Type: Motorbike");
    }
    public void getColor() {
        System.out.println("Color: Black");
    }
    public void getBrandName() {
        System.out.println("Brand: BMW");
    }
}

