package base.Report;

import impl.DataSet;
import impl.SalesReport.SalesReport;

public interface SalesReportBase {
    SalesReport generateSalesReport(DataSet salesData);
}
