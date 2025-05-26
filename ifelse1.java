String username = "admin";
String password = "1234";

if (username.equals("admin")) {
    if (password.equals("1234")) {
        System.out.println("Login successful!");
    } else {
        System.out.println("Incorrect password.");
    }
} else {
    System.out.println("Username not found.");
}
