// Create a package named bank

// Create a class named Account

// Make the Account class implement the BankOperations interface

// Declare three protected variables:
// accountNumber (int)
// holderName (String)
// balance (double)

// Create a public constructor that accepts:
// accountNumber, holderName, and balance

// Inside the constructor:
// Use the 'this' keyword to assign parameter values to class variables


// Implement the showAccountDetails() method from the interface

// Inside showAccountDetails():
// Print account number
// Print holder name
// Print balance
// Print an empty line for better formatting


// Implement the deposit(double amount) method from the interface

// Inside deposit method:
// Check if amount is greater than 0
// If valid:
// Add the amount to balance
// Print success message with updated balance
// If invalid:
// Print error message "Invalid deposit amount"


// Implement the withdraw(double amount) method from the interface

// Inside withdraw method:
// If amount is less than or equal to 0:
// Print "Invalid withdrawal amount"

// Else if amount is greater than balance:
// Print "Insufficient balance"

// Else:
// Subtract the amount from balance
// Print success message with remaining balance

