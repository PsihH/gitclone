package objects;

public class car {
    private String brand;
    private String model;
    private int horseForce;
    private boolean electric;

    public boolean isElectric() {
        return electric;
    }
    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public int getHorseForce() { return horseForce; }

    private String electricCar(boolean electric) {
        if (electric) {
            return "it is an electric car";
        } else {
            return "";
        }
    }
    public String getAll() {
        return brand + " " + model + " \n" + horseForce + " forces\n" + electricCar(electric);
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setElectric(boolean electric) {
        this.electric = electric;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setHorseForce(int horseForce) {
        this.horseForce = horseForce;
    }

    public void setAll(String brand, String model, int horseForce, boolean electric) {
        setBrand(brand);
        setModel(model);
        setHorseForce(horseForce);
        setElectric(electric);
    }
}
