package org.example.Base

import org.example.Clases.Report
import org.example.Clases.dataSet

interface IReporterPDF {

    fun generateReportPDF(dataSet: dataSet) : Report

}