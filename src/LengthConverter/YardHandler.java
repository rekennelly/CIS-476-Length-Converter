/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LengthConverter;

/**
 *
 * @author kennelra
 */
public class YardHandler implements Handler {
    private Handler handler;
    private String handlerName = "Yard Handler";

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public String process(String input, String choice) {
        if (choice.equals("yard")) {
            // convert string to double
            double kmValue = Double.parseDouble(input);
            // convert kilometers to miles
            double valInYards = kmValue * 1093.613298;
            // return string with "miles" added to end
            String yardsString = String.valueOf(valInYards) + " yards";
            return yardsString;
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
