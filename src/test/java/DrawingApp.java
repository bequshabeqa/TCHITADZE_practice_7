public class DrawingApp {
    public static void main(String[] args) {
        System.out.println("ინფორმაცია გეომეტრიულ ფიგურაზე: ");

        System.out.print("წრე: ");
        Circle circle = new Circle();
        startDrawing(circle);

        System.out.print("მართკუთხედი: ");
        Rectangle rectangle = new Rectangle();
        startDrawing(rectangle);

        System.out.print("სამკუთხედი: ");
        Triangle triangle = new Triangle();
        startDrawing(triangle);

    }
    static void startDrawing(Shape shape) {
        shape.draw();
    }
}
