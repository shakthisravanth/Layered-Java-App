// Create a class named SavingsAccount inside the bank package

// Make SavingsAccount inherit from the Account class using 'extends'

// Declare a constant variable for minimum balance:
// MIN_BALANCE = 1000
// Use 'static final' so the value cannot be changed

// Create a constructor that accepts:
// accountNumber, holderName, and balance

// Inside the constructor:
// Call the parent class constructor using super(accountNumber, holderName, balance)


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

