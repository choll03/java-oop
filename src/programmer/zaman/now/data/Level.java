package programmer.zaman.now.data;

public enum Level {
    STANDARD("Standard Level"),
    PREMINUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
