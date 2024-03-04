package gestorArchivos;

public abstract class ControlArchivos
{
    private String archivo;

    public ControlArchivos(String archivo)
    {
        this.archivo = archivo;
    }

    public boolean Crear()
    {
        return false;
    }

    public boolean Eliminar()
    {
        return false;
    }

    public  boolean Cambiar(String archivo)
    {
        return false;
    }

    public boolean Mover (String archivo)
    {
        return false;
    }

    public abstract void Cerrar();
}
