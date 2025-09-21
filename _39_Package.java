// import tools.Calc;
import tools.AdvCalc;
public class _39_Package {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();

        int n1 = obj.add(4,3 );
        int n2= obj.sub(8,5 );
        int n3= obj.mul(5,2);
        int n4= obj.div(9,3 );

            System.out.println("Addition: "+n1);
            System.out.println("Subtraction: "+n2);
            System.out.println("Multiplication: "+n3);
            System.out.println("Division: "+n4);
    }
}
