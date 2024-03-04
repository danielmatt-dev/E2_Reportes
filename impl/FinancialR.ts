import IReportCSV from "../base/IReportCSV";
import IReportExcel from "../base/IReportExcel";
import IReportPdf from "../base/IReportPdf";

class FinancialR implements IReportCSV, IReportExcel, IReportPdf {
    generateCSV(): void {
        console.log('Generating Financial CSV');
    }

    generateExcel(): void {
        console.log('Generating Financial Excel');
    }

    generatePdf(): void {
        console.log('Generating Financial PDF');
    }
}

export default FinancialR;