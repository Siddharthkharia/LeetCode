package hard;

public class DeliveringBoxesfromStoragetoPorts {

    public int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {

        int n=boxes.length;
        int trip=0;

        for(int i=0;i<n;i++){

            int totalBox=1;
            int totalW = boxes[i][i];
            int till=i;
            for(int j=i+1;j<n;j++){
                if(boxes[i]==boxes[j]){
                    if(totalBox+1<maxBoxes){

                    }
                }else{
                    till=i;
                }
            }


            while(totalBox<maxBoxes && totalW<maxWeight && i<n-2 && boxes[i]==boxes[i+1]){
                if(totalBox+1<maxBoxes){
//                    if (totalW+boxes)
                }

            }


        }
        return trip;
    }

}
