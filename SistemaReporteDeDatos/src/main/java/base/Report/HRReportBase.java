package base.Report;

import impl.DataSet;
import impl.HRReport.HRReport;

public interface HRReportBase {
    HRReport generateHRReport(DataSet hrData);
}
