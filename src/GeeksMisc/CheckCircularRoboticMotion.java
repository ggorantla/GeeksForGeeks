package GeeksMisc;
/**
 * Created by ggorantla on 3/26/2015.
 * http://www.geeksforgeeks.org/check-if-a-given-sequence-of-moves-for-a-robot-is-circular-or-not/* 
 */
public class CheckCircularRoboticMotion {
    
    private static final int N = 0; //N stands for North 
    private static final int E = 1;
    private static final int S = 2;
    private static final int W = 3;
    
    
    
    
    private boolean isCircularRoboticMotion(String steps){
        
        int x = 0, y = 0;
        int dir  = N;
        for (int i = 0; i < steps.length(); i++){
            char step = steps.charAt(i);
            /* Two possibilities:
                    1.) Right or Left , in which case we need to move to N, E, S, W directions (affect dir variable
                    2.) G ( go forward ) , in which case we need to change x, y directions
            */
            if(step == 'L' || step == 'R'){
                if (step == 'R'){
                    dir = (dir+1)%4;
                }else {
                    dir = (dir+3) % 4;   // You can name it as dir +4 -1 .. Left = 3 times R
                }
            }else { // It is G
                /*   North and south affects the y - axis in +ve and -ve way
                     East and West affects the x - axis in +ve and -ve way respectively.
                                N
                                |
                                |
                                |
                     W  ------------------E
                                |
                                |
                                |
                                S

                */
                if (dir == N)
                    y++;
                else if (dir == S)
                    y--;
                else if (dir == E)
                    x++;
                else 
                    x--;
            }
        }

        return x == 0 && y == 0;

    }
    
    
    
    
    public static void main(String[] args) {
        String steps = "GLLG";
        steps = "GLGLGLGL";
        steps = "GLGRGLGLGGLGG";
        boolean result;
        if (new CheckCircularRoboticMotion().isCircularRoboticMotion(steps)) result = true;
        else result = false;
        System.out.println(result);
    }
}
