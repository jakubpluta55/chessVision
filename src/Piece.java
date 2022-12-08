public abstract class Piece {

    int currentSquare;
    int targetSquare;
    String imgFile;

    public Piece(int currentSquare, int targetSquare, String imgFile) {
        this.currentSquare = currentSquare;
        this.targetSquare = targetSquare;
        this.imgFile = imgFile;
    }

    public void setCurrentSquare(int currentSquare) {
        this.currentSquare = currentSquare;
    }

    public void setTargetSquare(int targetSquare) {
        this.targetSquare = targetSquare;
    }

    public void setImgFile(String imgFile) {
        this.imgFile = imgFile;
    }

    public int getCurrentSquare() {
        return currentSquare;
    }

    public int getTargetSquare() {
        return targetSquare;
    }

    public String getImgFile() {
        return imgFile;
    }

}

