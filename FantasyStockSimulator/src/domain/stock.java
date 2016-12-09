package domain;

import java.util.Date;

/**
 * Created by Matthew on 12/8/2016.
 */
public class stock {


    private int id;
    private String name;
    private String fullName;
        private float currentValue;
        private float lastChange;
    private Date lastchangeDate;


    private stock(){}


    public stock(int id, String name, String fullName, float currentValue,float lastChange, Date lastchangeDate)
    {
        this.name = name;
        this.currentValue = currentValue;
        this.lastChange = lastChange;
        this.lastchangeDate = lastchangeDate;
    }


    public String getName(){return this.name; }
    public String getFullName(){ return this.fullName; }
    public float getCurrentValue(){ return this.currentValue;}
    public float getLastChange(){
        return this.lastChange;
    }
    public Date getLastChangeDate(){
        return this.lastchangeDate;
    }

    public stock changeValues(float currentValue,float lastChange, Date lastchangeDate)
    {
        return new stock(this.id,this.name,this.fullName,currentValue,lastChange,lastchangeDate);
    }

}
