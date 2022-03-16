package project.enums;

public enum CarWheelSize {
    INCH_15(15),
    INCH_16(16),
    INCH_17(17),
    INCH_18(18),
    INCH_19(19),
    INCH_20(20)
    ;

    private int size;

    CarWheelSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "CarWheelSize{" +
                "size=" + size +
                '}';
    }

    public static String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(20).append(" ").
                append(19).append(" ").
                append(18).append(" ").
                append(17).append(" ").
                append(16).append(" ").
                append(15);
        return sb.toString();
    }

}
