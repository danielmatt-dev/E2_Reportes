import IReportCSV from "../base/IReportCSV";
import IReportExcel from "../base/IReportExcel";
import IReportPdf from "../base/IReportPdf";

class SalesR implements IReportCSV, IReportExcel, IReportPdf {
    generateCSV(): void {
        console.log('Generating Sales CSV');
    }

    generateExcel(): void {
        console.log('Generating Sales Excel');
    }

    generatePdf(): void {
        console.log('Generating Sales PDF');
    }
}

export default SalesR;