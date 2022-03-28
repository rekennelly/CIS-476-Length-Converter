/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LengthConverter;

/**
 *
 * @author kennelra
 */
public class FootHandler implements Handler {
    private Handler handler;
    private String handlerName = "Foot Handler";

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public String process(String input, String choice) {
        if (choice.equals("foot")) {
            // convert string to double
            double kmValue = Double.parseDouble(input);
            // convert kilometers to miles
            double valInFeet = kmValue * 3280.839895;
            // return string with "miles" added to end
            String feetString = String.valueOf(valInFeet) + " feet";
            return feetString;
        }
        else if (handler != null) {
            System.out.println(handlerName + " forwards request to " + handler.getHandlerName());
            return handler.process(input, choice);
        }
        else {
            System.out.println("Error.");
            return "ERROR";
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
