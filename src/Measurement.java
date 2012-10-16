//Understand relationships between different units
public class Measurement {
    private int value;
    private Unit type;

    public Measurement(int value, Unit type) {
        this.value = value;
        this.type = type;

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Measurement another = (Measurement) object;

        int thisInBaseUnit = this.type.convertToBase(value);
        int anotherInBaseUnit = another.type.convertToBase(another.value);

        if(this.type.getType() != another.type.getType()) return false;
        return thisInBaseUnit == anotherInBaseUnit;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }


    public Measurement add(Measurement anotherNewMes) {

        if (type.getType() != anotherNewMes.type.getType())
            return null;

        int result=this.type.convertToBase(value)+anotherNewMes.type.convertToBase(anotherNewMes.value);

        return new Measurement(type.convertBaseToOther(type,result),type);


    }
}
