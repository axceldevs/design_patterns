package com.axceldev.design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import static com.axceldev.design_patterns.creational.prototype.PrototypeFactory.cardType.AMEX;
import static com.axceldev.design_patterns.creational.prototype.PrototypeFactory.cardType.VISA;

public class PrototypeFactory {

    public static class cardType {
        public static final String VISA = "Visa";
        public static final String AMEX = "Amex";
    }

    public static Map<String, PrototypeCard> prototypeCardMap = new HashMap<String, PrototypeCard>();

    public static PrototypeCard getInstance(final String cardType)
            throws CloneNotSupportedException {
        return prototypeCardMap.get(cardType).clone();
    }

    public static void loadCard(){
        Visa visa = new Visa();
        visa.setName("Visa with number 00000000");
        prototypeCardMap.put(VISA, visa);

        Amex amex = new Amex();
        amex.setName("Amex with number 00000000");
        prototypeCardMap.put(AMEX, amex);
    }
}
