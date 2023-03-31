package javaweek3homework;

public class Programme_15_Wall {
    // instance variables

    double width;
    double height;


    //default constructor
    public Programme_15_Wall() {

    }
// Get width method
    public double getWidth() {
        return width;
    }
    // Ge height method
     public double getHeight() {
        return height;
    }

    // Set width method
    public void setWidth(double width) {

        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
        //set height method
    public void setHeight(double height) {
            if(height <0){
                this.height =0;
            }else{
                this.height = height;
            }
        }

    //Get Area method
    public double getArea(){
        return (getHeight()*getWidth());
    }

    // Parameterized Constructor
    public Programme_15_Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
        //Main method
    public static void main(String[] args) {
        Programme_15_Wall wall = new Programme_15_Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());


    }




    }

