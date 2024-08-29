public class TipeDataString {
    public static void main(String[] args) {
        // Perbedaan primitive dan non primitive

        String firstName = "Benaya";
        String lastName = "Rizky Sipayung";

        //concat
        //String fullName = firstName + " " + lastName;

        String fullName = firstName.concat( " ").concat(lastName);
        System.out.println(fullName);
    }
}
