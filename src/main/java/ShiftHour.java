public enum ShiftHour {
    FIRST ("8:00 AM", "4:00 PM"),
    SECOND ("4:00 PM", "12:00 AM"),
    THIRD ("12:00 AM", "8:00 AM");

    private final String startShift;
    private final String endShift;

    ShiftHour(String startShift, String endShift) {
        this.startShift = startShift;
        this.endShift = endShift;
    }

    public String getStartShift() {
        return startShift;
    }

    public String getEndShift() {
        return endShift;
    }
}
