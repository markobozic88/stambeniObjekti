import java.util.Arrays;
import java.util.Scanner;

public class Zgrada extends StambeniObjekat {

        Stan[] nizStan;

        Zgrada(String adresa, Stan[] nizStanova){

            super.setAdresa(adresa);
            this.nizStan = nizStanova;

            for(int i=0; i<nizStan.length; i++) {
                nizStan[i] = new Stan();
                System.out.println("Unesite povrsinu " + (i+1) +". stana: ");
                double pov = new Scanner(System.in).nextDouble();
                System.out.println("Unesite broj stanara "+ (i+1) +". stana:");
                int brStStan = new Scanner(System.in).nextInt();
                nizStan[i].setPovrsina(pov);
                nizStan[i].setBrStanara(brStStan);
            }
        }

    @Override
    public String toString() {
        String str = "Zgrada:\nAdresa: " + super.getAdresa() + "\n";
        for (int j=0; j<nizStan.length; j++){
            str += (j+1) + ". stan:\n";
            str += nizStan[j].toString() + "\n";
        }
        return str;
    }
}
