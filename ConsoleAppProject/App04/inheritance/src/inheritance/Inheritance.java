package inheritance;


public class Inheritance {


    public static void main(String[] args) {
    Samsung s = new Samsung();
    Nokia n = new Nokia();
    Xiaomi x = new Xiaomi();
    s.setColour("Black");
    s.setCost(30000);
    s.setRAM("4GB");
    s.setAndroid_version("Android Pie");
    
    n.setColour("Red");
    n.setCost(40000);
    n.setRAM("4GB");
    n.setAndroid_version("Android marshmelo");
    
    x.setColour("Silver");
    x.setCost(50000);
    x.setRAM("6GB");
    x.setAndroid_version("Android Kitkat");
    
        System.out.println("Samsung mobile details");
        System.out.println("Cost: "+s.getCost());
        System.out.println("Colour: "+s.getColour());
        System.out.println("RAM: "+s.getRAM());
        System.out.println("Android version: "+s.getAndroid_version());
        
        System.out.println("Nokia mobile details");
        System.out.println("Cost: "+n.getCost());
        System.out.println("Colour: "+n.getColour());
        System.out.println("RAM: "+n.getRAM());
        System.out.println("Android version: "+n.getAndroid_version());
        
        System.out.println("Xiaomi mobile details");
        System.out.println("Cost: "+x.getCost());
        System.out.println("Colour: "+x.getColour());
        System.out.println("RAM: "+x.getRAM());
        System.out.println("Android version: "+x.getAndroid_version());
    }
}
