// Create a package named bank

// Create a class named Account inside the bank package

// Declare three protected variables:
// accountNumber (int)
// holderName (String)
// balance (double)

// Note for students:
// 'protected' allows child classes (subclasses) to access these variables


// Create a public constructor that accepts:
// accountNumber, holderName, and balance

// Inside the constructor:
// Use the 'this' keyword to assign parameter values to class variables


// Create a method named showAccountDetails()

// Inside showAccountDetails():
// Print account number
// Print holder name
// Print balance
// Print an empty line for better formatting


// Create a method named deposit(double amount)

// Inside deposit method:
// Check if amount is greater than 0
// If valid:
// Add the amount to balance
// Print success message with updated balance
// If invalid:
// Print error message "Invalid deposit amount"


// Create a method named withdraw(double amount)

// Inside withdraw method:
// If amount is less than or equal to 0:
// Print "Invalid withdrawal amount"

// Else if amount is greater than current balance:
// Print "Insufficient balance"

// Else:
// Subtract the amount from balance
// Print success message with remaining balance

