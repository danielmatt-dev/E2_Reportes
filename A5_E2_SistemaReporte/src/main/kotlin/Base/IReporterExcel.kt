package org.example.Base

import org.example.Clases.Report
import org.example.Clases.dataSet

interface IReporterExcel {

    fun generateReportExcel(dataSet: dataSet) : Report

}