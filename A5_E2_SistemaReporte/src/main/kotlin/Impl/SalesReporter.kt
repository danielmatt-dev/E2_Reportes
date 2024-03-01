package org.example.Impl

import org.example.Base.IReporterCSV
import org.example.Base.IReporterExcel
import org.example.Base.IReporterPDF
import org.example.Clases.Report
import org.example.Clases.dataSet

class SalesReporter : IReporterExcel, IReporterPDF, IReporterCSV {
    override fun generateReportCSV(dataSet: dataSet): Report {
        return Report("SalesReporter en CSV")
    }

    override fun generateReportExcel(dataSet: dataSet): Report {
        return Report("SalesReporter en Excel")
    }

    override fun generateReportPDF(dataSet: dataSet): Report {
        return Report("SalesReporter en PDF")
    }
}