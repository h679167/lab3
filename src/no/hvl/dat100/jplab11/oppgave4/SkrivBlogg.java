package no.hvl.dat100.jplab11.oppgave4;
import no.hvl.dat100.jplab11.oppgave3.Blogg;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(mappe + "/" + filnavn))) {
            writer.write(samling.toString());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
	}
	
	public static void main(String[] args) {
        Blogg blogg = new Blogg();
        String mappe = "/";
        String filnavn = "blogg.dat";
        if (skriv(blogg, mappe, filnavn)) {
            System.out.println("Blogg skrevet til fil: " + filnavn);
        } else {
            System.out.println("Feil ved skriving av blogg til fil.");
        }
    }
	
	
}
