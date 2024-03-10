package test;

public class Pa50 {
    private String pa301;
    private String pa133;

    public Pa50() {
    }

    public Pa50(String pa301, String pa133) {
        this.pa301 = pa301;
        this.pa133 = pa133;
    }

    public String getPa133() {
        return pa133;
    }

    public void setPa133(String pa133) {
        this.pa133 = pa133;
    }

    public String getPa301() {
        return pa301;
    }

    public void setPa301(String pa301) {
        this.pa301 = pa301;
    }

    @Override
    public String toString() {
        return "Pa50{" +
                "pa301='" + pa301 + '\'' +
                ", pa133='" + pa133 + '\'' +
                '}';
    }
}
