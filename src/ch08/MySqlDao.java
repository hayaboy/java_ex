package ch08;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("m-검색");
		
	}

	@Override
	public void insert() {
		System.out.println("m-삽입");
		
	}

	@Override
	public void update() {
		System.out.println("m-수정");
		
	}

	@Override
	public void delete() {
		System.out.println("m-삭제");
		
	}

}
