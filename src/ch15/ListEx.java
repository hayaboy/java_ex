package ch15;

import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		BoardDAO dao=new BoardDAO();
		
		List<Board> boardLists=dao.getBoardList();
		
		for(Board board : boardLists) {
			System.out.println(board.getTitle() + " - "  + board.getContent());
		}
		
	}

}
