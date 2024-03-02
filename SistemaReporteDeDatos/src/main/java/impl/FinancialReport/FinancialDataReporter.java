package impl.FinancialReport;

import impl.DataSet;
import base.Report.FinancialReportBase;

public class FinancialDataReporter implements FinancialReportBase {
    @Override
    public FinancialReportBase generatedFinancialReport(DataSet financeData) {
        System.out.println("Se ha generado el reporte Financiero");
        return null;
    }
}
