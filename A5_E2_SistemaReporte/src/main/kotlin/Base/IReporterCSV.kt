package org.example.Base

import org.example.Clases.Report
import org.example.Clases.dataSet

interface IReporterCSV {

    fun generateReportCSV(dataSet: dataSet) : Report

}