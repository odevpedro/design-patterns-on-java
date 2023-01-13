public class Main {
    public static void main(String[] args) {
        var account = new Account();
        System.out.println(account.getBalance());


        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());
    }
}
    /**O encapsulamento restringe o acesso dos atributos de forma direta, isso proteja nosso objeto de modo que
    limitamos as possibilidades de interações*/
