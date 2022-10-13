package futbol;

public class Jugador extends Futbolista implements Comparable<Futbolista>{
    public short golesMarcados;
    public byte dorsal;

    public Jugador() {
        super();
        golesMarcados = 289;
        dorsal = 7;
    }

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public int compareTo(Futbolista o) {
        return Math.abs(this.getEdad() - o.getEdad());
    }

    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }
}
