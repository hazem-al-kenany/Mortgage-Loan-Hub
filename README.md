# Mortgage Loan Hub
The **Mortgage Loan Hub** is a Java-based application designed to manage the entire lifecycle of mortgage loans. This system streamlines the process of creating, processing, and closing mortgage applications while integrating borrower, lender, and property information. It also provides detailed functionality for calculating loan estimates, closing costs, and managing the mortgage market.

---

## Features

### Core Features
- **Mortgage Market Initialization**:
  - Manage borrowers, lenders, and properties within a centralized system.
- **Application Process**:
  - Borrowers can apply for loans with lenders for specific properties.
- **Loan Processing**:
  - Evaluate applications for approval based on debts, income, and assets.
  - Generate loan estimates with calculated monthly payments and interest.
- **Closing Applications**:
  - Finalize loans with detailed closing disclosures, including closing costs.
- **Comparative Analysis**:
  - Compare loan terms from multiple lenders to find the best options.

### Components
1. **Borrower**:
   - Tracks personal details, credit history, debts, income, and assets.
   - Evaluates financial standing for loan eligibility.
2. **Lender**:
   - Defines lending terms, including interest rates, debt-to-income ratio, and fees.
3. **Property**:
   - Tracks property details like address, value, type, taxes, and dues.
4. **Loan Estimate**:
   - Calculates monthly payments based on loan terms, property value, and interest rates.
5. **Closing Disclosure**:
   - Finalizes costs and terms upon loan approval.

---

## Code Structure

### Main Classes

#### **Application**
- Represents a loan application, linking borrowers, lenders, and properties.
- Tracks assets, liabilities, and the application number.

#### **Borrower**
- Stores personal and financial details, including debts, income, and credit history.
- Calculates financial metrics like debt-to-income ratio.

#### **Lender**
- Defines lending criteria, including fees, interest rates, and loan terms.
- Sets down payment requirements and closing costs.

#### **MortgageMarket**
- Manages the centralized system of borrowers, lenders, and properties.
- Supports adding and retrieving market participants.

#### **LoanEstimate**
- Provides detailed calculations for monthly payments, interest, and escrow.

#### **ProcessedApplication**
- Evaluates applications based on financial criteria and determines approval status.
- Generates loan estimates for approved applications.

#### **ClosedApplication**
- Finalizes approved loans with detailed closing disclosures.

#### **TestMortgage**
- Implements a test scenario to demonstrate the system’s functionality.

---

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher.
- Java IDE like IntelliJ, Eclipse, or BlueJ.

### Steps
1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd mortgage-loan-management
