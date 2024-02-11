import java.math.*;
public class TrappingRainWater {

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int width = 1;
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        int volume = 0;
        //calculate the two auxillary arrays
        for(int i=0; i<leftMax.length; i++){
            leftMax[i] = (i==0)?leftMax[i] = height[i]:Math.max(height[i], leftMax[i-1]);
        }
        
        for(int i=rightMax.length-1; i>=0; i--){
            rightMax[i] = (i==rightMax.length-1)?height[i]:Math.max(height[i],rightMax[i+1]);
        }
        //calculating the water level and the trapped water above each bar.
        for(int i=0; i<height.length; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            int tp = 0;
            if(waterLevel<0){
                tp = 0;
            }else{
                tp = (waterLevel-height[i]) * width; 
            }
            //calculating the total volume of trapped water.
            volume = volume + tp;
        }

        System.out.println("Total volume = "+volume);
        



    }
    
}
