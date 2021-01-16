/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author Mitch
 */
public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private boolean barker;
    
    public Animal(String speciesName, boolean hopper, boolean swimmer,boolean barker){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
        this.barker = barker;
        
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the canHop
     */
    public boolean canHop() {
        return canHop;
    }

    /**
     * @param canHop the canHop to set
     */
    public void setCanHop(boolean canHop) {
        this.canHop = canHop;
    }

    /**
     * @return the canSwim
     */
    public boolean canSwim() {
        return canSwim;
    }

    /**
     * @param canSwim the canSwim to set
     */
    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }
    
    public String toString(){
        return species;
    }

    /**
     * @return the barker
     */
    public boolean canBark() {
        return barker;
    }

    /**
     * @param barker the barker to set
     */
    public void setCanBark(boolean barker) {
        this.barker = barker;
    }
    
}
