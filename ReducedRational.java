public class ReducedRational {

    private int num;
    private int denom;

    public int getDenom () {
        return this.denom;
    }

    public int getNum () {
        return this.num;
    }

    public String toString () {
        String numero = (this.num + "/" + this.denom);  
        return numero;
    }

    private void reducedRational (ReducedRational c) {

        int maiordivisor = 1;
        int menornumero = c.getNum() < c.getDenom() ?  c.getNum() : c.getDenom();

        for ( int i = 2; i < (menornumero + 1); i++){
            if ((c.getNum() % i == 0) && (c.denom % i == 0)) {
                maiordivisor = i;               
            }
            else {}
        }
        c.setNumber(c.getNum()/maiordivisor,c.getDenom()/maiordivisor);
        
    }

    private void setNumber (int f, int g) {
        this.num = f;
        this.denom = g;

    }

    public void makeNumber (int a, int b) {
        
        this.num = a;
        if (b == 0) {
            throw new IllegalArgumentException("Variavel não respeitada");
        }
        else{
            this.denom = b;
            reducedRational(this);
        }
    }

    
    public void mult (ReducedRational c) {

        this.num = this.num*c.getNum();
        this.denom = this.denom*c.getDenom();

        reducedRational(this);

    }


    public void addition (ReducedRational d) {

        this.num = ((this.num*d.getDenom()) + (d.getNum()*this.denom));
        this.denom = (this.denom*d.getDenom());

        reducedRational(this);

    }
    


}