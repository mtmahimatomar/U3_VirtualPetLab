// Part A
public class VirtualPet
{
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private int weight;
    private int ageYears;
    private int ageMonths;

    public VirtualPet(String name)
    {
        this.name = name;
        energyLevel = 0;
        happinessLevel = 0;
        weight = 5;
        ageYears = 0;
        ageMonths = 0;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        String output = name + "'s Information:\n" + "Energy: " + energyLevel + "\n" + "Happiness: "
                + happinessLevel + "\n" + "Weight: " + weight + "g\n" + "Age: " + ageMonths +
                " months\n" + "and " + ageYears + " years";

        return output;
    }

    public void feed()
    {
        if (energyLevel < 10)
        {
            energyLevel++;
        }

        weight++;
    }

    public int getEnergyLevel()
    {
        return energyLevel;
    }

    public int getHappinessLevel()
    {
        return happinessLevel;
    }

    public void play()
    {
        if(happinessLevel < 10)
        {
            happinessLevel++;
        }

        if(weight > 5)
        {
            weight--;
        }
    }

    public void updateStatus()
    {
        if(energyLevel > 0)
        {
            energyLevel--;
        }

        if(happinessLevel > 0)
        {
            happinessLevel--;
        }

        ageMonths++;

        if(ageMonths == 12)
        {
            ageYears++;
            ageMonths = 0;
        }
    }
}