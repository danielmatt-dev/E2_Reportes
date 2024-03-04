import FinancialR from "./impl/FinancialR";
import HRR from "./impl/HRR";
import SalesR from "./impl/SalesR";

let financialR = new FinancialR();
let hrR = new HRR();
let saleR = new SalesR();

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
