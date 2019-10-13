package Feladat1;

import java.util.Date;

public class GeometricShape {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricShape() { 
        this.dateCreated = new Date();
        this.color = "white";
        this.filled = false;
    }

    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        String datum = this.getDateCreated().toString();
        return datum + "\n" + "color: " + this.getColor() + " and filled: " + this.isFilled();
    } 
}
