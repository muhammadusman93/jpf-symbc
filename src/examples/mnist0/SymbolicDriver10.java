package mnist0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

import gov.nasa.jpf.symbc.Debug;
import gov.nasa.jpf.symbc.DNN;
import gov.nasa.jpf.symbc.DNNDataGeneralize;
import gov.nasa.jpf.symbc.DNNGeneralize;
public class SymbolicDriver10 {
	static final int IMG_HEIGHT = 28;
	static final int IMG_WIDTH = 28; 
	static String originalconstraints="";
	public static double[][][][] weights0;
	public static double[][][][] weights2;
	public static double[][] weights6;
	public static double[][] weights8;
	public static double[] biases0;
	public static double[] biases2;
	public static double[] biases6;
	public static double[] biases8;
	public static void main(String[] args) throws  Exception {
		System.out.println("OLD IMPLEMENTATION");
		mnist0.DNNt modelold = new mnist0.DNNt();    
		DNN.readDataFromFiles(DNNt.path+"params\\");
		modelold.biases0 = DNN.getBiases0();
		modelold.biases2 = DNN.getBiases2();
		modelold.biases6 = DNN.getBiases6();
		modelold.biases8 = DNN.getBiases8();
		modelold.weights0 = DNN.getWeights0();
		modelold.weights2 = DNN.getWeights2();
		modelold.weights6 = DNN.getWeights6();
		modelold.weights8 = DNN.getWeights8();
		System.out.println("NEW IMPLEMENTATION");
		mnist0.DNNt modelnew = new mnist0.DNNt();  
		DNNGeneralize.readDataFromFiles(DNNt.path+"params\\",DNNt.path+"mnist0.json");
		modelnew.biases0 = (double[]) DNNGeneralize.get_data("biases0");
		modelnew.biases2 = (double[]) DNNGeneralize.get_data("biases2");
		modelnew.biases6 = (double[]) DNNGeneralize.get_data("biases6");
		modelnew.biases8 = (double[]) DNNGeneralize.get_data("biases8");
		modelnew.weights0 = (double[][][][]) DNNGeneralize.get_data("weights0");
		modelnew.weights2 = (double[][][][]) DNNGeneralize.get_data("weights2");
		modelnew.weights6 = (double[][]) DNNGeneralize.get_data("weights6");
		modelnew.weights8 = (double[][]) DNNGeneralize.get_data("weights8");
		for (int i=0; i<2; i++) {
			assert(modelold.biases0[i]==modelnew.biases0[i]);
		}
		System.out.println("Bias 0 Passed");
		for (int i=0; i<4; i++) {
			assert(modelold.biases2[i]==modelnew.biases2[i]);
		}
		System.out.println("Bias 2 Passed");
		for (int i=0; i<128; i++) {
			assert(modelold.biases6[i]==modelnew.biases6[i]);
		}
		System.out.println("Bias 6 Passed");		
		for (int i=0; i<10; i++) {
			assert(modelold.biases8[i]==modelnew.biases8[i]);
		}
		System.out.println("Bias 8 Passed");		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				for (int k=0; k<1; k++) {
					for (int l=0; l<2; l++) {
						assert(modelold.weights0[i][j][k][l]==modelnew.weights0[i][j][k][l]);
					}
				}
			}
		}
		System.out.println("Weight 0 Passed");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				for (int k=0; k<2; k++) {
						for (int l=0; l<4; l++) {
						assert(modelold.weights2[i][j][k][l]==modelnew.weights2[i][j][k][l]);          	    
					}
				}
			}
		}
		System.out.println("Weight 2 Passed");		
		for (int i=0; i<576; i++) {
			for (int j=0; j<128; j++) {
				assert(modelold.weights6[i][j]==modelnew.weights6[i][j]);
			}
		}  
		System.out.println("Weight 6 Passed");
		for (int i=0; i<128; i++) {
			for (int j=0; j<10; j++) {
				assert(modelold.weights8[i][j]==modelnew.weights8[i][j]);
			}
		} 
		System.out.println("Weight 8 Passed");
		
	}
	
}
