import java.util.Objects;

public class Socio {
    private String nif;
    private String nombre;
    private String apellido;
    private int numeroSocio;
    private int cp;

    public Socio(String nif, String nombre, String apellido, int numeroSocio, int cp) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSocio = numeroSocio;
        this.cp = cp;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return numeroSocio == socio.numeroSocio && cp == socio.cp && Objects.equals(nif, socio.nif) && Objects.equals(nombre, socio.nombre) && Objects.equals(apellido, socio.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, nombre, apellido, numeroSocio, cp);
    }
}
