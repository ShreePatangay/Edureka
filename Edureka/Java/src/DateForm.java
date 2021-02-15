import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateForm {

	public DateForm() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException {
		String s = "23-02-2021";
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
		java.util.Date udate = sdf.parse(s);
		long li = udate.getTime();
		java.sql.Date sqlDate = new java.sql.Date(li);
		System.out.println(sqlDate);
}

}
