package com.example.nando.artesanusbeer;

/**
 * Created by Nando on 01/05/2016.
 */
public class Analog {
    public static final String TAG = Analog.class.getSimpleName();
    public static final String TABLE = "Analog";
    // Labels Table Columns names
    public static final String KEY_AnalogId = "AnalogId";
    public static final String KEY_Name = "Name";
    public static final String KEY_High = "High";
    public static final String KEY_Low = "Low";
    public static final String KEY_Type = "Type";

    private String analogId;
    private String name;
    private int high;
    private int low;
    private String type;


    public String getAnalogId() {
        return analogId;
    }

    public void setAnalogId(String analogId) {
        this.analogId = analogId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHigh()
    {
        return this.high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setName(int low) {
        this.low = low;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
