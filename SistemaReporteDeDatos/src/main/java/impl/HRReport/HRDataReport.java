package impl.HRReport;

import impl.DataSet;
import base.Report.HRReportBase;

public class HRDataReport implements HRReportBase {
    @Override
    public HRReport generateHRReport(DataSet hrData) {
        System.out.println("Se ha generado el reporte de HR");
        return null;
    }
}
