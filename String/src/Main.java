/* Print position of character in alphabets
-------------------------------------------------*/

//class Word{
//    public static void main(String[] args) {
//        String word = "Hello";
//
//        for(int i = 0 ; i<word.length();i++){
//            word = word.toUpperCase();
//            System.out.print((int)word.charAt(i)-64);
//
//        }
//    }
//}

/* Print position of sentence character in Alphabets
-------------------------------------------------*/
//class Sentence{
//    public static void main(String[] args) {
//        String sentence = "Hello World";
//
//        for(int i = 0 ; i<sentence.length();i++){
//            sentence = sentence.toUpperCase();
//            if(sentence.charAt(i) == ' '){
//                System.out.print(" ");
//            }else {
//                System.out.print((int)sentence.charAt(i)-64);
//            }
//        }
//    }
//}

/* Print concat of words like World wide web

   STEP 1 :-
   World = [W-D]+[O-L]+[R] = [23-4]+[15-12]+[10] = 40
   wide = [W-E] + [I-D] = [23-5] + [9-4] = 23
   web = [W-B]+[E] = 26

    STEP 2 :- Concat Result of each word
    [40] + [23] + [26] = "402326"

    STEP 3 :- Convert Step-2 into int
        "402326" --convert-> 402326

        Note:- Make it generalized
        [D-W] = [4-23] = -19 -----> 19 */

class Main {
    public static void main(String[] args) {

        String s = "World wide web";

    }
}


















