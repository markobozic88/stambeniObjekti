public abstract class StambeniObjekat {

    String adresa;

    StambeniObjekat(){ }

    abstract double porez(double cena_po_kvadratu);

    // GETTERS
    public String getAdresa(){
        return adresa;
    }

    // SETTERS
    public void setAdresa(String adresa){
        this.adresa = adresa;
    }
}
