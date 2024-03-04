package gestorArchivos;

import java.io.*;

public final class ArchivoTexto extends ControlArchivos implements iFileText {
    private File file;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private Boolean archivoExiste;
    private Boolean modoLectura;
    private Boolean modoEscritura;

    public ArchivoTexto(String archivo) {
        super(archivo);
        this.file = new File(archivo);
    }

    public ArchivoTexto(String archivo, Boolean archivoExiste) {
        super(archivo);
        this.file = new File(archivo);
        this.archivoExiste = archivoExiste;
    }


    public void AbrirModoLectura() {
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            modoLectura = true;
        } catch (IOException e) {
            System.out.println("Error al abrir en modo lectura: " + e.getMessage());
        }
    }


    public String leer() {
        if (!modoLectura) {
            System.out.println("El archivo no está abierto en modo lectura.");
            return null;
        }

        StringBuilder contenido = new StringBuilder();
        String linea;

        try {
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return contenido.toString();
    }


    public void AbrirModoEscritura() {
        try {
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            modoEscritura = true;
        } catch (IOException e) {
            System.out.println("Error al abrir en modo escritura: " + e.getMessage());
        }
    }


    public void Escribir(String contenido) {
        if (!modoEscritura) {
            System.out.println("El archivo no está abierto en modo escritura.");
            return;
        }

        try {
            bw.write(contenido);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    @Override
    public void Cerar() {

    }


    public void Cerrar() {
        try {
            if (fr != null) fr.close();
            if (fw != null) fw.close();
            modoLectura = false;
            modoEscritura = false;
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }
}
