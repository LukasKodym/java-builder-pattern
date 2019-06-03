package pl.lukas;

public class Logger {

    private Logger instance;
    private Logger(){}

    public Logger getInstance() {
        if (this.instance == null) {
            instance = new Logger();
            return instance;
        } else {
            return instance;
        }
    }
}