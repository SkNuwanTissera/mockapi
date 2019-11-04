package hello;

public class Greeting {
    public Greeting() {
    }

    public Greeting(String referenceid, String responseMessage, int responseCode, String displayMessage) {
        this.referenceid = referenceid;
        this.responseMessage = responseMessage;
        this.responseCode = responseCode;
        this.displayMessage = displayMessage;
    }

    public String getReferenceid() {
        return referenceid;
    }

    public void setReferenceid(String referenceid) {
        this.referenceid = referenceid;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }

    private String referenceid;
    private  String responseMessage;
    private int responseCode;
    private String displayMessage;



}
