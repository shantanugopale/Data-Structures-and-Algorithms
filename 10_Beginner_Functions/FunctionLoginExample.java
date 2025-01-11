
public class FunctionLoginExample {

    public static boolean loginPage(String username, String password) {
        if (username.equalsIgnoreCase("Shantanu") && password.equals("12345")) {
            System.out.println("Login Successfull");
            return true;
        } else {
            System.out.println("Login Failed");
            return false;
        }
    }

    static void uploadVideos(String username, String password) {
        if (loginPage(username, password)) {
            System.out.println("Videos Uploaded");
        } else {
            System.out.println("Not Able to Upload");
        }
    }

    public static void main(String[] args) {

        uploadVideos("Shantanu", "124");
        uploadVideos("Shantanu", "12345");

    }
}
