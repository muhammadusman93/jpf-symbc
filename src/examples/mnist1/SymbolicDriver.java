package mnist1;
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
	static String path=paths.paths.spfpath+"src\\examples\\mnist1\\";
	public static void main(String[] args) throws  Exception {
		InternalData data = new InternalData("weights0.txt","weights2.txt","weights5.txt","weights6.txt","biases0.txt","biases2.txt","biases5.txt","biases6.txt");
		System.out.println("NEW IMPLEMENTATION");
		DNNGeneralize.readDataFromFiles(path+"\\params\\",path+"mnist1.json");
		double[] biases0 = (double[]) DNNGeneralize.get_data("biases0");
		double[] biases2 = (double[]) DNNGeneralize.get_data("biases2");
		double[] biases5 = (double[]) DNNGeneralize.get_data("biases5");
		double[] biases6 = (double[]) DNNGeneralize.get_data("biases6");

		double[][][][] weights0 = (double[][][][]) DNNGeneralize.get_data("weights0");
		double[][][][] weights2 = (double[][][][]) DNNGeneralize.get_data("weights2");
		double[][] weights5 = (double[][]) DNNGeneralize.get_data("weights5");
		double[][] weights6 = (double[][]) DNNGeneralize.get_data("weights6");

		for(int i=0;i<8;i++)
		{
			assert(data.biases0[i]==biases0[i]);          	    
		}
		System.out.println("Bias 0 Passed");

		for(int i=0;i<16;i++)
		{
			assert(data.biases2[i]==biases2[i]);          	    
		}
		System.out.println("Bias 2 Passed");

		for(int i=0;i<100;i++)
		{
			assert(data.biases5[i]==biases5[i]);          	    
		}
		System.out.println("Bias 5 Passed");

		for(int i=0;i<10;i++)
		{
			assert(data.biases6[i]==biases6[i]);          	    
		}
		System.out.println("Bias 6 Passed");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<1;k++)
				{
					for(int l=0;l<8;l++)
					{
						assert(data.weights0[i][j][k][l]==weights0[i][j][k][l]);          	
					}
				}
						    
			}	
		}
		System.out.println("Weight 0 Passed");	
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<8;k++)
				{
					for(int l=0;l<16;l++)
					{
						assert(data.weights2[i][j][k][l]==weights2[i][j][k][l]);          	
					}
				}
						    
			}	
		}
		System.out.println("Weight 2 Passed");	
		
		for(int i=0;i<400;i++)
		{
			for(int j=0;j<100;j++)
			{
						assert(data.weights5[i][j]==weights5[i][j]);          	    
			}	
		}
		System.out.println("Weight 5 Passed");
		
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<10;j++)
			{
						assert(data.weights6[i][j]==weights6[i][j]);          	    
			}	
		}
		System.out.println("Weight 6 Passed");		
	}    
}