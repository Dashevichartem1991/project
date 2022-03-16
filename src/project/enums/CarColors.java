package project.enums;

public enum CarColors {
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green"),
    GRAY("Gray")
    ;

    private String color;

    CarColors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "CarColors{" +
                "color='" + color + '\'' +
                '}';
    }

    public static String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(BLACK).append(" ").
           append(WHITE).append(" ").
           append(RED).append(" ").
           append(GRAY).append(" ").
           append(GREEN).append(" ").
           append(BLUE);
        return sb.toString();
    }
}
