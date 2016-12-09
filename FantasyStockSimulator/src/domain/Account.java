package domain;

/**
 * Created by Matthew on 12/8/2016.
 */



import java.util.Date;


public class Account {

    protected int id;
    private String email;
    private float balance;
    private Date created;

    protected Account(){}
    public Account(String email, float balance)
    {
        this.email = email;
        this.balance = balance;
        this.created = new Date();
    }


    public int getId(){
        return this.id;
    }

    public String getEmail(){
        return this.email;

    }

    public float getBalance() {
        return balance;
    }
    public void setBalance (float balance)
    {
        this.balance = balance;
    }
}
