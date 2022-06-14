package co.objectivity.dpokusa;

public class ShellMoon {

    private ShellMoonStatus status;

    private ShellMoonColor color;

    private ShellMoon(ShellMoonStatus status, ShellMoonColor color) {
        this.status = status;
        this.color = color;
    }

    static ShellMoon of (ShellMoonStatus status, ShellMoonColor color) {
        return new ShellMoon(status, color);
    }


    public ShellMoonStatus getStatus() {
        return status;
    }

    public ShellMoonColor getColor() {
        return color;
    }
}
