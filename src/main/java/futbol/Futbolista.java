package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{

    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista() {
        nombre = "Maradona";
        posicion = "delantero";
        edad = 30;
    }
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }


    public int compareTo(Futbolista o) {
        if (this.equals(o)) {
            return 0;
        } else {
            return this.edad - o.getEdad();
        }
    }

    public boolean equals(Futbolista f) {
        return this.nombre.equals(f.nombre) && this.edad == f.edad && this.posicion.equals(f.posicion);
    }

    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " +
                edad + ", y juega de " + posicion;
    }

    public abstract boolean jugarConLasManos();
}
