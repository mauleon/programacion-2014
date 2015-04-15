package ejerciciomodelarobjetos;

/**
 *
 * @author widemos
 */
public class Libro {
    
    protected String titulo;
    protected String ISBN;
    protected boolean abierto = false;
    protected int numPaginas;
    protected int paginaActual = 0;


    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", ISBN=" + ISBN + ", abierto=" + abierto + '}';
    }

    
    
    public void abrir() {
        this.abierto = true;
    }
    
    public void cerrar() {
        abierto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }
}
