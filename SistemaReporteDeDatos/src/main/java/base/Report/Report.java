package base.Report;

public abstract class Report {
    // --- ATRIBUTOS ---
    protected String nombre;

    // --- METODOS ---
    // CONSTRUCTORES
    public Report(String nombre) {
        this.nombre = nombre;
    }

    // GET
    public String getNombre() {
        return nombre;
    }
}
