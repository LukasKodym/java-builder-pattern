package pl.lukas;

public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        return SingletonHolder.INSTANCE;
        // Bill Pugh implementation
    }

    public void logYoConsole() {
        //
    }

    private static class SingletonHolder{
        private static final Logger INSTANCE = new Logger();
    }
}