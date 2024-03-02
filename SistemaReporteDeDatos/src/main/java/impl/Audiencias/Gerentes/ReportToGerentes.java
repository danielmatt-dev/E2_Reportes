package impl.Audiencias.Gerentes;

import base.Formatos.GerentesDepartamento;
import impl.HRReport.HRReport;

public class ReportToGerentes implements GerentesDepartamento {
    @Override
    public void hRReportToCSV(HRReport hrReport) {
        System.out.println(hrReport.getNombre() + " se ah exportado a CSV...");
    }

    @Override
    public void hRRReportToExcel(HRReport hrReport) {
        System.out.println(hrReport.getNombre() + " se ah exportado a Excel...");
    }
}
