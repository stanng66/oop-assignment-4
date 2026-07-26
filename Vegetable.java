// ====================
// Assignment 4
// Stanley Nguyen
// Humber College
// CPAN-131-RNA
// Mehrnaz Zhian
// July 28, 2026
// --------------------
// This program demonstrates inheritance and polymorphism
// ====================
// Assignment Requirement: Create abstract class called Vegetable. 
public abstract class Vegetable {
    // Assignment Requirement: This class will have 2 Private String: attributes color and name
    private String vegetableColour;
    private String vegetableName;

    // Assignment Requirement: Create default and 2 args constructors
    public Vegetable() {
    }

    public Vegetable(String parmVegetableColour, String parmVegetableName) {
        this.vegetableColour = parmVegetableColour;
        this.vegetableName = parmVegetableName;
    }

    // Assignment Requirement: create getter and setter
    public String getVegetableColour() {
        return vegetableColour;
    }

    public void setVegetableColour(String parmVegetableColour) { 
        this.vegetableColour = parmVegetableColour; 
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String parmVegetableName) {
        this.vegetableName = parmVegetableName;
    }

    // Assignment Requirement: This class will have abstract method as isTasty The return type for this method is boolean
    public abstract boolean isTasty();
    
}
