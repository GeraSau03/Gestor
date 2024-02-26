package GestorEmpresarialContrato;

public final class Contrato
{
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargos;

    public Contrato(int id)
    {
        this.id = id;

    }

    public int getNoContrato() {
        return noContrato;
    }

    public void setNoContrato(int noContrato) {
        this.noContrato = noContrato;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Cargos getTipoCargos() {
        return tipoCargos;
    }

    public void setTipoCargos(Cargos tipoCargos) {
        this.tipoCargos = tipoCargos;
    }
}
