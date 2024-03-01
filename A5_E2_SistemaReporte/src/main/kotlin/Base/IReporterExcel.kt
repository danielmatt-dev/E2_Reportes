package org.example.Base

import org.example.Clases.Report
import org.example.Clases.dataSet

// Interface para generar reportes en Excel
interface IReporterExcel {

    // Método para generar reportes en formato Excel
    fun generateReportExcel(dataSet: dataSet) : Report

}