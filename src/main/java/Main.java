public class Main {
    public static void main(String[] args) {
        int result = longestBinaryGap(32);
        System.out.println(result);
    }


//    For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
//    The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
//    The number 20 has binary representation 10100 and contains one binary gap of length 1.
//    The number 15 has binary representation 1111 and has no binary gaps.
//    The number 32 has binary representation 100000 and has no binary gaps.
//    Write a function:
//    that, given a positive integer N, returns the length of its longest binary gap.
//    The function should return 0 if N doesn't contain a binary gap.
//    For example, given N = 1041 the function should return 5,
//    because N has binary representation 10000010001 and so its longest binary gap is of length 5.
//    Given N = 32 the function should return 0,
//    because N has binary representation '100000' and thus no binary gaps.


    public static int longestBinaryGap(int value) {
        String binaryString = Integer.toBinaryString(value);
        System.out.println(binaryString);
        int i = 0;
        int count = 0;
        int longest = 0;
        for (; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) =='1') {
                if(count > longest) {
                    longest = count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return longest;
    }
}
