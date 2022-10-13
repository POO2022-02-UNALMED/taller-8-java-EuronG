package futbol;

public class Portero extends Futbolista implements Comparable<Futbolista>{

    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "futbol.Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    public int compareTo(Portero o) {
        return Math.abs(this.golesRecibidos - o.golesRecibidos);
    }

    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }
}
