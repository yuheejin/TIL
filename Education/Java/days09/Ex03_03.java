package Education.Java.days09;

public class Ex03_03 {
    private static boolean checkRRN(String rrn) {

        // String rrn = "830412-1700001";
        // 2가지 : char charAt(0)        -> int
        //         String substring(0,1) -> int
        int total = 0;
        int ㄱ = rrn.charAt(0) - '0';  // '8' -> 8
        //int ㄴ = Integer.parseInt(rrn.substring(1, 2) );  // "3" -> 3
        int ㄴ = rrn.charAt(1) - '0';  // '8' -> 8
        int ㄷ = rrn.charAt(2) - '0';  // '0' -> 8
        int ㄹ = rrn.charAt(3) - '0';  // '8' -> 8
        int ㅁ = rrn.charAt(4) - '0';  // '8' -> 8
        int ㅂ = rrn.charAt(5) - '0';  // '8' -> 8
        //                  6             '-'
        int ㅅ = rrn.charAt(7) - '0';  // '8' -> 8
        int ㅇ = rrn.charAt(8) - '0';  // '8' -> 8
        int ㅈ = rrn.charAt(9) - '0';  // '8' -> 8
        int ㅊ = rrn.charAt(10) - '0';  // '8' -> 8
        int ㅋ = rrn.charAt(11) - '0';  // '8' -> 8
        int ㅌ = rrn.charAt(12) - '0';  // '8' -> 8
        total += ㄱ * 2 + ㄴ * 3 + ㄷ * 4 + ㄹ * 5 + ㅁ * 6 + ㅂ * 7 + ㅅ * 8 + ㅇ * 9 + ㅈ * 2 + ㅊ * 3 + ㅋ * 4 + ㅌ * 5;
        int check = 11 - total % 11;
        if (check == 10) check = 0;
        else if (check == 11) check = 1;

        int ㅍ = rrn.charAt(13) - '0';

        return ㅍ == check;
    } //checkRRN
} //class