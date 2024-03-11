package jala.university.academic.createArrays;

public enum RulesInt {
    ONEINT(new String[]{"1"}),
    TWOINT(new String[]{"1","2"}),
    FOURINT(new String[]{"1", "2","5", "6"}),
    SIXINT(new String[]{"1", "2","5", "6","7", "8"}),
    EIGHTINT(new String[]{"1", "2", "3", "4", "5", "6", "7", "8"}),
    TENINT(new String[]{"9", "10", "11", "12", "13", "14", "15", "16"}),
    SIXTEENINT(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"});
    final String[] value;
    RulesInt (String[] value){
        this.value = value;
    }
    public String[] getValue() {
        return value;
    }
}
