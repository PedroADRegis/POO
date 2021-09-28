public class TestReducedRational{

    public static void main(String[] args){
        
        ReducedRational numero = new ReducedRational();
        ReducedRational numero1 = new ReducedRational();

        numero.makeNumber(1, 3);
        
        numero1.makeNumber(2, 3);

        System.out.println(numero.toString());
        System.out.println(numero1.toString());
        /*
        numero.mult(numero1);

        System.out.println(numero.toString());
        **/
        numero.addition(numero1);

        System.out.println(numero.toString());


    }

}