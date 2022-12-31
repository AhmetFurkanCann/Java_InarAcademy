package chapters.chapter_04;

public class Exercise_03 {

	public static void main(String[] args) {
		double charlotteX = 35.2270869 ;
		double charlotteY = -80.8431267 ;
		double atlantaX= 33.7489954 ;
		double atlantaY= -84.3879824 ;
		double savannahX= 32.0835407 ;
		double savannahY= -81.0998342 ;
		double orlandoX= 28.5383355 ;
		double orlandoY= -81.3792365 ;
		double distanceCharlotte_Atlanta = 6371.01 * Math.acos(Math.sin(Math.toRadians(charlotteX)) * Math.sin(Math.toRadians(atlantaX)) + Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(charlotteY - atlantaY)));
		double distanceCharlotte_Savannah = 6371.01 * Math.acos(Math.sin(Math.toRadians(charlotteX)) * Math.sin(Math.toRadians(savannahX)) + Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(charlotteY - savannahY)));
		double distanceSavannah_Orlando = 6371.01 * Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(orlandoX)) + Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(savannahY - orlandoY)));
		double distanceOrlando_Atlanta = 6371.01 * Math.acos(Math.sin(Math.toRadians(orlandoX)) * Math.sin(Math.toRadians(atlantaX)) + Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(orlandoY - atlantaY)));
		double distanceSavannah_Atlanta = 6371.01 * Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(atlantaX)) + Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(savannahY - atlantaY)));
		double s1 = (distanceCharlotte_Atlanta + distanceCharlotte_Savannah + distanceSavannah_Atlanta) / 2 ;
		double area1 = Math.sqrt(s1 * (s1 -distanceCharlotte_Atlanta ) * (s1 - distanceCharlotte_Savannah) * (s1 - distanceSavannah_Atlanta ));
		double s2 = (distanceOrlando_Atlanta + distanceSavannah_Orlando + distanceSavannah_Atlanta) / 2 ;
		double area2 = Math.sqrt(s2 * (s2 - distanceOrlando_Atlanta ) * (s2 - distanceSavannah_Orlando) * (s2 - distanceSavannah_Atlanta ));
		System.out.println("Estimated area enclosed by Charlotte - Atlanta - Savannah - Orlando is : " + (area1 + area2));
		
	}

}
