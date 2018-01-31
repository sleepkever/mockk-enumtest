public class ClassWithEnumMember {

    public enum EnumType {ONE, TWO, THREE}

    private EnumType type;

    public EnumType getType() {
        return type;
    }

    public void setType(EnumType type) {
        this.type = type;
    }
}
