import java.util.ArrayList;

public class Pizza {
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

    public String getMarinara() {
        return marinara;
    }

    public void setMarinara(String marinara) {
        this.marinara = marinara;
    }

    public String getAlfredo() {
        return alfredo;
    }

    public void setAlfredo(String alfredo) {
        this.alfredo = alfredo;
    }

    public String getPesto() {
        return pesto;
    }

    public void setPesto(String pesto) {
        this.pesto = pesto;
    }

    public String getBbq() {
        return bbq;
    }

    public void setBbq(String bbq) {
        this.bbq = bbq;
    }

    public String getBuffalo() {
        return buffalo;
    }

    public void setBuffalo(String buffalo) {
        this.buffalo = buffalo;
    }

    private String alfredo;
    private String pesto;
    private String bbq;
    private String buffalo;
    private ArrayList<Pizza> pizza = new ArrayList<>();

    public String getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(String pepperoni) {
        this.pepperoni = pepperoni;
    }

    public String getSausage() {
        return sausage;
    }

    public void setSausage(String sausage) {
        this.sausage = sausage;
    }

    public String getHam() {
        return ham;
    }

    public void setHam(String ham) {
        this.ham = ham;
    }

    public String getBacon() {
        return bacon;
    }

    public void setBacon(String bacon) {
        this.bacon = bacon;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getMeatball() {
        return meatball;
    }

    public void setMeatball(String meatball) {
        this.meatball = meatball;
    }

    public String getExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(String extraMeat) {
        this.extraMeat = extraMeat;
    }

    public String getMozzarella() {
        return mozzarella;
    }

    public void setMozzarella(String mozzarella) {
        this.mozzarella = mozzarella;
    }

    public String getParmesan() {
        return parmesan;
    }

    public void setParmesan(String parmesan) {
        this.parmesan = parmesan;
    }

    public String getRicotta() {
        return ricotta;
    }

    public void setRicotta(String ricotta) {
        this.ricotta = ricotta;
    }

    public String getExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(String extraCheese) {
        this.extraCheese = extraCheese;
    }

    public String getOnions() {
        return onions;
    }

    public void setOnions(String onions) {
        this.onions = onions;
    }

    public String getBellPeppers() {
        return bellPeppers;
    }

    public void setBellPeppers(String bellPeppers) {
        this.bellPeppers = bellPeppers;
    }

    public String getPineapples() {
        return pineapples;
    }

    public void setPineapples(String pineapples) {
        this.pineapples = pineapples;
    }

    public String getSpinach() {
        return spinach;
    }

    public void setSpinach(String spinach) {
        this.spinach = spinach;
    }

    public String getBasil() {
        return basil;
    }

    public void setBasil(String basil) {
        this.basil = basil;
    }

    public String getOlives() {
        return olives;
    }

    public void setOlives(String olives) {
        this.olives = olives;
    }

    public ArrayList<Pizza> getPizza() {
        return pizza;
    }

    public void setPizza(ArrayList<Pizza> pizza) {
        this.pizza = pizza;
    }

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

    public ArrayList<Pizza> getPizzaCrust() {
        return pizza;
    }

    public void setPizzaCrust(ArrayList<Pizza> pizza) {
        this.pizza = pizza;
    }


    public Pizza() {
        this.thin = thin;
        this.regular = regular;
        this.thick = thick;
        this.stuffed = stuffed;
        this.cauliflower = cauliflower;
        this.pizza = pizza;
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

    }

}
