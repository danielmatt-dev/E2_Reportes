import IReportCSV from "../base/IReportCSV";
import IReportExcel from "../base/IReportExcel";
import IReportPdf from "../base/IReportPdf";

class HRR implements IReportCSV, IReportExcel, IReportPdf {
    generateCSV(): void {
        console.log('Generating HRR CSV');
    }

    generateExcel(): void {
        console.log('Generating HRR Excel');
    }

    generatePdf(): void {
        console.log('Generating HRR PDF');
    }
}

export default HRR;