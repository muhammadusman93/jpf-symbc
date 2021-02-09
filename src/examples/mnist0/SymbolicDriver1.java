package mnist0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import gov.nasa.jpf.symbc.Debug;
import gov.nasa.jpf.symbc.DNN;
import gov.nasa.jpf.symbc.DNNDataGeneralize;
import gov.nasa.jpf.symbc.DNNGeneralize;
public class SymbolicDriver1 {
	static final int IMG_HEIGHT = 28;
	static final int IMG_WIDTH = 28; 
	static String originalconstraints="0.14664430775345408\n" + 
			"( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( *  ( +  ( +  sym0 0.06040273979306221) sym0) 7.8528145302460866) 0.025580881163477898) ( *  ( +  ( +  sym1 0.017684385180473328) sym1) 0.0)) ( *  ( +  ( +  sym2 0.012765026651322842) sym2) 0.0)) ( *  ( +  ( +  sym3 -0.06803001463413239) sym3) 0.0)) ( *  ( +  ( +  sym4 -0.023076770827174187) sym4) 1.1627207727961908)) ( *  ( +  ( +  sym5 0.009623080492019653) sym5) 0.0)) ( *  ( +  ( +  sym6 0.02263144589960575) sym6) 0.0)) ( *  ( +  ( +  sym7 0.03620552271604538) sym7) 7.503430402944146)) ( *  ( +  ( +  sym8 -0.030558135360479355) sym8) 0.0)) ( *  ( +  ( +  sym9 -0.027679575607180595) sym9) 0.0)) ( *  ( +  ( +  sym10 0.01953713223338127) sym10) 9.498240194461145)) ( *  ( +  ( +  sym11 -0.054155513644218445) sym11) 0.0)) ( *  ( +  ( +  sym12 -0.021140141412615776) sym12) 0.0)) ( *  ( +  ( +  sym13 -0.01356428861618042) sym13) 0.0)) ( *  ( +  ( +  sym14 -0.04274316877126694) sym14) 3.1340272119766315)) ( *  ( +  ( +  sym15 -0.00092102080816403) sym15) 7.370770766546161)) ( *  ( +  ( +  sym16 -0.06416237354278564) sym16) 0.6152268880744114)) ( *  ( +  ( +  sym17 -0.015030552633106709) sym17) 0.0)) ( *  ( +  ( +  sym18 -0.08396612107753754) sym18) 4.010305709728787)) ( *  ( +  ( +  sym19 -0.06001695618033409) sym19) 0.0)) ( *  ( +  ( +  sym20 0.028006326407194138) sym20) 7.570037693803757)) ( *  ( +  ( +  sym21 0.050585709512233734) sym21) 12.38958681087306)) ( *  ( +  ( +  sym22 0.03286182880401611) sym22) 3.499445866004157)) ( *  ( +  ( +  sym23 -0.021105945110321045) sym23) 4.543187623523298)) ( *  ( +  ( +  sym24 -0.015805533155798912) sym24) 1.2838341847689445)) ( *  ( +  ( +  sym25 0.058033909648656845) sym25) 0.0)) ( *  ( +  ( +  sym26 -0.006269176490604877) sym26) 2.0939362025957773)) ( *  ( +  ( +  sym27 0.05482475832104683) sym27) 2.67103654330972)) ( *  ( +  ( +  sym28 0.06964085251092911) sym28) 2.5225652112516346)) ( *  ( +  ( +  sym29 0.000994394649751484) sym29) 1.5238403093107038)) ( *  ( +  ( +  sym30 -0.02667786367237568) sym30) 7.6640183198026115)) ( *  ( +  ( +  sym31 -0.04651440307497978) sym31) 3.8617166200426363)) ( *  ( +  ( +  sym32 0.006041393149644136) sym32) 6.468405644449917)) ( *  ( +  ( +  sym33 -0.057458095252513885) sym33) 0.16465390147386258)) ( *  ( +  ( +  sym34 0.03075466863811016) sym34) 6.067605572736535)) ( *  ( +  ( +  sym35 0.029297197237610817) sym35) 8.095178414784668)) ( *  ( +  ( +  sym36 0.05769411846995354) sym36) 2.1133994971134755)) ( *  ( +  ( +  sym37 -0.07411715388298035) sym37) 5.590175643510979)) ( *  ( +  ( +  sym38 0.028128691017627716) sym38) 0.6146800638163119)) ( *  ( +  ( +  sym39 -0.0640740841627121) sym39) 3.947542830151481)) ( *  ( +  ( +  sym40 0.048483770340681076) sym40) 7.7020348129321015)) ( *  ( +  ( +  sym41 -0.01211019791662693) sym41) 0.0)) ( *  ( +  ( +  sym42 -0.07780124992132187) sym42) 5.297366253220231)) ( *  ( +  ( +  sym43 -0.02733311615884304) sym43) 0.8185578136752752)) ( *  ( +  ( +  sym44 -0.08698120713233948) sym44) 0.0)) ( *  ( +  ( +  sym45 0.020144321024417877) sym45) 0.0)) ( *  ( +  ( +  sym46 0.0513918437063694) sym46) 0.0)) ( *  ( +  ( +  sym47 0.000007609196472913) sym47) 6.586609688077901)) ( *  ( +  ( +  sym48 -0.03294389694929123) sym48) 0.0)) ( *  ( +  ( +  sym49 0.05936562269926071) sym49) 4.876302636475785)) ( *  ( +  ( +  sym50 0.029302367940545082) sym50) 0.0)) ( *  ( +  ( +  sym51 -0.03383682668209076) sym51) 1.734731091859878)) ( *  ( +  ( +  sym52 -0.04761601239442825) sym52) 0.0)) ( *  ( +  ( +  sym53 0.023945782333612442) sym53) 0.0)) ( *  ( +  ( +  sym54 0.00404988182708621) sym54) 0.8660486496871301)) ( *  ( +  ( +  sym55 -0.03822318837046623) sym55) 0.0)) ( *  ( +  ( +  sym56 -0.007271361071616411) sym56) 0.0)) ( *  ( +  ( +  sym57 0.04725171625614166) sym57) 5.470685139287833)) ( *  ( +  ( +  sym58 -0.011354983784258366) sym58) 0.0)) ( *  ( +  ( +  sym59 -0.01912991888821125) sym59) 0.0)) ( *  ( +  ( +  sym60 0.014046508818864822) sym60) 0.0)) ( *  ( +  ( +  sym61 0.02719879150390625) sym61) 0.0)) ( *  ( +  ( +  sym62 0.01776411198079586) sym62) 6.902816251366467)) ( *  ( +  ( +  sym63 -0.07997887581586838) sym63) 1.313977199231427)) ( *  ( +  ( +  sym64 0.04653485491871834) sym64) 5.802447247448775)) ( *  ( +  ( +  sym65 -0.03327186405658722) sym65) 0.0)) ( *  ( +  ( +  sym66 0.053006358444690704) sym66) 0.0)) ( *  ( +  ( +  sym67 0.07324285060167313) sym67) 0.0)) ( *  ( +  ( +  sym68 0.005787370260804892) sym68) 0.0)) ( *  ( +  ( +  sym69 0.006530534941703081) sym69) 0.0)) ( *  ( +  ( +  sym70 -0.019641106948256493) sym70) 0.0)) ( *  ( +  ( +  sym71 0.033933233469724655) sym71) 0.0)) ( *  ( +  ( +  sym72 -0.03059055469930172) sym72) 0.0)) ( *  ( +  ( +  sym73 0.02683115191757679) sym73) 0.0)) ( *  ( +  ( +  sym74 -0.010089700110256672) sym74) 7.027821020628239)) ( *  ( +  ( +  sym75 0.05492616072297096) sym75) 6.520482746967194)) ( *  ( +  ( +  sym76 0.0551222562789917) sym76) 1.7765344222853925)) ( *  ( +  ( +  sym77 -0.05326997861266136) sym77) 0.0)) ( *  ( +  ( +  sym78 0.005696583539247513) sym78) 9.378126512057003)) ( *  ( +  ( +  sym79 -0.014879950322210789) sym79) 0.0)) ( *  ( +  ( +  sym80 -0.052302706986665726) sym80) 0.28130168329568017)) ( *  ( +  ( +  sym81 0.05550588294863701) sym81) 9.583208717914276)) ( *  ( +  ( +  sym82 0.010111577808856964) sym82) 5.949257922942345)) ( *  ( +  ( +  sym83 0.014394866302609444) sym83) 0.0)) ( *  ( +  ( +  sym84 -0.03077859804034233) sym84) 0.0)) ( *  ( +  ( +  sym85 0.02838655561208725) sym85) 9.467850453166463)) ( *  ( +  ( +  sym86 0.03556819260120392) sym86) 7.917534312154597)) ( *  ( +  ( +  sym87 0.0337003655731678) sym87) 0.0)) ( *  ( +  ( +  sym88 0.08779902756214142) sym88) 0.0)) ( *  ( +  ( +  sym89 0.004231369588524103) sym89) 11.821392483276925)) ( *  ( +  ( +  sym90 -0.005022559314966202) sym90) 0.0)) ( *  ( +  ( +  sym91 0.010422165505588055) sym91) 5.416095994018537)) ( *  ( +  ( +  sym92 0.00809408538043499) sym92) 7.471537429978599)) ( *  ( +  ( +  sym93 -0.0604233518242836) sym93) 2.9128005459469204)) ( *  ( +  ( +  sym94 0.001658178283832967) sym94) 2.737364768060056)) ( *  ( +  ( +  sym95 -0.020948922261595726) sym95) 0.0)) ( *  ( +  ( +  sym96 -0.04278474673628807) sym96) 9.42157413670517)) ( *  ( +  ( +  sym97 -0.07851139456033707) sym97) 0.0)) ( *  ( +  ( +  sym98 0.07729171961545944) sym98) 0.0)) ( *  ( +  ( +  sym99 0.05936732143163681) sym99) 0.0)) ( *  ( +  ( +  sym100 -0.06988496333360672) sym100) 5.552002412510497)) ( *  ( +  ( +  sym101 0.046313609927892685) sym101) 7.130207758335647)) ( *  ( +  ( +  sym102 0.03387874737381935) sym102) 0.0)) ( *  ( +  ( +  sym103 0.005799938458949327) sym103) 0.0)) ( *  ( +  ( +  sym104 -0.01823229156434536) sym104) 0.0)) ( *  ( +  ( +  sym105 -0.01790735311806202) sym105) 7.7243973463558735)) ( *  ( +  ( +  sym106 -0.06388019025325775) sym106) 4.437590337527237)) ( *  ( +  ( +  sym107 -0.056304994970560074) sym107) 0.0)) ( *  ( +  ( +  sym108 -0.06501694023609161) sym108) 0.15689685762970484)) ( *  ( +  ( +  sym109 -0.039581358432769775) sym109) 6.762651610834544)) ( *  ( +  ( +  sym110 0.03908183425664902) sym110) 12.02286891860464)) ( *  ( +  ( +  sym111 -0.020432215183973312) sym111) 0.0)) ( *  ( +  ( +  sym112 -0.002830826910212636) sym112) 0.0)) ( *  ( +  ( +  sym113 0.019255176186561584) sym113) 2.637306957999471)) ( *  ( +  ( +  sym114 -0.06255348026752472) sym114) 7.509631473444387)) ( *  ( +  ( +  sym115 0.04401831328868866) sym115) 5.099778199216871)) ( *  ( +  ( +  sym116 -0.01170608215034008) sym116) 0.0)) ( *  ( +  ( +  sym117 0.01059908326715231) sym117) 5.435331083543855)) ( *  ( +  ( +  sym118 -0.06968405842781067) sym118) 0.0)) ( *  ( +  ( +  sym119 -0.02011116035282612) sym119) 0.0)) ( *  ( +  ( +  sym120 0.03464094549417496) sym120) 0.0)) ( *  ( +  ( +  sym121 0.07001141458749771) sym121) 0.562618606308885)) ( *  ( +  ( +  sym122 0.04314605891704559) sym122) 2.8981204403318985)) ( *  ( +  ( +  sym123 -0.014200099743902683) sym123) 4.717144138007199)) ( *  ( +  ( +  sym124 0.004727040883153677) sym124) 2.4010608774553486)) ( *  ( +  ( +  sym125 -0.006370982620865107) sym125) 0.0)) ( *  ( +  ( +  sym126 -0.07469349354505539) sym126) 0.0)) ( *  ( +  ( +  sym127 0.001830282621085644) sym127) 3.313152954490163))\n" + 
			"2.8691964843848163\n" + 
			"4.229593688722583\n" + 
			"-5.721870726353002\n" + 
			"-1.1706733446704642\n" + 
			"-7.426497901205916\n" + 
			"-1.4526528356544512\n" + 
			"0.8604256462636367\n" + 
			"-2.115733139685415\n";
	public static void main(String[] args) throws  Exception {
		String inputFile = DNNt.path+"inputs\\inn15.txt";
		File file = new File(inputFile); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		double[][][] a = new double[IMG_HEIGHT][IMG_WIDTH][1];
		String st;
		while ((st = br.readLine()) != null) {
			String[] values = st.split(",");
			int index = 0;
			while (index < values.length) {
				for (int i = 0; i <  IMG_HEIGHT; i++)
					for (int j = 0; j < IMG_WIDTH; j++)
						for (int k = 0; k < 1; k++)
						{
							Double val = Double.valueOf(values[index]);
							index++;
							a[i][j][k] = (double)(val);
						}
			}
		}
		int original=0;
		mnist0.DNNt model = new mnist0.DNNt();    
		if(original==1) {
			System.out.println("OLD IMPLEMENTATION");
			DNN.readDataFromFiles(DNNt.path+"params\\");
			model.biases0 = DNN.getBiases0();
			model.biases2 = DNN.getBiases2();
			model.biases6 = DNN.getBiases6();
			model.biases8 = DNN.getBiases8();
			model.weights0 = DNN.getWeights0();
			model.weights2 = DNN.getWeights2();
			model.weights6 = DNN.getWeights6();
			model.weights8 = DNN.getWeights8();
		}
		else
		{
			System.out.println("NEW IMPLEMENTATION");
			DNNGeneralize.readDataFromFiles(DNNt.path+"params\\",DNNt.path+"mnist0.json");
			model.biases0 = (double[]) DNNGeneralize.get_data("biases0");
			model.biases2 = (double[]) DNNGeneralize.get_data("biases2");
			model.biases6 = (double[]) DNNGeneralize.get_data("biases6");
			model.biases8 = (double[]) DNNGeneralize.get_data("biases8");
			model.weights0 = (double[][][][]) DNNGeneralize.get_data("weights0");
			model.weights2 = (double[][][][]) DNNGeneralize.get_data("weights2");
			model.weights6 = (double[][]) DNNGeneralize.get_data("weights6");
			model.weights8 = (double[][]) DNNGeneralize.get_data("weights8");
		}
		int label = model.run(a,1);
		System.out.println(DNNt.generatedconstraints);
		assert(DNNt.generatedconstraints.equals(originalconstraints));
		System.out.println("Test 1 Passed");
	}
}
