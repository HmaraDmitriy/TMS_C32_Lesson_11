package com.teachmeskills.lesson_11.servis;

public class ServiceOperation {

        public static void printFirstTwoBlocks(String documentNumber) {
            String[] blocks = documentNumber.split("-");
            System.out.println(blocks[0] + " " + blocks[2]);
        }

        public static void printDocumentNum(String documentNumber) {
            String masked = documentNumber.replaceAll("[a-zA-Z]{3}", "***");
            System.out.println(masked);
        }

        public static void printLettersOnly(String documentNumber) {
            String lettersOnly = documentNumber.replaceAll("[^a-zA-Z]", "").toLowerCase();
            System.out.println(lettersOnly.substring(0, 3) + "/"
                    + lettersOnly.substring(3, 6) + "/"
                    + lettersOnly.charAt(6) + "/"
                    + lettersOnly.charAt(7));
        }

        public static void printLetters(String documentNumber) {
            String lettersOnly = documentNumber.replaceAll("[^a-zA-Z]", "").toUpperCase();
            StringBuilder result = new StringBuilder("Letters:");
            result.append(lettersOnly.substring(0, 3)).append("/")
                  .append(lettersOnly.substring(3, 6)).append("/")
                  .append(lettersOnly.charAt(6)).append("/")
                  .append(lettersOnly.charAt(7));
            System.out.println(result);
        }

        public static void checkABC(String documentNumber) {
            if (documentNumber.toLowerCase().contains("abc")) {
                System.out.println("Number contains the sequence 'abc'.");
            } else {
                System.out.println("Number does not contain the sequence 'abc'.");
            }
        }

        public static void checkStarts555(String documentNumber) {
            if (documentNumber.startsWith("555")) {
                System.out.println("Number starts with '555'.");
            } else {
                System.out.println("Number does not start with '555'.");
            }
        }

        public static void checkEnds1a2b(String documentNumber) {
            if (documentNumber.endsWith("1a2b")) {
                System.out.println("Number ends with '1a2b'.");
            } else {
                System.out.println("Number does not end with '1a2b'.");
            }
        }
}

