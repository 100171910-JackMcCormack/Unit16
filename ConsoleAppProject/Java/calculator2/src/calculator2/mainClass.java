public class mainClass {
    public static void main(String[] args) {
            Calculator2 c1 = new Calculator2();
            Calculator2 c2 = new Calculator2();
            
            c1.setName("Awesmeness");
            c2.setName("Bacon Egg & Cheese");
            
            System.out.println(c1.getName() + " calculated "+ c1.add(3, 4));
            System.out.println(c2.getName() + " calculated "+ c2.modulus(29, 5));
    }       
}
