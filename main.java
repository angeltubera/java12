package java;

class Main {
    public static void main(String[] args) {

        // IF Statement
        int age = 18;
        if (age >= 18) {
            System.out.println("IF: Adult");
        }

        // IF-ELSE Statement
        int score = 90;
        if (score >= 75) {
            System.out.println("IF-ELSE: Passed");
        } else {
            System.out.println("IF-ELSE: Failed");
        }

        // IF-ELSE IF-ELSE Statement
        int grade = 95;
        if (grade >= 90) {
            System.out.println("IF-ELSE IF-ELSE: Excellent");
        } else if (grade >= 75) {
            System.out.println("IF-ELSE IF-ELSE: Passed");
        } else {
            System.out.println("IF-ELSE IF-ELSE: Failed");
        }
    }
}
