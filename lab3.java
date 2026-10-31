abstract class EnergyResources {
    int sourceId;
    String sourceName;
    double energyGenerated;

    EnergyResources(int id, String name, double energy) {
        sourceId = id;
        sourceName = name;
        energyGenerated = energy;
    }

    abstract double calculateEfficiency();

    void display() {
        System.out.println("Source ID: " + sourceId);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kW");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
    }
}

class SolarEnergy extends EnergyResources {
    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}

class WindEnergy extends EnergyResources {
    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

public class lab3 {
    public static void main(String[] args) {
        EnergyResources solar =
            new SolarEnergy(101, "Solar Energy", 4000);

        EnergyResources wind =
            new WindEnergy(102, "Wind Energy", 6000);

        System.out.println("Solar Energy Details:");
        solar.display();

        System.out.println();

        System.out.println("Wind Energy Details:");
        wind.display();
    }
}