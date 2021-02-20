class CalendarForYear {
    public static void main(String[] args) {
        String[] months = {
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        };
			// ол-во дней в мес€це, соотноситс€ с массивом months
        int[] days = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
			
		String[] dayOfWeek = {
            "Monday",
            "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday",
            
        };
		
		int j=0; // дни недели
		
		for(int k = 0; k < months.length; k++){
			int i = 1; //дни в мес€це
			
			while(i <= days[k]){
				if(j > 6) {j = 0;}
				
			if(j>4){
				System.out.println(months[k] + " " + dayOfWeek[j] + " " + i + " Holiday!");
			}else{
				System.out.println(months[k] + " " + dayOfWeek[j] + " " + i);
				}
			j++;
			i++;
			}
		}
	}
}