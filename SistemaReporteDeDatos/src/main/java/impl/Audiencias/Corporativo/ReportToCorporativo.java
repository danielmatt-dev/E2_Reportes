package impl.Audiencias.Corporativo;

import base.Formatos.Corporativo;
import impl.FinancialReport.FinancialReport;
import impl.SalesReport.SalesReport;

public class ReportToCorporativo implements Corporativo {

    @Override
    public void financialReportToExcel(FinancialReport financialReport) {
        System.out.println(financialReport.getNombre() + " expertado a Excel");
    }

    @Override
    public void salesReportToExcel(SalesReport salesReport) {
        System.out.println(salesReport.getNombre() + " expertado a Excel");
    }
}
