class Employee{
	String empName = "kshitiz";
}
class ITCompany{
	private ITCompany(){
	}
	String itcName = "gla university";
	public static ITCompany getObjectForITCompany(){
		return new ITCompany();
	}
	Employee getObjectForEmployee(){
		return new Employee();
	}
}
class FMDemo{
	public static void main(String[] s){
		//ITCompany itc = new ITCompany();
		ITCompany itc = ITCompany.getObjectForITCompany();
		System.out.println(itc.itcName);
		Employee e = itc.getObjectForEmployee();
		System.out.println(e.empName);
	}
}