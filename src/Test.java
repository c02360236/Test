import calories.model.MenuVO;
import calories.model.dao.MenuDaoJdbc;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuDaoJdbc temp=new MenuDaoJdbc();
//		System.out.println(temp.selectByPrimaryKey(100015));
//		System.out.println(temp.getAll());
//		MenuVO temp1=new MenuVO();		
//		temp1.setName("香蕉");
//		temp.insert(temp1);
		temp.delete(100019);

		
	}

}
