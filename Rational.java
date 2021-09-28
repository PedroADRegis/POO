public class Rational {

    private int num;
    private int denom;
    

    public String toString () {
        String numero = (this.num + "/" + this.denom);  
        return numero;


    }
    public void setNum (int a) {
        this.num = a;

    }


    public void setDenom (int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Variavel não respeitada");
        }
        this.denom = b;
    }


    public void mult (Rational c) {
        this.num = this.num*c.num;
        this.denom = this.denom*c.denom;
    }

    public void addition (Rational d) {
        this.num = ((this.num*d.denom) + (d.num*this.denom));
        this.denom = (this.denom*d.denom);

    }


}