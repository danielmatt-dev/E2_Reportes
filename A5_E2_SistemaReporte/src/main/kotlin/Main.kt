package org.example

import org.example.Clases.dataSet
import org.example.Impl.FinancialReporter
import org.example.Impl.HRReporter
import org.example.Impl.SalesReporter

fun main() {

    println("-----Reportes para el Gerente-----")
    val reporteHR = HRReporter()

    var hrcsv = reporteHR.generateReportCSV(dataSet("Data"))
    var hrexcel = reporteHR.generateReportExcel(dataSet("Data"))

    println(hrcsv.getReport())
    println(hrexcel.getReport())

    println("-----Reportes para el Corporativo-----")
    val reporteFinanciero = FinancialReporter()
    val reporteVentas = SalesReporter()

    var fincsv = reporteFinanciero.generateReportExcel(dataSet("Data"))
    var salescsv = reporteVentas.generateReportExcel(dataSet("Data"))

    println(fincsv.getReport())
    println(salescsv.getReport())

    println("-----Reportes para los Accionistas-----")

    var hrPDF =  reporteHR.generateReportPDF(dataSet("Data"))
    var finExcel = reporteFinanciero.generateReportExcel(dataSet("Data"))
    var salExcel = reporteVentas.generateReportExcel(dataSet("Data"))

    println(hrPDF.getReport())
    println(finExcel.getReport())
    println(salExcel.getReport())

}