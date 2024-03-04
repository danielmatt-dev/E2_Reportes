"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var SalesR = /** @class */ (function () {
    function SalesR() {
    }
    SalesR.prototype.generateCSV = function () {
        console.log('Generating Sales CSV');
    };
    SalesR.prototype.generateExcel = function () {
        console.log('Generating Sales Excel');
    };
    SalesR.prototype.generatePdf = function () {
        console.log('Generating Sales PDF');
    };
    return SalesR;
}());
exports.default = SalesR;
