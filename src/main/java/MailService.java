public class MailService {
    public void senEmail(){

        connecet();
        authenticate();
        disconnect();
    }

    private void connecet(){
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }
}
