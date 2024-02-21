package ch08;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("o-검색");
		
	}

	@Override
	public void insert() {
		System.out.println("o-삽입");
		
	}

	@Override
	public void update() {
		System.out.println("o-수정");
		
	}

	@Override
	public void delete() {
		System.out.println("o-삭제");
		
	}

}
