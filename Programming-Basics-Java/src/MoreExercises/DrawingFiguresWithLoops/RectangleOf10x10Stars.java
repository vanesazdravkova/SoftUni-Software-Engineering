package MoreExercises.DrawingFiguresWithLoops;

public class RectangleOf10x10Stars {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
