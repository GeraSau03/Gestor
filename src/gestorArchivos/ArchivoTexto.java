package gestorArchivos;

import java.io.*;


public final class ArchivoTexto extends ControlArchivos
{
    private File file;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private  Boolean archivoExiste;
    private Boolean modoLectura;
    private Boolean modoEscritura;

    public ArchivoTexto(String archivo)
    {
        super(archivo);

    }

    public ArchivoTexto(String archivo, Boolean archivoExiste)
    {
        super(archivo);
    }

    public void AbrirModoLectura()
    {

    }

    public String leer()
    {

        return null;
    }

    public void AbrirModoEscritura()
    {

    }

    public void Escribir ()
    {

    }

    public void Cerrar()
    {

    }
}
