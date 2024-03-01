package org.example.Base

import org.example.Clases.Report
import org.example.Clases.dataSet

// Interface para generar reportes en PDF
interface IReporterPDF {

    // Método para generar reportes en formato PDF
    fun generateReportPDF(dataSet: dataSet) : Report

}