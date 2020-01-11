public class Stan {

    private double povrsina;
    private int br_stanara;

    Stan() { }

    Stan(Stan s){ }

    // GETTERS
    public double getPovrsina(){
        return povrsina;
    }
    public int getBrStanara(){
        return br_stanara;
    }

    // SETTERS
    public void setPovrsina(double povrsina){
        this.povrsina = povrsina;
    }
    public void setBrStanara(int br_stanara){
        this.br_stanara = br_stanara;
    }

    @Override
    public String toString() {
        return "Povrsina stana je " + povrsina + " m^2.\nBroj stanara je " + br_stanara + ".";
    }

}
