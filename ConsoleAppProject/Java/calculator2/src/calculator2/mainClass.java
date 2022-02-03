public class mainClass {
    public static void main(String[] args) {
            Calculator2 c1 = new Calculator2();
            Calculator2 c2 = new Calculator2();
            
            c1.name = "Awesmeness";
            c2.name = "Bacon Egg & Cheese";
            
            System.out.println(c1.name + " calculated "+ c1.add(3, 4));
            System.out.println(c2.name + " calculated "+ c2.modulus(29, 5));
    }       
}
