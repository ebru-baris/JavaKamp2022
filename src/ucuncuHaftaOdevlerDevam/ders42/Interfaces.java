package ucuncuHaftaOdevlerDevam.ders42;

public class Interfaces {

	public static void main(String[] args) {
	//	ICustomerDal customerDal = new OracleCustomerDal();
	//OracleCustomerDal oracleCustomerDal = new OracleCustomerDal(); sistem bağımlı olur sadece oracle de calışır
     CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
     //customerManager.customerDal = new OracleCustomerDal();
     customerManager.add();
	}

}
