public class SalaryCalculator {
    public static void main(String[] args) {
        // Employee information
        String employeeName = "Magdalena Leones";
        double monthlySalary = 35000.00;
        double dailyRate = 1666.67;
        int workingDays = 21;
        int leaveCredits = 3;

        // Employee's activities this month
        int vacationDays = 5; // one week vacation
        int lateMinutes = 30;

        // Deductions
        double sssContributionRate = 0.045; // 4.5%
        double pagIbigContribution = 200.00;
        double withholdingTaxRate = 0.10; // 10%

        // Calculate gross pay
        int paidDays = workingDays - vacationDays;
        double grossPay = dailyRate * paidDays;

        // Calculate deductions
        double sssContribution = grossPay * sssContributionRate;
        double totalPagIbigContribution = pagIbigContribution;
        double withholdingTax = grossPay * withholdingTaxRate;

        // Calculate total deductions
        double totalDeductions = sssContribution + totalPagIbigContribution + withholdingTax;

        // Calculate net pay
        double netPay = grossPay - totalDeductions;

        // Round to 2 decimal places manually
        grossPay = Math.round(grossPay * 100.0) / 100.0;
        sssContribution = Math.round(sssContribution * 100.0) / 100.0;
        totalPagIbigContribution = Math.round(totalPagIbigContribution * 100.0) / 100.0;
        withholdingTax = Math.round(withholdingTax * 100.0) / 100.0;
        totalDeductions = Math.round(totalDeductions * 100.0) / 100.0;
        netPay = Math.round(netPay * 100.0) / 100.0;

        // Display payslip
        System.out.println("Payslip for " + employeeName);
        System.out.println("----------------------------");
        System.out.println("Gross Pay: P" + grossPay);
        System.out.println("Deductions:");
        System.out.println("  SSS Contribution (4.5%): P" + sssContribution);
        System.out.println("  Pag-Ibig Contribution: P" + totalPagIbigContribution);
        System.out.println("  Withholding Tax (10%): P" + withholdingTax);
        System.out.println("----------------------------");
        System.out.println("Net Pay: P" + netPay);
    }
}