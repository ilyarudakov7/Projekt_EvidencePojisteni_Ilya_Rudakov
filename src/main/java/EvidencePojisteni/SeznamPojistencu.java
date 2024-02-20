package EvidencePojisteni;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
// třída Seznam pojištěnců - obsahuje Arraylist pro uložení kolekce do paměti a hlavní metody
public class SeznamPojistencu {
    //deklarace Arraylistu
    public ArrayList<Pojistenec> pojistenci;
    private Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
    // vytvoření nové instance Arraylistu
    public SeznamPojistencu () {
        pojistenci = new ArrayList<>();
    }

    //metoda pro přidání pojištěnce
    public void pridejPojistence() {
        System.out.println("Zadej jméno: ");
        //vyžádáme si jméno od uživatele, uložíme do proměnné jmeno
        String jmeno = scanner.nextLine();
        //pokud jméno není prázdné
        if (!jmeno.isEmpty()){
            System.out.println("Zadej příjmení: ");
            //vyžádáme si přijmení od uživatele, uložíme do proměnné prijmeni
            String prijmeni = scanner.nextLine();
            System.out.println("Zadej věk:");
            //vyžádáme si věk od uživatele, naparsujeme, uložíme do proměnné vek
            int vek = Integer.parseInt(scanner.nextLine());
            System.out.println("Zadej telefonní číslo s předvolbou:");
            //vyžádáme si telefonní číslo od uživatele, uložíme do proměnné telefonniCislo
            String telefonniCislo = scanner.nextLine();
            //vytvoření pojištěnce
            Pojistenec pojistenec = new Pojistenec(jmeno, prijmeni, vek, telefonniCislo);
            //přidání pojištěnce do kolekce Arraylistu
            pojistenci.add(pojistenec);
            System.out.println("Děkuji za zadání. Je to v databázi.");
        } else {
            //pokud je jméno prázdné, tak se metoda nevykoná
            System.out.println("Neplatná volba");
        }
    }


    //metoda pro vypsání všech pojištěných do konzole
    public String vypisPojistene() {
        //deklarace proměnné vypis
        String vypis = "";
        //pokud není Arraylist prázdný
        if (!pojistenci.isEmpty()) {
            //proiterujeme všechny záznamy
            for (Pojistenec pojistenec : pojistenci) {
                //a vypíšeme je
                System.out.println(pojistenec);
            }
            //prázdný řádek pro přehlednost
            System.out.println();
        } else {
            //pokud záznamy nejsou, tak nic no..
            System.out.println("Nebyly nalezeny žádné záznamy");
        }
        //vracíme výpis
        return vypis;
    }
    //metoda vyhledá pojištěnce podle jména a příjmení
    public ArrayList<Pojistenec> vyhledejPojistence() {
        System.out.println("Zadejte jméno pojištěného:");
        //zažádáme si jméno a uložíme do proměnné jméno
        String jmeno = scanner.nextLine().trim();
        System.out.println("Zadejte příjmení pojištěného:");
        //zažádáme si příjmení a uložíme do proměnné příjmení
        String prijmeni = scanner.nextLine().trim();
        //vytvoříme si Arraylist nalezene, do kterého uložíme nalezeného pojištěnce
        ArrayList<Pojistenec> nalezene = new ArrayList<>();
        //iterujeme Arraylist všech pojištěnců
        for (Pojistenec pojistenec : pojistenci) {
            //pokud nalezneme jméno a zároveň příjmení v kolekci stejné jako v zadání od uživatele
            //přidáme do kolekce nalezené
            if (pojistenec.getJmeno().equals(jmeno) && (pojistenec.getPrijmeni().equals(prijmeni))) {
                nalezene.add(pojistenec);
            }
        } return nalezene;
    }

    //metoda pro vypsání hlavičky na začátku po spuštění programu
    protected void vypisHlavicku(){
        System.out.println(
                "----------------------\n" +
                "Evidence pojištěných\n" +
                "----------------------\n");
    }
}
