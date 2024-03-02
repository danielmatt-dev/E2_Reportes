package impl.Audiencias.Accionistas;

import base.Formatos.Accionistas;
import impl.FinancialReport.FinancialReport;
import impl.HRReport.HRReport;
import impl.SalesReport.SalesReport;

public class ReportToAccionistas implements Accionistas {
    @Override
    public void hRReportToPDF(HRReport hrReport) {
        System.out.println(hrReport.getNombre() + " se ah exportado a PDF...");
    }

    @Override
    public void financialReportToExcel(FinancialReport financialReport) {
        System.out.println(financialReport.getNombre() + " se ah exportado a Excel...");
    }

    @Override
    public void saleReportToExcel(SalesReport salesReport) {
        System.out.println(salesReport.getNombre() + "  se ah exportado a Excel...");
    }
}
