package ucu.ua.apps.labflowers.demo;
import lombok.Getter;

@Getter
public enum FlowerColor {
    RED("#FF0000"),
    BLUE("#0000FF"),
    YELLOW("#FFDE21"),
    WHITE("#FFFFFF");

    private final String code;

    private FlowerColor(String code) {
        this.code = code;
    }
}
