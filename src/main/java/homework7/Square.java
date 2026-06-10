package homework7;

public class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    public static void main(String[] args) {
        Drawable[] shapes = {
                new Square(),
                new Triangle(),
                new Star()
        };

        for (Drawable d : shapes) {
            d.draw();
        }
    }
}