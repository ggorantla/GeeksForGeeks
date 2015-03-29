package DynamicProgramming;

import java.util.Arrays;

/**
 * Created by ggorantla on 3/28/2015.
 * http://www.geeksforgeeks.org/find-the-minimum-cost-to-reach-a-destination-where-every-station-is-connected-in-one-direction/* 
 *          This is more of DAG category* 
 */
public class MinCostToReachDestination {
    private double getMinCost(double[][] costMatrix){
        double[] costs = new double[costMatrix.length];
        Arrays.fill(costs,Double.MAX_VALUE);
        costs[0] = 0.0;
        costs[1] = costMatrix[0][1];
        for (int i = 0; i < costMatrix.length; i++){
            for (int j = i+1;j < costMatrix.length; j++){
                if (costs[j] > costs[i]+costMatrix[i][j])
                    costs[j] = costs[i] + costMatrix[i][j];
            }
        }
        return costs[costMatrix.length-1];
    }
}
