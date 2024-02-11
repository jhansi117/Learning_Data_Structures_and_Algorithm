public class AssignmentTrapping {
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        int width = 1;
        //auxillary matrices
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        int volume = 0;
        for(int i=0; i<leftMax.length; i++){
            leftMax[i] = (i==0)?height[i]:Math.max(height[i],leftMax[i-1]);
        }

        for(int i=rightMax.length-1; i>=0; i--){
            rightMax[i] = (i==rightMax.length-1)?height[i]:Math.max(height[i],rightMax[i+1]);

        }

        for(int i=0; i<height.length; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            int tp = 0;
            if(waterLevel<0){
                tp = 0;
            }else{
                tp = (waterLevel - height[i])*width;
            }

            volume = volume + tp;
        }
        
        System.out.println("Trapped water volume = "+volume);

    }
}
