package thedb;

public class TheDB {

	public TheDB() { }

	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		Database db = new Database();
		db.connect(url, "root", "sqlpassword");
		System.out.println(db.executeStatement("CREATE DATABASE telcatalog_2"));
		String aSql = "CREATE TABLE `telcatalog_2`.`contact` (\r\n" + 
				"  `id` int(11) NOT NULL AUTO_INCREMENT,\r\n" + 
				"  `fname` varchar(45) NOT NULL,\r\n" + 
				"  `lname` varchar(45) DEFAULT NULL,\r\n" + 
				"  `fb` varchar(145) DEFAULT NULL,\r\n" + 
				"  `twitter` varchar(145) DEFAULT NULL,\r\n" + 
				"  `instagram` varchar(145) DEFAULT NULL,\r\n" + 
				"  `birthday` datetime DEFAULT NULL,\r\n" + 
				"  PRIMARY KEY (`id`),\r\n" + 
				"  UNIQUE KEY `fname_UNIQUE` (`fname`)\r\n" + 
				") ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8";
		System.out.println(db.executeStatement(aSql));
		
	}

}





