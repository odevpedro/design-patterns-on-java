public class Account {
    private float balance;


    //metodo de acesso do atributo balance
    public float getBalance(){
        return this.balance;
    }

    //métodos de modificação do atributo balance
    public void deposit(float amount){
        if (amount > 0)
            this.balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0 ){
            this.balance = balance;
        }

    }


}