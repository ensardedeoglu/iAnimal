import java.util.Comparator;

public class Kangaroo implements iAnimal, Comparable<iAnimal> {

    private int Id;
    private String type;
    private int minTemp, maxTemp;

    public Kangaroo() {
        Id = 0;
        type = "Kangaroo";
        minTemp = 17;
        maxTemp = 32;
    }

   
    public String getAnimalType() {
        return type;
    }

   
    public int getIdTag() {
        return Id;
    }

   
    public void setIdTag(int anIdTag) {
        Id = anIdTag;
    }

   
    public int getMinTemperature() {
        return minTemp;
    }

   
    public int getMaxTemperature() {
        return maxTemp;
    }


   
    public int compareTo(iAnimal iAnimal) {
        return type.compareTo(iAnimal.getAnimalType()) + Id - iAnimal.getIdTag();
    }

   
    public String toString() {
        return "Kangaroo: ID - " + getIdTag() + ", Max Temp: " + getMaxTemperature() + ", Min Temp: " + getMinTemperature();
    }
}