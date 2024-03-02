package impl.FinancialReport;

import base.Report.Report;

public class FinancialReport extends Report {
    // --- ATRIBUTOS ---
    private final FinancialDataReporter financialDataReporter;

    // --- METODOS ---
    // CONSTRUCTORES

    public FinancialReport(String nombre) {
        super(nombre);
        this.financialDataReporter = new FinancialDataReporter();
    }

    // NORMALES
    public void exportarReporte() {
        financialDataReporter.generatedFinancialReport(null);
    }
}
