package Prak3.Num2.bikeproject.src.bikeproject;

public interface MountainParts {
    final String terrain = "off_road";

    String getSuspension();
    void setSuspension(String suspension);

    String getType();
    void setType(String type);
}