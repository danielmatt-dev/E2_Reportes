package base.Formatos;

import base.Report.Report;
import impl.HRReport.HRReport;

public interface GerentesDepartamento {
    public void hRReportToCSV(HRReport hrReport);
    public void hRRReportToExcel(HRReport hrReport);
}
