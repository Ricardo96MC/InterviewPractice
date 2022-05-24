package src.com.company.RobotBounded;

public class BoundedRobot {


    private String instructionsCircle = "GGLLGG";

    private boolean isRobotBounced(String instructions) {

        int[] pos = new int[]{0,0};

        System.out.println("Here are the instructions: " + instructions);
        //              North  East   South   West
        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};

        int facing = 0;
        char[] ins = instructions.toCharArray();

        for(char c: ins){
            if (c == 'L')
                facing = facing == 0 ? 3: facing - 1;
            else if (c == 'R')
                facing = facing == 3 ? 0 : facing - 1;
            else {
                pos[0] = pos[0] + dirs[facing][0];
                pos[1] = pos[1] + dirs[facing][1];
            }
        }

        return (facing != 0 || (pos[0] == 0 && pos[1] == 0));
    }

    public void driver(){
        System.out.println(isRobotBounced(instructionsCircle));
    }
}
