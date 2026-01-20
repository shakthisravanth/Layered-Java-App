// Create a package named service

// Import Account class from bank package

// Import AccountRepository interface from repository package

// Create a class named AccountServiceImpl

// Make this class implement the AccountService interface


// Create a private variable of type AccountRepository
// This will be used to access repository methods


// Create a constructor that accepts AccountRepository as parameter

// Inside the constructor:
// Assign the passed repository to the class variable using 'this'


// Implement addAccount(Account account) method
// Call repository.addAccount(account) to store the account


// Implement withdraw(int accountNumber, double amount) method

// Inside this method:
// Use repository.findByAccountNumber(accountNumber) to get the account

// If account is found:
// Call withdraw(amount) on the account

// If account is not found:
// Print a message saying account not found


// Implement showAllAccounts() method

// Inside this method:
// Loop through all accounts returned by repository.getAllAccounts()

// Call showAccountDetails() for each account
