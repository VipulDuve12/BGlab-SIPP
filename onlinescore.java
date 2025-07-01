import java.util.*;
public class onlinescore {
    // static List<Integer> li = new ArrayList<>();
    // static List<Integer> li1 = new ArrayList<>();
    // static List<Integer> li2 = new ArrayList<>();
    public static void totalcorrectAns(String [] correctans,String [] userans){
        int correct = 0;
        int blank = 0;
        int wrong = correctans.length;
        for(int i = 0;i<userans.length;i++){
            if(userans[i].equals(correctans[i])){
                correct++;
            }
            else if(userans[i] == " "){
                blank++;
            }
            // else{
            //     wrong = wrong - correct;
            // }
        } 
        wrong = wrong - correct;
        System.out.println(correct);
        System.out.println(wrong);
        System.out.println(blank);
    }
    public static String checkans(String correctans[], String userans[]){
        int count = 0;
         for (int i = 0; i < correctans.length; i++) {
            if (correctans[i].equalsIgnoreCase(userans[i])) {
                count++;
            }
        }

        switch (count) {
            case 5: return "A";
            case 4: return "B";
            case 2: return "C";
            default: return "fail";
        }
    }
    public class MCQ_Checker extends onlinescore{
        public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);
            String [] ques = {"Q_1-What is your fav. color",
            "Q_2-which color of shirt do you like",
            "Q_3-color of grass?",
            "Q_4-color of sun?",
            "Q-5-heat absorbing color?"
        };
            String [][] options = {
                {"A. flower", "B. Lily", "C. Lotus", "D. Flower"},
                {"A. Red", "B. blue", "C. Green", "D. Yellow"},
                {"A. green", "B. Black", "C. Pink", "D. Purple"},
                {"A. yellow", "B. Red", "C. Blue", "D. White"},
                {"A. White", "B. black", "C. Green", "D. Grey"}
            };
            String [] correctans = {"A","B","A","A","B"};
            String[] userans = {"A"," ","B"," "," "};
            System.out.println("------------MCQS TEST---------------");
            for(int i=0;i<ques.length;i++){
                System.out.println(ques[i]);
                for (String opt : options[i]) {
                    System.out.println(opt);
                }
                System.out.print("Your Answer");
                if (!userans[i].matches("[A-D]")) {
                    System.out.println("ANSWERING IS NOT MATCHING");
                }
                System.out.println();
            }
             System.out.println("----- Result -----");
            System.out.println("Grade: " + checkans(correctans, userans));
            totalcorrectAns(correctans, userans);
        }
    }
}


