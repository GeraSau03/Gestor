package gestorEmpresarialDatos;

public final class DatosPersonales  // no se puede dar herencia
{
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String whatsapp;

    protected int getId()
    {
        return this.id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getApellidos() {
        return apellidos;
    }

    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    protected String getCorreo() {
        return correo;
    }

    protected void setCorreo(String correo) {
        this.correo = correo;
    }

    protected String getWhatsapp() {
        return whatsapp;
    }

    protected void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
}