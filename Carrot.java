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
// Assignment Requirement: Create 1st Child - Carrot inheriting from vegetable
public class Carrot extends Vegetable {

    // Create 2 constructor, pass color and name in super 
    public Carrot() {
    }

    public Carrot(String parmVegetableColour, String parmVegetableName) {
        super(parmVegetableColour, parmVegetableName);
    }

    // Assignment Requirement: Implement the body of isTasty. If you like the vegetable then return true
    @Override
    public boolean isTasty() {
        return true; // if you like carrots
    }
}
