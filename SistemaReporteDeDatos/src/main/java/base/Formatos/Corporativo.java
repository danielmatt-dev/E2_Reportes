package base.Formatos;

import base.Report.Report;
import impl.FinancialReport.FinancialReport;
import impl.SalesReport.SalesReport;

public interface Corporativo {
    public void financialReportToExcel(FinancialReport financialReport);
    public void salesReportToExcel(SalesReport salesReport);
}
