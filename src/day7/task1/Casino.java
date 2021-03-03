package day7.task1;

/**
 * todo Document type Casino
 */
public class Casino {
    public int playPoker(){
        int winOrLose = (int) ((Math.random()*2) + 1);
        int sum =  (int) ((Math.random()*100000) * Math.pow(-1,winOrLose ));
        System.out.println(sum);
        return sum;

    }
    @Playable
    public int playRoulette(){
        int winOrLose = (int) ((Math.random()*2) + 1);
        int sum =  (int) ((Math.random()*100000) * Math.pow(-1,winOrLose ));
        System.out.println(sum);
        return sum;

    }

    public int playBandit(){
        int winOrLose = (int) ((Math.random()*2) + 1);
        int sum =  (int) ((Math.random()*100000) * Math.pow(-1,winOrLose ));
        System.out.println(sum);
        return sum;

    }
    @Playable
    public int playBlackJack(){
        int winOrLose = (int) ((Math.random()*2) + 1);
        int sum =  (int) ((Math.random()*100000) * Math.pow(-1,winOrLose ));
        System.out.println(sum);
        return sum;

    }

    public int playWheelFortune(){
        int winOrLose = (int) ((Math.random()*2) + 1);
        int sum =  (int) ((Math.random()*100000) * Math.pow(-1,winOrLose ));
        System.out.println(sum);
        return sum;

    }

    public int playBaccarat(){
        int winOrLose = (int) ((Math.random()*2) + 1);
        int sum =  (int) ((Math.random()*100000) * Math.pow(-1,winOrLose ));
        System.out.println(sum);
        return sum;

    }
}
