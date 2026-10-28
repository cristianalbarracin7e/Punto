public class NumeroNatural {
    private int natural;
    public NumeroNatural(int natural){
        this.setNatural(natural);
    }
    public NumeroNatural(){
        this (0);
    }
    public int getNatural() {
        return this.natural;
    }
    public void setNatural(int natural) {
        if (natural < 0) this.natural = 0 ;
        else this.natural = natural;
    }
    public void Añadir (int valor){
        this.setNatural(this.natural + valor);

    }
}
