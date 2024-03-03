package jala.university.academic.createArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Clase que realiza la creación de los arrays.
 */
public class CreateArray {
    public String[] arrayChar(int pieces){
        String[] array = new String[pieces];
        RulesChar[] rules = RulesChar.values();
        for (RulesChar rule :rules){
            switch (pieces){
                case 10:
                    array = rules[5].getValue();
                    break;
                case 8:
                    array = rules[4].getValue();
                    break;
                default:
                    if (rule.getValue().length == pieces){
                        array = rule.getValue();
                    }
                    break;
            }
        }
        return array;
    }
    public String[] arrayInt(int pieces){
        String[] array = new String[pieces];
        RulesInt[] rules = RulesInt.values();
        for (RulesInt rule :rules){
            switch (pieces){
                case 10:
                    array = rules[5].getValue();
                    break;
                case 8:
                    array = rules[4].getValue();
                    break;
                default:
                    if (rule.getValue().length == pieces){
                        array = rule.getValue();
                    }
                    break;
            }
        }
        return array;
    }
    public String[] listOrden(String type, int pieces) {
        String[] array;
        if(type.equals("Carácter")){
            array = arrayChar(pieces);
        }else {
            array=arrayInt(pieces);
        }
        List<String> listToUse = new ArrayList<>(Arrays.asList(array));
        Collections.shuffle(listToUse);
        return listToUse.toArray(new String[0]);
    }
}
