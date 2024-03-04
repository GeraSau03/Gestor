package gestorEmpresarialEmpleados;

import GestorEmpresarialContrato.*;
import GestorErrores.*;
import gestorEmpresarialDatos.*;


import java.util.Scanner;

public final class Empleados
{

    private int i;
    public GestionErrores Errores;
    Scanner teclado;
    DatosPersonales datosPer;
    Contrato con;

    public Empleados()
    {
        teclado = new Scanner(System.in);
    }
    public void addDatosPersonales() {
        System.out.println("Ingrese la adscripción");
        String adscripcion = teclado.nextLine();

        System.out.println("Ingrese el teléfono exterior");
        String telefonoExterior = teclado.nextLine();

        System.out.println("Ingrese el puesto");
        String puesto = teclado.nextLine();

        datosPer = new DatosPersonales(i++, adscripcion, telefonoExterior, puesto);
    }


    public void addContrato(int id, int noContraro, String horario, Cargos tipoCargos)
    {
        System.out.println("Ingrese la id del contrato");
        id = teclado.nextInt();

        System.out.println("Ingresa el numero de contrato");
        noContraro = teclado.nextInt();

        System.out.println("Ingresa el horario");
        horario = teclado.nextLine();

        System.out.println("Ingresa el tipo de cargo");
        for (Cargos cargo : Cargos.values())
        {
            System.out.println(cargo.name());
        }
        tipoCargos = Cargos.valueOf(teclado.next());

        con = new Contrato(id);
    }

    private int findEmpleado(int empleado)
    {
        return empleado;
    }

    private int findEmpleado(String empleado)
    {
        return 0;
    }

    public void setWhatsapp(int id, String whatsapp)
    {
        datosPer.setId(id);
        whatsapp = teclado.nextLine();

    }

    private String datosPersonales ()
    {
        return null;
    }

    public String getInfoEmpleado(int empleado)
    {
       return null;
    }

    public String getInfoEmpleado(String empleado)
    {
        return empleado;
    }

    public void setAdscripcion(int id, String adscripcion)
    {
        datosPer.setId(id);
        System.out.println("Ingrese el adscripcion");
        adscripcion = teclado.nextLine();
    }

    public void setTelefonoExtesion(int id, String telefonoExtesion)
    {
        datosPer.setId(id);
        System.out.println("Ingrese el telefono exterior");
        telefonoExtesion = teclado.nextLine();
    }

    public void setPuesto(int id, String puesto)
    {
        datosPer.setId(id);
        System.out.println("Ingrese el puesto");
        puesto = teclado.nextLine();
    }

    public void showDatosEmpleados()
    {
        addDatosPersonales();

    }

    public void showContratoEmpleado(int n)
    {

    }

    public int getAntiguedad(int antiguedad)
    {
        System.out.println("Ingrese la antiguedad");
        antiguedad = teclado.nextInt();
        return antiguedad;
    }

    public void setCargo(Cargos tipoCargo)
    {
        System.out.println("Ingrese el cargo");
        tipoCargo = Cargos.valueOf(teclado.next());

    }
}

