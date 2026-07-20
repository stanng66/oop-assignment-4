// ====================
// Assignment 4
// Stanley Nguyen
// Humber College
// CPAN-131-RNA
// Mehrnaz Zhian
// July 28, 2026
// --------------------
// This program demonstrates 
// ====================
// Assignment Requirement: Create abstract class called Vegetable. 
public abstract class Vegetable {
    // Assignment Requirement: This class will have 2 Private String: attributes color and name
    private String attributeColor;
    private String attributeName;

    // Assignment Requirement: Create default and 2 args constructors
    public Vegetable() {
    }

    public Vegetable(String parmAttributeColor, String parmAttributeName) {
        this.attributeColor = parmAttributeColor;
        this.attributeName = parmAttributeName;
    }

    // Assignment Requirement: create getter and setter
    public String getAttributeColor() {
        return attributeColor;
    }

    public void setAttributeColor(String parmAttributeColor) { 
        this.attributeColor = parmAttributeColor; 
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String parmAttributeName) {
        this.attributeName = parmAttributeName;
    }

    // Assignment Requirement: This class will have abstract method as isTasty The return type for this method is boolean
    public abstract boolean isTasty();
}
