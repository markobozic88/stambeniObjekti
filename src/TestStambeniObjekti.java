import java.util.Scanner;

public class TestStambeniObjekti {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite adresu stambenog objekta:");
        String adr = sc.nextLine();
        System.out.println("Unesite stambeni objekat koji zelite (k-kuca, z-zgrada):");
        String kOrZ = sc.nextLine();

        if(kOrZ.equals("k")){
            System.out.println("Unesite povrsinu kuce:");
            double pov = new Scanner(System.in).nextDouble();
            System.out.println("Unesite broj stanara u kuci:");
            int brStan = new Scanner(System.in).nextInt();
            Kuca k = new Kuca(adr, pov, brStan);
            System.out.println(k.toString());
        }

        if(kOrZ.equals("z")){
            System.out.println("Unesite broj stanova zgrade:");
            int brStZgr = sc.nextInt();
            Stan[] nizStanova = new Stan[brStZgr];
            Zgrada z = new Zgrada(adr, nizStanova);
            System.out.println(z.toString());
        }
    }
}
