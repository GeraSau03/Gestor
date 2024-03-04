package gestorEmpresarialEmpresa;

import GestorErrores.*;
import gestorEmpresarialEmpleados.*;

public final class Empresa
{
    private String nombreEmpresa;
    private String represetanteLegal;
    private String telefono;
    private String rfc;
    public Empleados datosRH;
    public GestionErrores error;

    public Empresa(String nombreEmpresa, String represetanteLegal)
    {
        this.nombreEmpresa = nombreEmpresa;
        this.represetanteLegal = represetanteLegal;
    }

    public String getRepresetanteLegal() {
        return represetanteLegal;
    }

    public void setRepresetanteLegal(String represetanteLegal) {
        this.represetanteLegal = represetanteLegal;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    public String getInfo()
    {
        return nombreEmpresa + represetanteLegal +  telefono;
    }
}
