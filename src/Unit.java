
//Understand conversion between different measures
public enum Unit{
    INCH(1, "Length"), FEET(12, "Length"), YARD(36, "Length"),
    TBSP(3, "Volume"), TSP(1, "Volume"), OZ(6, "Volume"), CUP(48, "Volume"),
    KG(1000,"Weight" ), GRAM(1,"Weight" );

    private int conversionFactor;
    private String type;

    private Unit(int conversionFactor, String type)
    {
        this.conversionFactor = conversionFactor;
        this.type = type;

    }
    public int convertToBase(int value)
    {
        return value * conversionFactor;
    }
    public String getType()
    {
        return type;
    }


    public int convertBaseToOther(Unit toConvert,int value) {
        return value/toConvert.conversionFactor;
    }
}

