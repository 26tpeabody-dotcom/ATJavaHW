package mow;

public class Yard {
    private final char[][] yard;
    private final int lawnHeight;
    private final int lawnWidth;

    public Yard(int height, int width) {
        this.lawnHeight = height;
        this.lawnWidth = width;
        int totalHeight = height + 2;
        int totalWidth = width + 2;
        this.yard = new char[totalHeight][totalWidth];

        for (int i = 0; i < totalHeight; i++) {
            for (int j = 0; j < totalWidth; j++) {
                if (i == 0 || i == totalHeight - 1 || j == 0 || j == totalWidth - 1) {
                    yard[i][j] = 'R';
                } else {
                    yard[i][j] = '+';
                }
            }
        }
    }

    public char getCell(int row, int col) {
        return yard[row][col];
    }

    public void setCell(int row, int col, char value) {
        yard[row][col] = value;
    }

    public int getLawnHeight() {
        return lawnHeight;
    }

    public int getLawnWidth() {
        return lawnWidth;
    }

    public void printYard() {
        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[i].length; j++) {
                System.out.print(yard[i][j]);
            }
            System.out.println();
        }
    }

}
