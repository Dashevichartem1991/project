package project.enums;

public enum CarEngine {
    VOLUME1_6(1.6),
    VOLUME1_8(1.8),
    VOLUME2_0(2.0)
    ;


    private double volume;

    CarEngine(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "CarEngine{" +
                "volume=" + volume +
                '}';
    }

    public static String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(1.6).append(" ").
                append(1.8).append(" ").
                append(2.0);
        return sb.toString();
    }
}
