package cifar;
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
	static String path=paths.paths.spfpath+"src\\examples\\cifar\\";
	public static void main(String[] args) throws  Exception {
		System.out.println("NEW IMPLEMENTATION");
		DNNGeneralize.readDataFromFiles(path+"params\\",path+"cifar_complicated.json");
		double[] biases0  = (double[]) DNNGeneralize.get_data("biases0");
		double[] biases2  = (double[]) DNNGeneralize.get_data("biases2");
		double[] biases5  = (double[]) DNNGeneralize.get_data("biases5");
		double[] biases7  = (double[]) DNNGeneralize.get_data("biases7");
		double[] biases11 = (double[]) DNNGeneralize.get_data("biases11");
		double[] biases13 = (double[]) DNNGeneralize.get_data("biases13");

		double[][][][] weights0 = (double[][][][]) DNNGeneralize.get_data("weights0");
		double[][][][] weights2 = (double[][][][]) DNNGeneralize.get_data("weights2");
		double[][][][] weights5 = (double[][][][]) DNNGeneralize.get_data("weights5");
		double[][][][] weights7 = (double[][][][]) DNNGeneralize.get_data("weights7");
		double[][] weights11 = (double[][]) DNNGeneralize.get_data("weights11");
		double[][] weights13 = (double[][]) DNNGeneralize.get_data("weights13");

		assert(biases0[0]==0.027145011350512505);
		System.out.println("Bias 0 Passed");
		
		assert(biases2[0]==0.040954284369945526);
		System.out.println("Bias 2 Passed");
		
		assert(biases5[0]==0.05989118292927742);
		System.out.println("Bias 5 Passed");
		
		assert(biases7[0]==0.046859994530677795);
		System.out.println("Bias 7 Passed");
		
		assert(biases11[0]==-0.011750989593565464);
		System.out.println("Bias 11 Passed");
		
		assert(biases13[0]==-0.07370881736278534);
		System.out.println("Bias 13 Passed");
		
		assert(weights0[0][0][0][0]==0.060511838644742966);
		System.out.println("Weights 0 Passed");
		
		assert(weights2[0][0][0][0]==-0.001662101596593857);
		System.out.println("Weights 2 Passed");
		
		assert(weights5[0][0][0][0]==-0.007634295150637627);
		System.out.println("Weights 5 Passed");
		
		assert(weights7[0][0][0][0]==-0.0320538692176342);
		System.out.println("Weights 7 Passed");
		
		assert(weights11[0][0]==0.11436328291893005);
		System.out.println("Weights 11 Passed");
		
		assert(weights13[0][0]==-0.43622422218322754);
		System.out.println("Weights 13 Passed");
		
		
	}		
}