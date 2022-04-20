import java.util.*;




       class InvalidInputException extends Exception {
       InvalidInputException(String errorMessage) {
       super(errorMessage);
         }
     }
        public class StudentDatabase {
        public static String[] students ={"Nazia","Ayesha","Fahima","Nayema","Maisha",};
        public  static String[] homeTown = {"Troy MI","Rochester MI","Detroit MI","Bloomfield MI","Clinton MI",};
        public static String[] favFood = {"Ice cream","Chocolate","Burger","Pizza","Shrimp",};

        public static void validate(String input) throws InvalidInputException{
        if(!input.equals("hometown") && !input.equals("favorite food")){
        throw new InvalidInputException("That data does not exist.Please try again");
          }
      }
        public  static void validate2(String input) throws InvalidInputException{
        if(!input.equals("yes") && !input.equals("no")){
        throw new InvalidInputException("Invalid Input. Please choose between 'yes' or 'no'. ");
          }
       }
        public static void main(String[] args) {
        StudentDatabase ob = new StudentDatabase();
        int index;
        Scanner input = new Scanner(System.in);
        String firstChoice;

        System.out.println("Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-5):");

        while (true){

        while (true) {
        try {
        index = input.nextInt();
        System.out.print("Student " + index + " is " + students[index - 1] + ".");
        System.out.println(" What would you like to know about " + students[index - 1] + "? (enter 'hometown' or 'favorite food'):");

        } catch (IndexOutOfBoundsException er) {
        System.out.println("That student does not exist. Please try again. (enter a number 1-5):");
          continue;
          }
          break;

          }
        input.nextLine();

        while (true) {
        String info = input.nextLine();
        //System.out.println(info.toString());
         try {
            validate(info);
            firstChoice = info;
         if (info.equals("hometown")) {
         System.out.print(students[index - 1] + " is from " + homeTown[index - 1] + ". ");
            break;
               } else  {
         System.out.println(students[index - 1] + " loves " + favFood[index - 1] + ". ");
            break;
               }
             }
          catch(InvalidInputException er){
          System.out.print(er.getMessage());
          System.out.println("(enter 'hometown' or 'favorite food'):");
          }
            }
          while(true) {
          System.out.println("Would you like to know more? (enter 'yes' or 'no'): ");
          String moreInfo = input.nextLine();
          try {
            validate2(moreInfo);
          if (moreInfo.equals("yes")) {
          if (firstChoice.equals("hometown")) {
          System.out.println(students[index - 1] + " loves " + favFood[index - 1] + ". ");
             } else {
          System.out.print(students[index - 1] + " is from " + homeTown[index - 1] + ". ");
             }
              break;
                 } else {
          System.out.println("Thanks!");
              break;
                 }
               }
          catch (InvalidInputException er) {
          System.out.println(er.getMessage());
                }
              }
          System.out.println("Which student would you like to learn more about? (enter a number 1-5):");
              }
            }
          }