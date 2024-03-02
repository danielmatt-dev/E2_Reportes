package impl.HRReport;

import base.Report.Report;

public class HRReport extends Report {
    // --- ATRIBUTOS ---
    private final HRDataReport hrDataReport;

    // --- METODOS ---
    // CONSTRUCTORES

    public HRReport(String nombre) {
        super(nombre);
        this.hrDataReport = new HRDataReport();
    }

    // NORMALES
    public void exportarReporte() {
        hrDataReport.generateHRReport(null);
    }
}

