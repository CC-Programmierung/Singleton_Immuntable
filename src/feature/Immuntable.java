package feature;

//Kann KEINE primitiven variablen clonen

public final class Immuntable {
    private int[] durchmesser;

    public Immuntable(int[] dD) {
        this.durchmesser = dD.clone();
    }

    public int[] getDurchmesser() {
        return durchmesser.clone();
    }
}
