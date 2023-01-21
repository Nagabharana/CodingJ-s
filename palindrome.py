# Function to check if a string is a palindrome
def is_palindrome(string):
    # Reversing the string
    rev_string = string[::-1]
    # Checking if the reversed string is equal to the original string
    if rev_string == string:
        return True
    else:
        return False

# Getting user input
user_input = input("Enter a string: ")

# Checking if the user input is a palindrome
if is_palindrome(user_input):
    print("The string is a palindrome.")
else:
    print("The string is not a palindrome.")
