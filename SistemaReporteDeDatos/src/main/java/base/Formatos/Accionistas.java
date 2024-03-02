package base.Formatos;

import base.Report.Report;
import impl.FinancialReport.FinancialReport;
import impl.HRReport.HRReport;
import impl.SalesReport.SalesReport;

public interface Accionistas {
    public void hRReportToPDF(HRReport hrReport);
    public void financialReportToExcel(FinancialReport financialReport);
    public void saleReportToExcel(SalesReport salesReport);
}
