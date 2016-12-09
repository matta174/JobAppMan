package domain;

/**
 * Created by Matthew on 12/8/2016.
 */



import java.util.Date;


public class transaction {
    private int id;
    private Account account;

    private stock stock;
    private tradeType type;
    private int count;
    private float price;
    private Date date;

    private transaction(){}

    public transaction(tradeType tradeType, Account account,stock stock, int count)
    {
        this.type = tradeType;
        this.account = account;
        this.stock = stock;
        this.count = count;
        this.price = stock.getCurrentValue();
        this.date = new Date();
    }

    public stock getStock() {
        return this.stock;
    }
    public Account getAccount(){
        return this.account;
    }
    public tradeType getType(){
        return this.type;
    }
    public int getCount(){
        return this.count;
    }
    public float getPrice(){
        return this.price;
    }
}
