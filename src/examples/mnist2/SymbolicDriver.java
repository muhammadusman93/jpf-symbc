package mnist2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.apache.commons.lang.StringUtils;

import gov.nasa.jpf.symbc.Debug;
import gov.nasa.jpf.symbc.DNN;
import gov.nasa.jpf.symbc.DNNDataGeneralize;
import gov.nasa.jpf.symbc.DNNGeneralize;
public class SymbolicDriver {
	static final int IMG_HEIGHT = 28; /* 28 */
	static final int IMG_WIDTH = 28; /* 28 */
	static String path=paths.paths.spfpath+"src\\examples\\mnist2\\";
	public static void main(String[] args) throws  Exception {
		InternalData data = new InternalData("weights0.txt","weights1.txt","weights2.txt","biases0.txt","biases1.txt","biases2.txt");
		System.out.println("NEW IMPLEMENTATION");
		DNNGeneralize.readDataFromFiles(path+"params\\",path+"mnist2.json");
		double[] biases0 = (double[]) DNNGeneralize.get_data("biases0");
		double[] biases1 = (double[]) DNNGeneralize.get_data("biases1");
		double[] biases2 = (double[]) DNNGeneralize.get_data("biases2");
		double[][] weights0 = (double[][]) DNNGeneralize.get_data("weights0");
		double[][] weights1 = (double[][]) DNNGeneralize.get_data("weights1");
		double[][] weights2 = (double[][]) DNNGeneralize.get_data("weights2");
	
		for(int i=0;i<50;i++)
		{
			assert(data.biases0[i]==biases0[i]);          	    
		}
		System.out.println("Bias 0 Passed");
		
		for(int i=0;i<10;i++)
		{
			assert(data.biases1[i]==biases1[i]);          	    
		}
		System.out.println("Bias 1 Passed");
		
		for(int i=0;i<10;i++)
		{
			assert(data.biases2[i]==biases2[i]);          	    
		}
		System.out.println("Bias 2 Passed");		
	
		for(int i=0;i<784;i++)
		{
			for(int j=0;j<50;j++)
			{
				assert(data.weights0[i][j]==weights0[i][j]);    
			}
		}		
	
		System.out.println("Weight 0 Passed");
	
		for(int i=0;i<50;i++)
		{
			for(int j=0;j<10;j++)
			{
				assert(data.weights1[i][j]==weights1[i][j]);          	    
			}	
		}
		System.out.println("Weight 1 Passed");		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				assert(data.weights2[i][j]==weights2[i][j]);    
			}
		}
		System.out.println("Weight 2 Passed");
	}    
}