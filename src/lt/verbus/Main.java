package lt.verbus;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        SuperPair<String, Object, Long> strObjLongTrio = new SuperPair<>("Anything", new Object(), 20200715L);
        SuperPair<Character, LocalDateTime, Byte> charDateByte = new SuperPair<>('R', LocalDateTime.now(), (byte) 210);

        //        SuperPair<String, String, String> strStrStr = new SuperPair<>("Anything", "Everything", "Nothing");
        // ^^^^^^^Does not compile
    }
}
