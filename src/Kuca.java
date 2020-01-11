public class Kuca extends StambeniObjekat {

    Stan stan = new Stan();

    Kuca(String adresa, Stan stan){ }

    Kuca(String adresa, double povrsina, int br_stanara){
        super.setAdresa(adresa);
        stan.setPovrsina(povrsina);
        stan.setBrStanara(br_stanara);
    }

    @Override
    public String toString() {
        return "Kuca:\nAdresa: "+ super.getAdresa() +"\nPovrsina stana je "+ stan.getPovrsina() +" m^2.\nBroj stanara je "+ stan.getBrStanara() +".";
    }
}
