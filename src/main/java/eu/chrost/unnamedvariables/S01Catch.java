package eu.chrost.unnamedvariables;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class S01Catch {
    public static void main(String[] args) {
        String s = "Baadf00d";
        try {
            int i = Integer.parseInt(s);
            log.info("Integer: {}", i);
        } catch (NumberFormatException _) {
            log.info("Bad number: {}", s);
        }
    }
}
