package practice;

public class Main {
    public static void main(String [] args){
        ProThievery a = new ProThievery();
        //int [] money = {1,3,7,9,5,1,7,1,8};
        //int [] money = {7,9,5,1,7,1,8,1,3};
        int [] money = {1,2,3,1};
        //int [] money = {1,0,0,0,0,0,0,0,0,0,0,0,0,90};

        int answer = a.solution(money);

        System.out.println(answer);

    }
}
