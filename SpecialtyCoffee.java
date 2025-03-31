public class SpecialtyCoffee extends Coffee
{
    private String flavor;

    public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
    {
        this(size, isSkinny, shots, type, flavor);
    }

    public SpecialtyCoffee()
    {
        this("small", false, 1, "latte", "vanilla");
    }

    public SpecialtyCoffee(int size, String type, String flavor)
    {
        super();
        this.size = size;
        this.type = type;
        this.flavor = flavor;
    }


}