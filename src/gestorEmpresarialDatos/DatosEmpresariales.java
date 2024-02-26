package gestorEmpresarialDatos;

public abstract class DatosEmpresariales  //No se puede instaciar
{
    private String adscripcion;
    private String telefonoExterior;
    private String puesto;

    public DatosEmpresariales (int i, String adscripcion, String telefonoExterior, String puesto)
    {

    }

    String getAdscripcion() {
        return adscripcion;
    }

    void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }

    String getTelefonoExterior() {
        return telefonoExterior;
    }

    void setTelefonoExterior(String telefonoExterior) {
        this.telefonoExterior = telefonoExterior;
    }

    String getPuesto() {
        return puesto;
    }

    void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
