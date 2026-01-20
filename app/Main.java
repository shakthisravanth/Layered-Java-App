// Create a package named app

// Import Account, SavingsAccount, and CurrentAccount classes from bank package

// Create a class named Main

// Inside the class, write the main method

// Inside the main method:

// Create an Account reference pointing to a SavingsAccount object

// Create another Account reference pointing to a CurrentAccount object

// Call showAccountDetails() using the Account reference
// This demonstrates that methods can be accessed through parent reference


// Use type casting:
// Convert the Account reference (acc1) into a SavingsAccount reference
// This allows access to child-specific methods like showSavingsRules()


// Call withdraw() using acc1
// This will follow the overridden withdrawal behavior of SavingsAccount

// Call withdraw() using acc2
// This will follow the normal withdrawal behavior from Account / CurrentAccount
