package impl.SalesReport;

import impl.DataSet;
import base.Report.SalesReportBase;

public class SalesDataReport implements SalesReportBase {
    @Override
    public SalesReport generateSalesReport(DataSet salesData) {
        System.out.println("Se ha generado el reporte de ventas");
        return null;
    }
}
