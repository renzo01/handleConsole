public class UniqueIdGenerator {
    public static void main(String[] args) {
        var console = new java.util.Scanner(System.in);
        System.out.println("Please enter user name: ");
        var userName = console.nextLine();
        System.out.println("Please enter user lastname: ");
        var userLastname = console.nextLine();
        System.out.println("Please enter user birth date: ");
        var userBirthDate = console.nextLine();

        //Get first 2 letters of the name and lastname
        var firstTwoLettersName = userName.substring(0, 2).toUpperCase();
        var firstTwoLettersLastname = userLastname.substring(0, 2).toUpperCase();
        //Get last 2 letters of the birth date
        var lastTwoLettersBirthDate = userBirthDate.substring(userBirthDate.length() - 2);
        //generate random number (4 characters) to append to the unique ID
        var random = new java.util.Random();
        var randomNumber = String.format("%04d", random.nextInt(9000) + 1000);
        //Generate unique ID
        var uniqueId = firstTwoLettersName + firstTwoLettersLastname + lastTwoLettersBirthDate + randomNumber;
        System.out.println("Generated Unique ID: " + uniqueId);
        console.close();
    }
}
