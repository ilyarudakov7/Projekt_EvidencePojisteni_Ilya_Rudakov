package EvidencePojisteni;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
//hlavní třída - komunikace s uživatelem
public class MainEvidencePojistenych {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        //Inicializujeme třídu seznamPojistencu, kde máme uložené metody
        SeznamPojistencu seznamPojistencu = new SeznamPojistencu();
        //Metoda pro vypsání hlavičky, objeví se při spuštení
        seznamPojistencu.vypisHlavicku();
        //deklarujeme volbu uživatele
        String volba = "0";
        //volba 4 je konec programu
        while (!volba.equals("4")) {
            //necháme uspat vlákno na 1s, ať to není tak rychlé
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("");
                return;
            }
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec \n");
            volba = scanner.nextLine().trim();

            switch (volba) {
                case "1":
                    //metoda přidává nového pojištěnce
                    seznamPojistencu.pridejPojistence();
                    System.out.println("\nPokračujte libovolnou klávesou...\n");
                    break;
                case "2":
                    //metoda vypisuje všechny pojištěné
                    System.out.println(seznamPojistencu.vypisPojistene() + "Pokračujte libovolnou klávesou...\n");
                    break;
                case "3":
                    //metoda vyhledává pojištěné podle jména a příjmení
                    System.out.println(seznamPojistencu.vyhledejPojistence() + "\n\nPokračujte libovolnou klávesou...\n");
                    break;
                case "4":
                    System.out.println("Děkuji za použití.");
                    break;
                default:
                    System.out.println("Neplatná volba. Zkuste prosím znovu.");
            }
        }
    }
}
