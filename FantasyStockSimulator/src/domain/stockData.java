package domain;

import java.util.Date;

/**
 * Created by Matthew on 12/8/2016.
 */
public class stockData {




    private stock stock;

    private Date date;
    private float value;
    private float change;

    private stockData(){}

    public stockData(stock stock, Date date, float value, float change)
    {
        this.stock = stock;
        this.date = date;
        this.value = value;
        this.change = change;
    }
    public stock getStock(){
        return this.stock;
    }

    public Date getDate(){
        return this.date;
    }

    public float getValue(){
        return this.value;
    }

    public void setValue(float value){
        this.value = value;
    }
}

