package chapters.chapter_13;

public abstract class Exercise_09GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;


    public Exercise_09GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public Exercise_09GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
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


    public java.util.Date getDateCreated() {
        return dateCreated;
    }


    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    public abstract boolean equals(Exercise_10Rectangle o);
}
