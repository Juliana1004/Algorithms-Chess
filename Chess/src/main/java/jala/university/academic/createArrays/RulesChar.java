package jala.university.academic.createArrays;

public enum RulesChar {
    ONECHAR(new String[]{"a"}),
    TWOCHAR(new String[]{"a","b"}),
    FOURCHAR(new String[]{"a", "b","e", "f"}),
    SIXCHAR(new String[]{"a", "b","e", "f","g", "h"}),
    EIGHTCHAR(new String[]{"a", "b", "c", "d", "e", "f", "g", "h"}),
    TENCHAR(new String[]{"i", "j", "k", "l", "m", "n", "o", "p"}),
    SIXTEENCHAR(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
    final String[] value;
    RulesChar(String[] value){
        this.value = value;
    }
    public String[] getValue() {
        return value;
    }
}