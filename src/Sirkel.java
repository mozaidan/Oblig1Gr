public class Sirkel {


    public static double diameter(double radius) {
        return 2 * radius;
    }

    public static double omkrets(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double areal(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Oblig1Oppgave1 {
    public static void main(String[] args) {
        double radius = 23.5;
        double areal = Sirkel.areal(radius);
        double diameter = Sirkel.diameter(radius);
        double omkrets = Sirkel.omkrets(radius);

        System.out.println("Arealet av sirkelen er lik " + String.format("%.2f", areal));
        System.out.println("Diameter av sirkelen er lik " + String.format("%.2f", diameter));
        System.out.println("Omkretsen av sirkelen er lik " + String.format("%.2f", omkrets));
    }
}