package colorExercise;

public class HelloColor {

    private ColorPicker colorPicker;

    public HelloColor(ColorPicker colorPicker) {
        this.colorPicker = colorPicker;
    }

    public String hello() {
        String color = colorPicker.getColor();

        if(color.equals("blue")) {
            return "Hello BLUE!";
        }

        if(color.equals("yellow")) {
            return "Hello YELLOW!";
        }

        if(color.equals("red")) {
            return "Hello RED!";
        }

        else {
           return "Hello other!";
        }
    }
}
