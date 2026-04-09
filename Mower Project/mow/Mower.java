package mow;

public class Mower {
    private int row;
    private int col;
    private int direction;

    public Mower(int row, int col, int direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void moveForward() {
        if (direction == 0) {
            row = row - 1;
        } else if (direction == 1) {
            col = col + 1;
        } else if (direction == 2) {
            row = row + 1;
        } else if (direction == 3) {
            col = col - 1;
        }
    }

    public void turnLeft() {
        direction = direction - 1;
        if (direction < 0) {
            direction = 3;
        }
    }

    public void turnRight() {
        direction = direction + 1;
        if (direction > 3) {
            direction = 0;
        }
    }

    public char senseAhead(Yard yard) {
        int nextRow = row;
        int nextCol = col;

        if (direction == 0) {
            nextRow = row - 1;
        } else if (direction == 1) {
            nextCol = col + 1;
        } else if (direction == 2) {
            nextRow = row + 1;
        } else if (direction == 3) {
            nextCol = col - 1;
        }

        return yard.getCell(nextRow, nextCol);
    }

    public void cutGrass(Yard yard) {
        yard.setCell(row, col, ' ');
    }

    public void randomizeMower(Yard yard) {
        int corner = (int) (Math.random() * 4);

        if (corner == 0) {
            row = 1;
            col = 1;
        } else if (corner == 1) {
            row = 1;
            col = yard.getLawnWidth();
        } else if (corner == 2) {
            row = yard.getLawnHeight();
            col = 1;
        } else {
            row = yard.getLawnHeight();
            col = yard.getLawnWidth();
        }

        direction = (int) (Math.random() * 4);
    }

    public boolean updateMower(Yard yard) {
        if (!hasUnmowedSpots(yard)) {
            return false;
        }

        if (senseAhead(yard) == '+') {
            moveForward();
            return true;
        }

        if (senseRight(yard) == '+') {
            turnRight();
            moveForward();
            return true;
        }

        if (senseLeft(yard) == '+') {
            turnLeft();
            moveForward();
            return true;
        }

        if (senseAhead(yard) != 'R') {
            moveForward();
            return true;
        }

        if (senseRight(yard) != 'R') {
            turnRight();
            moveForward();
            return true;
        }

        if (senseLeft(yard) != 'R') {
            turnLeft();
            moveForward();
            return true;
        }

        turnRight();
        turnRight();
        if (senseAhead(yard) != 'R') {
            moveForward();
            return true;
        }

        return false;
    }

    private char senseRight(Yard yard) {
        turnRight();
        char sensed = senseAhead(yard);
        turnLeft();
        return sensed;
    }

    private char senseLeft(Yard yard) {
        turnLeft();
        char sensed = senseAhead(yard);
        turnRight();
        return sensed;
    }

    private boolean hasUnmowedSpots(Yard yard) {
        for (int i = 1; i <= yard.getLawnHeight(); i++) {
            for (int j = 1; j <= yard.getLawnWidth(); j++) {
                if (yard.getCell(i, j) == '+') {
                    return true;
                }
            }
        }
        return false;
    }
}
