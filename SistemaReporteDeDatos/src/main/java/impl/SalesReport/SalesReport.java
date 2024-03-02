package impl.SalesReport;

import base.Report.Report;

public class SalesReport extends Report {
    // --- ATRIBUTOS ---
    private final SalesDataReport salesDataReport;

    // --- METODOS ---
    // CONSTRUCTORES

    public SalesReport(String nombre) {
        super(nombre);
        this.salesDataReport = new SalesDataReport();
    }

    // NORMALES
    public void exportarReporte() {
        salesDataReport.generateSalesReport(null);
    }
}
