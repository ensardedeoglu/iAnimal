import java.util.Comparator;

public class Seabird implements iAnimal, Comparable<iAnimal> {

    private int Id;
    private String type;
    private int minTemp, maxTemp;

    public Seabird() {
        Id = 0;
        type = "Seabird";
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
        return "Seabird: ID - " + getIdTag() + ", Max Temp: " + getMaxTemperature() + ", Min Temp: " + getMinTemperature();
    }
}