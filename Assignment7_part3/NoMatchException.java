package Assignment7_part3;



class NoMatchException extends Exception {
    private int lineNumber;
    private String erroneousString;
    public NoMatchException(int lineNumber, String erroneousString) {
        this.lineNumber = lineNumber;
        this.erroneousString = erroneousString;
    }
    public String getMessage() {
        return "Error on line " + lineNumber + ": expected 'India', but got '" + erroneousString + "' instead.";
    }
}