import java.util.Arrays;
import java.util.Objects;

public class Biblioteca {
    private String nombre;
    private Libro[] libros;
    private Socio[] socios;
    private Prestamo[] prestamos;

    public Biblioteca(String nombre, Libro[] libros, Socio[] socios, Prestamo[] prestamos) {
        this.nombre = nombre;
        this.libros = libros;
        this.socios = socios;
        this.prestamos = prestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public Socio[] getSocios() {
        return socios;
    }

    public void setSocios(Socio[] socios) {
        this.socios = socios;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre) && Arrays.equals(libros, that.libros) && Arrays.equals(socios, that.socios) && Arrays.equals(prestamos, that.prestamos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(libros);
        result = 31 * result + Arrays.hashCode(socios);
        result = 31 * result + Arrays.hashCode(prestamos);
        return result;
    }
}
