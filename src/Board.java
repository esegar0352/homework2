import java.util.Arrays;

public class Board {

    private Shape[] parts = new Shape[4];

    public Board() {
    }

    public Shape[] getParts() {
        return parts;
    }

    public void setParts(Shape[] parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        return "Board{" +
                "parts=" + Arrays.toString(parts) +
                '}';
    }

    public void putShape(Shape shape) {
        for (int i = 0; i < parts.length; i++) {
            if (parts[i] == null) {
                parts[i] = shape;
                break;

            }
        }
        System.out.println("Фигура добавлена");
    }

    public void getArea() {
        double s = 0;
        for (int i = 0; i < parts.length; i++) {
            if (parts[i] != null) {
                s = s + parts[i].getArea();
            }
        }
        System.out.println("Общая площадь всех фигур на доске " + s);
    }

    public void deleteShape (Shape shape) {
        for (int i = 0; i <parts.length ; i++) {
            if (parts[i] != null) {
                if (parts [i].equals(shape)) {
                    parts[i] = null;
                    System.out.println("Фигура удалена!");
                }
            }
        }

    }
}

