import impl.Audiencias.Accionistas.ReportToAccionistas;
import impl.Audiencias.Corporativo.ReportToCorporativo;
import impl.Audiencias.Gerentes.ReportToGerentes;
import impl.FinancialReport.FinancialReport;
import impl.HRReport.HRReport;
import impl.SalesReport.SalesReport;

public class Main {
    public static void main(String[] args) {
        FinancialReport financialReport = new FinancialReport("Ingresos 2023");
        financialReport.exportarReporte();
        System.out.println("-------------");

        HRReport hrReport = new HRReport("Recursos humanos 2023");
        hrReport.exportarReporte();
        System.out.println("-------------");

        SalesReport salesReport = new SalesReport("Ventas 2023");
        salesReport.exportarReporte();
        System.out.println("-------------");

        System.out.println("Generando reporte para gerente de departamento...");
        ReportToGerentes reportToGerentes = new ReportToGerentes();
        reportToGerentes.hRReportToCSV(hrReport);
        reportToGerentes.hRRReportToExcel(hrReport);
        System.out.println("-------------");

        System.out.println("Generando reporte para corporativo...");
        ReportToCorporativo reportToCorporativo = new ReportToCorporativo();
        reportToCorporativo.financialReportToExcel(financialReport);
        reportToCorporativo.salesReportToExcel(salesReport);
        System.out.println("-------------");

        System.out.println("Generando reporte para corporativo...");
        ReportToAccionistas reportToAccionistas = new ReportToAccionistas();
        reportToAccionistas.hRReportToPDF(hrReport);
        reportToAccionistas.financialReportToExcel(financialReport);
        reportToAccionistas.saleReportToExcel(salesReport);
    }
}
