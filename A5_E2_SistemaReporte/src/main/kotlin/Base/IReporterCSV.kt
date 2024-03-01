package org.example.Base

import org.example.Clases.Report
import org.example.Clases.dataSet

// Interface para generar reportes en CSV
interface IReporterCSV {

    // Método para generar reportes en formato CSV
    fun generateReportCSV(dataSet: dataSet) : Report

}