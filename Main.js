"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var FinancialR_1 = require("./impl/FinancialR");
var HRR_1 = require("./impl/HRR");
var SalesR_1 = require("./impl/SalesR");
var financialR = new FinancialR_1.default();
var hrR = new HRR_1.default();
var saleR = new SalesR_1.default();
//Gerentes de departamento: Solo necesitan ver un reporte de recursos humanos, pero lo necesitan en formato CSV (para alimentar otro sistema) y en Excel.
console.log('Gerentes de departamento');
hrR.generateCSV();
hrR.generateExcel();
//Corporativo: Requieren un reporte financiero y reporte de ventas solo en excel.
console.log('Corporativo');
financialR.generateExcel();
saleR.generateExcel();
//Accionistas: Reporte de recursos humanos en formato PDF, reporte financiero y reporte de ventas en excel.
console.log('Accionistas');
hrR.generatePdf();
financialR.generateExcel();
saleR.generateExcel();
