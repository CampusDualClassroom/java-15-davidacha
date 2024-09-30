package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    public Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId,zone,area,shelf,quantity);
        this.expirationDate=expirationDate;
    }
    @Override
    public String getSpecificData() {
        return "Name: " + this.name +
                ", UniqueId: " + this.uniqueId +
                ", ResponsibleId: " + this.responsibleId +
                ", Zone: " + this.zone +
                ", Area: " + this.area +
                ", Shelf: " + this.shelf +
                ", Quantity: " + this.quantity +
                ", Expiration Date: " + getFormattedDate(expirationDate);
    }

    public void printSpecificData(){
        System.out.println(getSpecificData());
    }
    public Date getExpirationDate(){
        return expirationDate;
    }
    public String getFormattedDate(Date date){
        SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
        String dateF=s.format(date);
        return dateF;
    }
}
