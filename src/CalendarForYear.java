class CalendarForYear {
    public static void calendar() {
        String[] months = {
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        };
        int[] days = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        String[] dayOfWeek = {
            "Monday",
            "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday",

        };

        int currentDay = 0;

        for(int i = 0; i < months.length; i++){
            for (int j = 1; j <= days[i]; j++){
                boolean isHoliday = (currentDay + 1) % 7 % 6 == 0; //saturday or sunday
                System.out.println(months[i] + " " + dayOfWeek[currentDay%7] + " " + j + (isHoliday ? " Holiday!" : ""));
                currentDay++;
            }
        }
    }
}