package ejercicioexamen;

public class Reparacion {

    // Propiedades
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private double coste;
    private boolean pagado = false;

    private Cliente cliente;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        String s = "Reparacion{" + "descripcion=" + descripcion + ", coste=" + coste + ", pagado=";

        if (pagado) {
            s += "Sí";
        } else {
            s += "No";
        }

        s += '}';

        return s;
    }

}
