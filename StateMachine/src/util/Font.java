package util;

public abstract class Font {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BOLD = "\u001B[1m";
    
    public static String red(String text) {
    	return RED + text + RESET;
    }
    
    public static String bold(String text) {
    	return BOLD + text + RESET;
    }
}
