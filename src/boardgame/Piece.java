package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece() {
		// TODO Auto-generated constructor stub
	}

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	public Board getBoard() {
		return board;
	}

	
	
	
	
	
}
