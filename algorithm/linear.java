public class linear {
    
}
   class Main {
    public static void main(String[] args) {

        int[] studentID = {101, 203, 305, 407, 509, 612};
        int search = 407;
        boolean found = false;

        for (int i = 0; i < studentID.length; i++) {
       
            if (studentID[i] == search) {
                System.out.println("Student ID found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student ID not found");
        }    
             
    }
}