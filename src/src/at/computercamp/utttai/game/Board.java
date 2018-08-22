package at.computercamp.utttai.game;

import at.computercamp.utttai.networking.Protocol;

import java.util.ArrayList;

public class Board {

    private ArrayList<Position> positions = new ArrayList<>();


    public Board() {

    }

    public Board(Board board) { }

    public Board(Protocol protocol) {

    }

    public void updateBoardFromProtocol(Protocol protocol) {
        for (int x = 0; x < 9; x++ ) {
            for (int y = 0; y < 9; y++) {
                Position position = new Position(x, y, protocol.getCells()[x][y]);
                System.out.println(position.getX());
            }
        }
    }

    public ArrayList<Position> getPositions() {
        return positions;
    }

    public void setPositions(ArrayList<Position> positions) {
        this.positions = positions;
    }

    public Board copyToTemporaryBoard() {
        Board temporary = this;
        return temporary;
    }


}