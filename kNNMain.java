import java.util.List;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;


public class kNNMain{

  public static void main(String... args) throws FileNotFoundException{

    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label

	// java kNNMain data\iris.cvs
	String pathToData = args[0];
	List<DataPoint> Data = DataSet.readDataSet(pathToData);
	System.out.println(pathToData);
	DataPoint dataPoint = Data.get(75);
	
	System.out.println(dataPoint.getLabel());
	String printX = Arrays.toString(dataPoint.getX());
	System.out.println(printX);
		

    //TASK 2:Use the DataSet class to split the fullDataSet
	//into Training and Held Out Test Dataset
	
	double fractionTestSet = .15;//fraction of total data taken from main set
	List<DataPoint> testSet = DataSet.getTestSet(Data, fractionTestSet); //Create the test set

	dataPoint = testSet.get(0);  //Get a point from the test set
	System.out.println(dataPoint.getLabel()); //print label
	
	printX = Arrays.toString(dataPoint.getX()); 
	System.out.println(printX);//print values
   

   // TASK 3: Use the DataSet class methods to plot the 2D data (binary and multi-class)



    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)



    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label



    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.


  }

  public static double mean(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: average of the elements of array, as a double
    */
    double sum = 0.0;

    for (double a : arr){
      sum += a;
    }
    return (double)sum/arr.length;
  }

  public static double standardDeviation(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: standard deviation of the elements of array, as a double
    Dependencies: requires the *mean* method written above
    */
    double avg = mean(arr);
    double sum = 0.0;
    for (double a : arr){
      sum += Math.pow(a-avg,2);
    }
    return (double)sum/arr.length;
  }

}
