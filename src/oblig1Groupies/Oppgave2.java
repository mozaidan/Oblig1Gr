package oblig1Groupies;


import static javax.swing.JOptionPane.*;

class Vare {
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris) {
            this.antall = antall;
            this.pris = pris;
            this.navn = navn;
            setPris(pris);
            setAntall(antall);
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        if (antall > 0) {
            this.antall = antall;
        }
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        if (pris > 0) {
        }
        this.pris = pris;
    }

    public double beregnTotalPris() {
        double totalPris = getPris() * getAntall();
        return totalPris;
    }
}
public class Oppgave2 {
    public static void main(String[] args) {
        int antall1, antall2;
        double pris1, pris2;
        String navnVare1 = showInputDialog("Skriv inn navnet for vare1");
        String antallVare1 = showInputDialog("Skriv inn antall varer for vare1");
        String prisHverVare1 = showInputDialog("Skriv inn prisen på vare1");

        String navnVare2 = showInputDialog("Skriv inn navnet for vare2");
        String antallVare2 = showInputDialog("Skriv inn antall varer for vare2");
        String prisV2 = showInputDialog("Skriv inn prisen på vare2");

        try {
            antall1 = Integer.parseInt(antallVare1);
            pris1 = Double.parseDouble(prisHverVare1);
            antall2 = Integer.parseInt(antallVare2);
            pris2 = Double.parseDouble(prisV2);
        } catch (Exception e) {
            showMessageDialog(null, "OBS! du har skerevet en ugyldig input!");
            antall1 = 0;
            pris1 = 0;
            antall2 = 0;
            pris2 = 0;
        }

        Vare vare1 = new Vare(navnVare1, antall1, pris1);
        Vare vare2 = new Vare(navnVare2, antall2, pris2);

        System.out.println("Vare1 er: " + vare1.getNavn() + "\nAntall varene er: " + vare1.getAntall() + "\nPrisen på hver enkel vare er: " + vare1.getPris());

        System.out.println("Vare2 er: " + vare2.getNavn() + "\nAntall varene er: " + vare2.getAntall() + "\nPrisen på hver enkel vare er: " + vare2.getPris());


        System.out.println("--------------------------------------------");

        System.out.println("Totalprisen for vare1 og vare2 er: " + vare1.beregnTotalPris() + vare2.beregnTotalPris());
    }
}