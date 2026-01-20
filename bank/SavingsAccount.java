// Create a class named SavingsAccount inside the bank package

// Make SavingsAccount inherit from the Account class using 'extends'


// Declare two constants using static final:
// MIN_BALANCE (double) → minimum balance that must be maintained
// INTEREST_RATE (double) → interest rate for savings account

// Note for students:
// static final is used because these values are fixed and shared by all objects


// Create a constructor that accepts:
// accountNumber, holderName, and balance

// Inside the constructor:
// Call the parent class constructor using super(accountNumber, holderName, balance)


// Create a method named showSavingsRules()

// Inside showSavingsRules():
// Print a heading like "Savings Account Rules:"
// Print the minimum balance
// Print the interest rate
// Print an empty line for formatting


// Override the withdraw(double amount) method

// Inside the overridden withdraw method:
// If amount is less than or equal to 0:
// Print "Invalid withdrawal amount"

// Else if withdrawing the amount breaks the minimum balance rule:
// (balance - amount < MIN_BALANCE)
// Print message that minimum balance must be maintained

// Else:
// Subtract the amount from balance
// Print success message with remaining balance
