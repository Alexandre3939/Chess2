package boardgame;

public class Piece {
	
	//attributes
	protected Position position;
	private Board board;
	
	//Constructor
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	//getters and setters
	protected Board getBoard() {
		return board;
	}
	
}
