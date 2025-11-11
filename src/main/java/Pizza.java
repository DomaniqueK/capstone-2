import java.util.ArrayList;

public class Pizza {
    private int eight = 8;
    private int twelve = 12;
    private int sixteen = 16;
    private String thin;
    private String regular;
    private String thick;
    private String stuffed;
    private String cauliflower;
    private String pepperoni;
    private String sausage;
    private String ham;
    private String bacon;
    private String chicken;
    private String meatball;
    private String extraMeat;
    private String mozzarella;
    private String parmesan;
    private String ricotta;
    private String extraCheese;
    private String onions;
    private String bellPeppers;
    private String pineapples;
    private String spinach;
    private String basil;
    private String olives;
    private String marinara;
    private String alfredo;
    private String pesto;
    private String bbq;
    private String buffalo;
    private ArrayList<Pizza> pizza = new ArrayList<>();



    public String getThin() {
        return thin;
    }

    public void setThin(String thin) {
        this.thin = thin;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    public String getThick() {
        return thick;
    }

    public void setThick(String thick) {
        this.thick = thick;
    }

    public String getStuffed() {
        return stuffed;
    }

    public void setStuffed(String stuffed) {
        this.stuffed = stuffed;
    }

    public String getCauliflower() {
        return cauliflower;
    }

    public void setCauliflower(String cauliflower) {
        this.cauliflower = cauliflower;
    }


    public Pizza(int eight, int twelve, int sixteen, String thin, String thick, String regular, String stuffed, String cauliflower) {
        this.thin = thin;
        this.regular = regular;
        this.thick = thick;
        this.stuffed = stuffed;
        this.cauliflower = cauliflower;
        this.eight = eight;
        this.twelve = twelve;
        this.sixteen = sixteen;
    }
 /*       this.pizza = pizza;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.ham = ham;
        this.bacon = bacon;
        this.chicken = chicken;
        this.meatball = meatball;
        this.mozzarella = mozzarella;
        this.parmesan = parmesan;
        this.ricotta = ricotta;
        this.onions = onions;
        this.bellPeppers = bellPeppers;
        this.spinach = spinach;
        this.olives = olives;
        this.basil = basil;
        this.pineapples = pineapples;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        this.marinara = marinara;
        this.alfredo = alfredo;
        this.pesto = pesto;
        this.bbq = bbq;
        this.buffalo = buffalo;
*/


}
