package lect06;

public class MainStudent {
	public static void main(String[] args) {
		
		long id = 123;
		String name = "Phattharadanai";
		String surname = "Khotniya";
		
		Student st = new Student();
		st.setId(id);
		st.setName(name);
		st.setSurname(surname);
		
		System.out.println("st:" + st.toString());
		System.out.println("st.getId:" + st.getId());
		System.out.println("st.getName:" + st.getName());
		System.out.println("st.getSurname:" + st.getSurname());
		
	}

}
