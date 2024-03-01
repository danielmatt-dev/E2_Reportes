package org.example.Impl

import org.example.Base.IReporterCSV
import org.example.Base.IReporterExcel
import org.example.Base.IReporterPDF
import org.example.Clases.Report
import org.example.Clases.dataSet

// Clase FinancialReporter que implementa las interfaces de IReporterExcel, IReporterPDF, IReporterCSV
class FinancialReporter : IReporterExcel, IReporterPDF, IReporterCSV {

    // Función que retorna un reporte finenciero en formato CSV
    override fun generateReportCSV(dataSet: dataSet): Report {
        return Report("FinancialReporter en CSV")
    }

    // Función que retorna un reporte finenciero en formato Excel
    override fun generateReportExcel(dataSet: dataSet): Report {
        return Report("FinancialReporter en Excel")
    }

    // Función que retorna un reporte finenciero en formato PDF
    override fun generateReportPDF(dataSet: dataSet): Report {
        return Report("FinancialReporter en PDF")
    }
}